package chapter7;

import java.util.Scanner;

public class Light extends Remote {
	int lightLevel;
	Scanner sc = new Scanner(System.in);
	

	void powerOn (int lightLevel) {
		System.out.println("전등이 켜졌습니다");
		System.out.println("현재 밝기는 " + this.lightLevel + "단계 입니다.");
	}
	
	void lightLevel(int lightLevel) {
		System.out.println("현재 밝기는 " + this.lightLevel + "단계 입니다.");
	}
	
}
