package chapter7;

import java.util.Scanner;

public class Television extends Remote {
	Scanner sc = new Scanner(System.in);
	int channel = 8;
	int volumn = 10;



	void powerOn(int channel, int volumn) {
		System.out.println("티비 전원이 켜졌습니다.");
		System.out.println("현재 채널은 " + this.channel + "번 입니다.");
		System.out.println("현재 볼륨은 " + this.volumn + "입니다.");
	}

	//	void changeChannel(int channel) {
	//		System.out.println("몇 번으로 바꾸시겠습니까?");
	//		try {System.out.println("채널을 " + this.channel + "번으로 바꿉니다.");
	//		if(this.channel > 52 && this.channel < 1) {
	//			System.out.println("없는 채널입니다. ");}
	//		} catch (java.util.InputMismatchException this.channel) {
	//			System.out.println("잘못된 입력을 하셨습니다");
	//		}
	//		
	//	}

	void changeChannelUp (int channel) {
		this.channel++;
		if(this.channel > 50)
		{System.out.println("더 올릴 수 없습니다");
		this.channel--;
		} else {
			System.out.println("채널을 " + this.channel + "번으로 바꿉니다.");
		}
	}

	void changeChannelDown (int channel) {
		this.channel--;
		if(this.channel < 0) {
			System.out.println("더 내릴 수 없습니다");
			this.channel++;
		} else {
			System.out.println("채널을 " + channel + "번으로 바꿉니다.");
		}
	}


	void changeVolumnUp (int volumn) {
		System.out.println("현재 볼륨은 " + this.volumn +"입니다.");
		this.volumn++;
		if(this.volumn > 20) {
			System.out.println("더 올릴 수 없습니다.");
			this.volumn--;
		} else {
			System.out.println("볼륨을 " + this.volumn + "로 바꿉니다.");
		}
	}

	void changeVolumnDown (int volumn) {
		System.out.println("현재 볼륨은 " + this.volumn +"입니다.");
		this.volumn--;
		if(this.volumn < 0) {
			System.out.println("최저 볼륨입니다");
			this.volumn++;
		} else {
			System.out.println("볼륨을 " + this.volumn + "로 바꿉니다.");
		}
	}



}
