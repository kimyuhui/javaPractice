package chapter7;

import java.util.Random;
import java.util.Scanner;

public class RemoteControler {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		AirConditioner air = new AirConditioner();
		Television tv = new Television();
		Light lg = new Light();
		
		int temper = (int)(Math.random() * 30) + 20;
		System.out.println("temper: " + temper);
		
		boolean boo = true;
		while(boo = true) {
			message();
			int selectMenu = sc.nextInt();
			if(selectMenu == 4) {
				boo = false;
				break;
			}
			
		while(true)
		switch(selectMenu) {
		case 1:
			airMessage();
			int selectMenu1 = sc.nextInt();
				if(selectMenu1 == 1) {
					air.powerOn(temper);
					continue;
				} else if (selectMenu1 == 2) {
					air.powerOff();
					continue;
				} else if (selectMenu1 == 3) {
					air.tempUp();
					continue;
				} else if (selectMenu1 == 4) {
					air.tempDown();
					continue;
				} else if (selectMenu1 == 5) {
					break;
				}
				
		case 2:
			tvMessage();
			int selectMenu2 = sc.nextInt();
				if(selectMenu2 == 1) {
					tv.powerOn(0);;
				} else if (selectMenu2 == 2) {
					tv.powerOff();
				} else if (selectMenu2 == 3) {
					tv.changeChannel();
				} else if (selectMenu2 == 4) {
					tv.changeVolumn();
				} 
				break;
				
		case 3:
			lightMessage();
			int selectMenu3 = sc.nextInt();
				if(selectMenu3 == 1) {
					lg.powerOn();
				}
				if(selectMenu3 == 2) {
					lg.powerOff();
				}
				if(selectMenu3 == 3) {
					lg.lightLevel(0);
				} 
				break;
				} 
		}
		
	}
	
	static void message() {
		System.out.println("============");
		System.out.println("1. 에어컨");
		System.out.println("2. TV");
		System.out.println("3. 전등");
		System.out.println("4. off");
		System.out.println("============");
	}

	static void airMessage() {
		System.out.println("1. 에어컨 켜기");
		System.out.println("2. 에어컨 끄기");
		System.out.println("3. 온도 올리기");
		System.out.println("4. 온도 내리기");
	}
	
	static void tvMessage() {
		System.out.println("1. TV 켜기");
		System.out.println("2. TV 끄기");
		System.out.println("3. 채널 돌리기");
		System.out.println("4. 볼륨 조절");
	}
	
	static void lightMessage() {
		System.out.println("1. 전등 켜기");
		System.out.println("2. 전등 끄기");
		System.out.println("3. 밝기 조절");
	}
}
