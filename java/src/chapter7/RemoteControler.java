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
			
		boolean boo = true;
		while(boo == true) {
			message();
			int selectMenu = sc.nextInt();
			if(selectMenu == 4) {
				boo = false;
				System.out.println("리모콘을 끕니다.");
				break;
			}
			
			switch(selectMenu) {
			case 1:
				while(true) {
					airMessage();
					int selectMenu1 = sc.nextInt();
					if(selectMenu1 == 1) {
						air.powerOn(air.temp);
					} else if (selectMenu1 == 3) {
						air.tempUp(air.temp);
					} else if (selectMenu1 == 4) {
						air.tempDown(air.temp);
					} else if (selectMenu1 == 2) {
						System.out.println("에어컨을 끕니다.");
						air.function = false;
						break;
					}
				} break;


			case 2:
				while(true) {
					tvMessage();
					int selectMenu2 = sc.nextInt();
					if(selectMenu2 == 1) {
						tv.powerOn(tv.channel, tv.volumn);;
					} else if (selectMenu2 == 3) {
						tv.changeChannelUp(tv.channel);
					} else if (selectMenu2 == 4) {
						tv.changeChannelDown(tv.channel);
					}
					  else if (selectMenu2 == 5) {
						tv.changeVolumnUp(tv.volumn);
					} else if (selectMenu2 == 6)  {
						tv.changeVolumnDown(tv.volumn);
					}
					else if (selectMenu2 == 2) {
						System.out.println("티비를 끕니다.");
						break;
					}
				} break;

			case 3:
				while(true) {
					lightMessage();
					int selectMenu3 = sc.nextInt();
					if(selectMenu3 == 1) {
						lg.powerOn(lg.lightLevel);
					}
					else if(selectMenu3 == 3) {
						lg.lightLevelUp(lg.lightLevel);
					} 
					else if(selectMenu3 == 4) {
						lg.lightLevelDown(lg.lightLevel);
					}
					else if(selectMenu3 == 2) {
						System.out.println("전등을 끕니다.");
						break;
					}
				} 
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
		System.out.println("3. 채널 올리기");
		System.out.println("4. 채널 내리기");
		System.out.println("5. 볼륨 올리기");
		System.out.println("6. 볼륨 내리기");
	}
	
	static void lightMessage() {
		System.out.println("1. 전등 켜기");
		System.out.println("2. 전등 끄기");
		System.out.println("3. 밝기 올리기");
		System.out.println("4. 밝기 내리기");
	}
}
