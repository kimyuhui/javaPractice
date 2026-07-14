package chapter7;

import java.util.Scanner;

public class Light extends Remote {
	int lightLevel = 1;
	Scanner sc = new Scanner(System.in);


	void powerOn (int lightLevel) {
		if(power == true) {
			System.out.println("전등이 이미 켜져있습니다");
			return;
		}

		power = true;
		System.out.println("전등이 켜졌습니다");
		System.out.println("현재 밝기는 " + this.lightLevel + "단계 입니다.");
	}

	void lightLevelUp(int lightLevel) {
		if(power == false) {
			System.out.println("전등이 켜져 있지 않습니다.");
		} else if(power == true) {
			this.lightLevel++;
			if(this.lightLevel > 7) { //전등의 최대 밝기를 7로 설정해둠
				System.out.println("더 올릴 수 없습니다");
				this.lightLevel--;
			} else {
				System.out.println("현재 밝기는 " + this.lightLevel + "단계 입니다.");
			}
		}
	}


	void lightLevelDown(int lightLevel) {
		if(power == false) {
			System.out.println("전등이 켜져 있지 않습니다.");
		} else if(power == true) {
			this.lightLevel--;
			if(this.lightLevel < 1) { //전등의 최소 밝기를 1로 설정해둠 
				System.out.println("더 내릴 수 없습니다");
				this.lightLevel++;
			} else {
				System.out.println("현재 밝기는 " + this.lightLevel + "단계 입니다.");
			}
		}
	}

}
