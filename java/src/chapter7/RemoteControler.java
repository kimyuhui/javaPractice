package chapter7;

import java.util.Scanner;

public class RemoteControler {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		AirConditioner air = new AirConditioner();
		Television tv = new Television();
		Light lg = new Light();

		boolean boo = true;

		//5가 입력되면 boo = false가 되어 while문이 중단됨

		while(boo == true) {
			message(); //전체 메뉴를 숫자로 입력받음
			int selectMenu = sc.nextInt();

			if(selectMenu == 5) { //while문 중단
				boo = false;
				System.out.println("리모콘을 끕니다.");
				break;
			}

			switch(selectMenu) {
			case 1: // 에어컨 메뉴
				while(true) {
					airMessage();
					System.out.println("현재 온도: " + air.temp);
					int selectMenu1 = sc.nextInt();
					if(selectMenu1 == 1) {
						air.powerOn(air.temp);
					} else if (selectMenu1 == 3) {
						air.tempUp(air.temp);
					} else if (selectMenu1 == 4) {
						air.tempDown(air.temp);
					} else if (selectMenu1 == 5) {
						break;
					}	
					else if (selectMenu1 == 2) {
						air.powerOff();
						break;
					}
				} break;


			case 2: // 티비 메뉴
				while(true) {
					tvMessage();
					int selectMenu2 = sc.nextInt();
					System.out.println("현재 채널 및 볼륨: " + tv.channel + "채널 " + tv.volumn + "볼륨");
					if(selectMenu2 == 1) {
						tv.powerOn(tv.channel, tv.volumn);;
					} else if (selectMenu2 == 3) {
						tv.changeChannelUp(tv.channel);
					} else if (selectMenu2 == 4) {
						tv.changeChannelDown(tv.channel);
					} else if (selectMenu2 == 5) {
						tv.changeVolumnUp(tv.volumn);
					} else if (selectMenu2 == 6)  {
						tv.changeVolumnDown(tv.volumn);
					} else if (selectMenu2 == 7) {
						break;
					} else if (selectMenu2 == 2) {
						tv.powerOff();
						break;
					}
				} break;

			case 3: // 전등 메뉴
				while(true) {
					lightMessage();
					System.out.println("현재 밝기 레벨: " + lg.lightLevel);
					int selectMenu3 = sc.nextInt();
					if(selectMenu3 == 1) {
						lg.powerOn(lg.lightLevel);
					} else if(selectMenu3 == 3) {
						lg.lightLevelUp(lg.lightLevel);
					} else if(selectMenu3 == 4) {
						lg.lightLevelDown(lg.lightLevel);
					} else if(selectMenu3 == 5) {
						break;
					} else if(selectMenu3 == 2) {
						lg.powerOff();
						break;
					}
				} 

			case 4: // 현재 켜져 있는 기능 확인 - if문을 이용하여 true면 On, false면 Off로 출력되도록 함 
				if(air.power == true) {
					System.out.println("에어컨 On");
				} else if (air.power == false) {
					System.out.println("에어컨 Off");
				}

				if(tv.power == true) {
					System.out.println("티비 On");
				} else if (tv.power == false) {
					System.out.println("티비 Off");
				}

				if(lg.power == true) {
					System.out.println("전등 On");
				} else if (lg.power == false) {
					System.out.println("전등 Off");
				}
			}
		}

	}
	
	// 메뉴 문구들
	
	static void message() {
		System.out.println("============");
		System.out.println("1. 에어컨");
		System.out.println("2. TV");
		System.out.println("3. 전등");
		System.out.println("4. 현재 켜져 있는 기능 확인");
		System.out.println("5. off");
		System.out.println("============");
	}

	static void airMessage() {
		System.out.println("1. 에어컨 켜기");
		System.out.println("2. 에어컨 끄기");
		System.out.println("3. 온도 올리기");
		System.out.println("4. 온도 내리기");
		System.out.println("5. 전체 리모콘으로");
	}
	
	static void tvMessage() {
		System.out.println("1. TV 켜기");
		System.out.println("2. TV 끄기");
		System.out.println("3. 채널 올리기");
		System.out.println("4. 채널 내리기");
		System.out.println("5. 볼륨 올리기");
		System.out.println("6. 볼륨 내리기");
		System.out.println("7. 전체 리모콘으로");
	}
	
	static void lightMessage() {
		System.out.println("1. 전등 켜기");
		System.out.println("2. 전등 끄기");
		System.out.println("3. 밝기 올리기");
		System.out.println("4. 밝기 내리기");
		System.out.println("5. 전체 리모콘으로");
	}
}
