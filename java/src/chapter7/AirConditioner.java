package chapter7;

public class AirConditioner extends Remote {
	int temp;
	
	void powerOn(int temp) {
		System.out.println("에어컨이 켜졌습니다.");
		System.out.println("현재 설정된 온도는 " + this.temp + "도 입니다.");
	}
		
	void tempUp(int temp) {
		System.out.println("온도를 올립니다.");
		System.out.println("현재 온도는 " + this.temp + "도 입니다.");
	}
	
	void tempDown(int temp) {
		System.out.println("온도를 내립니다.");
		System.out.println("현재 온도는 " + this.temp + "도 입니다.");
	}
	
}
