package chapter7;

public class AirConditioner extends Remote {
	int temp = 20; // 초기 온도를 20도로 설정함

	void powerOn(int temp) { 
		if(power == true) {
			System.out.println("에어컨이 이미 켜져있습니다");
			return;
		} //이미 에어컨이 켜져있는데 또 시도하면 해당 문구가 출력되도록 함

		power = true; //에어컨을 켜면 true 상태로 바뀌도록 함
		System.out.println("에어컨이 켜졌습니다.");
		System.out.println("현재 설정된 온도는 " + this.temp + "도 입니다.");
	}

	void tempUp(int temp) {
		if(power == false) { // 에어컨이 켜져 있지 않을 때 해당 문구 출력되도록 함
			System.out.println("에어컨이 켜져있지 않습니다.");
		} else if (power == true) {
			if(this.temp > 29) {
				System.out.println("최대 온도 설정입니다");
			} else {this.temp++;
				System.out.println("온도를 올립니다.");
				System.out.println("현재 온도는 " + this.temp + "도 입니다.");
			}
		}
	}

	void tempDown(int temp) {
		if(power == false) { 
			System.out.println("에어컨이 켜져있지 않습니다.");
		} else if (power == true) {
			if(this.temp < 18) {
				System.out.println("최저 온도 설정입니다");
			} else {this.temp--;
				System.out.println("온도를 내립니다.");
				System.out.println("현재 온도는 " + this.temp + "도 입니다.");
			}
		}
	}

}
