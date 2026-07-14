package practiceabs;

import java.util.Scanner;

public class LightPrac extends RemotePrac {
	int i = 1;
	Scanner sc = new Scanner(System.in);

	
	public void powerOn(int i) {
		if(power == true) {
			System.out.println("전등이 이미 켜져있습니다");
			return;
		}

		power = true;
		System.out.println("전등이 켜졌습니다");
		System.out.println("현재 밝기는 " + this.i + "단계 입니다.");
	}
	

	void lightLevelUp(int lightLevel) {
		if(power == false) {
			System.out.println("전등이 켜져 있지 않습니다.");
		} else if(power == true) {
			this.i++;
			if(this.i > 7) { //전등의 최대 밝기를 7로 설정해둠
				System.out.println("더 올릴 수 없습니다");
				this.i--;
			} else {
				System.out.println("현재 밝기는 " + this.i + "단계 입니다.");
			}
		}
	}


	void lightLevelDown(int lightLevel) {
		if(power == false) {
			System.out.println("전등이 켜져 있지 않습니다.");
		} else if(power == true) {
			this.i--;
			if(this.i < 1) { //전등의 최소 밝기를 1로 설정해둠 
				System.out.println("더 내릴 수 없습니다");
				this.i++;
			} else {
				System.out.println("현재 밝기는 " + this.i + "단계 입니다.");
			}
		}
	}


	@Override
	public void powerOff() {
		System.out.println("전등을 끕니다");
		power = false;
		
	}

}

