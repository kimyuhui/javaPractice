package chapter7;

public class Light extends Remote {
	int lightLevel;
	

	void lightLevel(int lightLevel) {
		System.out.println("현재 밝기는 " + this.lightLevel + "단계 입니다.");
	}
	
}
