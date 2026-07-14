package chapter7;

public class AirConditioner extends Remote {
	int temp = 20;
	
	void powerOn(int temp) {
		System.out.println("에어컨이 켜졌습니다.");
		System.out.println("현재 설정된 온도는 " + this.temp + "도 입니다.");
		this.function = true;
	}
		
	void tempUp(int temp) {;
		this.temp++;
		if(this.temp > 28) {
			System.out.println("최대 온도 설정입니다");
			this.temp--;
		} else {
		System.out.println("온도를 올립니다.");
		System.out.println("현재 온도는 " + this.temp + "도 입니다.");
		}
	}
	
	void tempDown(int temp) {
		this.temp--;
		if(this.temp < 18) {
			System.out.println("최저 온도 설정입니다");
			this.temp++;
		} else {
		System.out.println("온도를 내립니다.");
		System.out.println("현재 온도는 " + this.temp + "도 입니다.");
		}
	}
	
}
