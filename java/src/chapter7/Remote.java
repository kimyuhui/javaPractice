package chapter7;

public class Remote {
	
	boolean function = true;
	
	void powerOn () {
		System.out.println("전원을 켭니다");
		this.function = true;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
		this.function = false;
	}
	
}
