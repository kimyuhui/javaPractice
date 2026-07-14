package chapter7;

import java.util.Scanner;

public class Television extends Remote {
	Scanner sc = new Scanner(System.in);
	int channel;
	int volumn;
	
	
	
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
	
	void changeChannel(int channel) {
		System.out.println("채널을 " + channel + "번으로 바꿉니다.");
	}
	
	
	void changeVolumn(int volumn) {
		System.out.println("볼륨을 " + this.volumn + "로 바꿉니다.");
	}
	
	
	
}
