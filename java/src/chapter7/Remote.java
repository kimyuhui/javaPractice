package chapter7;

public class Remote {
	boolean power; //현재 상태를 true / false로 나타내기 위해 boolean으로 power 필드 선언
	
	void powerOn () { //powerOn일 때 power = true
		power = true; 
		System.out.println("전원을 켭니다");
	}
	
	void powerOff() { //powerOff일 때 power = false
		power = false;
		System.out.println("전원을 끕니다");
	}
	
}
