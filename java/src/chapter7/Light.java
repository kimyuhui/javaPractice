package chapter7;

import java.util.Scanner;

public class Light extends Remote {
	int lightLevel = 1;
	Scanner sc = new Scanner(System.in);
	
	
	void powerOn (int lightLevel) {
		System.out.println("전등이 켜졌습니다");
		this.lightLevel++;
		System.out.println("현재 밝기는 " + this.lightLevel + "단계 입니다.");
	}
	
	void lightLevelUp(int lightLevel) {
		this.lightLevel++;
		if(this.lightLevel > 7) {
			System.out.println("더 올릴 수 없습니다");
			this.lightLevel--;
		} else {
		System.out.println("현재 밝기는 " + this.lightLevel + "단계 입니다.");
		}
	}
	
	
	void lightLevelDown(int lightLevel) {
		this.lightLevel--;
		if(this.lightLevel < 1) {
			System.out.println("더 내릴 수 없습니다");
			this.lightLevel++;
		} else {
		System.out.println("현재 밝기는 " + this.lightLevel + "단계 입니다.");
		}
	}
	
}
