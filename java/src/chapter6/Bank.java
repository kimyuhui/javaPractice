package chapter6;

import java.util.Scanner;

public class Bank {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 정보 담을 변수
		String[][] info = new String[100][3];
		int a = 0;
		int b = 0;
		String name;

		boolean run = true;

		while(run == true) {
			messege();
			int button = sc.nextInt();

			if(button == 1) {
				a = person(info, a);

			}

			else if(button == 2) {
				accountList(info, a);

			}

			else if(button == 3) {

				accountCheck(info, a);
				checkPerson(info, a);
				sum(info, a, b);


			}	

			else if(button == 4) {

				accountCheck(info, a);
				checkPerson(info, a);
				minus(info, a, b);
			}

			else if(button == 5) {
				balance(info, a, b);
			}

			else if(button == 6) {
				System.out.println("이용해 주셔서 감사합니다");
				break;
			} 
		}

	}

	public static void messege(){
		System.out.println("====== 은행 업무 프로그램 ====== \r\n"
					+ " 1. 계좌 생성\r\n"
					+ " 2. 계좌 목록 조회\r\n"
					+ " 3. 입금\r\n"
					+ " 4. 출금\r\n"
					+ " 5. 잔액 조회\r\n"
					+ " 6. 종료\r\n"
					+ "==========================="
					+ "===========================\r\n"
					+ " 선택 > ");
	}
	
	public static int person(String[][] info, int a) {
		Scanner sc = new Scanner(System.in);


		System.out.println("이름을 입력하세요");
		String name = sc.next();


		System.out.println("계좌번호를 입력하세요");
		String account = sc.next();

		info[a][0] = name;
		info[a][1] = account;
		info[a][2] = "1000";


		for(int i = 0; i < a; i++) {
			if(info[i][1].equals(account)) {
				System.out.println("중복된 계좌입니다");
				return a;
			} 
		}
		System.out.println("===========계좌 등록==========");
		System.out.println("예금주: " + info[a][0]);
		System.out.println("계좌번호: " + info[a][1]);
		System.out.println("잔액: " + info[a][2] + " 원");
		a++;

		return a;
	}

	public static void accountList(String[][] info, int a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		System.out.println(name + "님의 계좌 목록");

		for(int i = 0; i < a; i++) {
			if(name.equals(info[i][0])) {
				System.out.print("- " + info[i][1]);
				System.out.println("      잔액: " + info[i][2]);
			}
			System.out.println();
		}		
	}
	
	static void accountCheck(String[][] info, int a) {
		Scanner sc = new Scanner(System.in);
			System.out.println("계좌번호를 입력하세요");
			String account = sc.next();
			for(int i = 0; i < a; i++) {
				if(account.equals(info[i][1])) {
					return;
				} if(!info[i][1].equals(account)) {
					System.out.println("입력하신 계좌는 없는 계좌입니다");
					
				
			}
		}
	}

	static void checkPerson(String[][] info, int a) {
		Scanner sc = new Scanner(System.in);
		int b = 0;

		for(int i= 0; i < 1; i++) {
			System.out.println(info[i][0] + " 님 맞습니까?");
			System.out.println("1. 예       2. 아니오");
		}
		int answer = sc.nextInt();

		if(answer == 1) {
			return;
		} else if(answer == 2 ) {
			accountCheck(info, a);
		}

	}

	static void sum(String[][] info, int a, int b) {

		int sumMoney = 0;
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		boolean sum = true;
		while(sum == true) {
			for(int i = 0; i < a; i++) {
				int money = Integer.parseInt(info[i][2]);
				System.out.println("입금하실 금액을 입력해 주세요");
				sumMoney = sc.nextInt();
				System.out.println(sumMoney + " 원 입금하십니까?");
				System.out.println("1. 예     2. 아니오");
				answer = sc.nextInt();
				if(answer == 1) {
					money += sumMoney;
					info[i][2] = String.valueOf(money);
					System.out.println("잔액: " + info[i][2]);
					return;
				} else if (answer == 2) {
					accountCheck(info, a);
				}
			}
		} 

	}
	
	
	static void minus(String[][] info, int a, int b) {
		int sumMoney = 0;
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		boolean sum = true;
		while(sum == true) {
			for(int i = 0; i < a; i++) {
				int money = Integer.parseInt(info[i][2]);
				System.out.println("출금하실 금액을 입력해 주세요");
				System.out.println("출금을 종료하시려면 0을 입력해주세요");
				sumMoney = sc.nextInt();
				if(sumMoney == 0) {return;}
				System.out.println(sumMoney + " 원 츨금하십니까?");
				System.out.println("1. 예     2. 아니오");
				answer = sc.nextInt();
				if(answer == 1) {
					if(money < sumMoney) {
						System.out.println("잔액이 부족합니다");
					} else if (money >= sumMoney) {
						money -= sumMoney;
						info[i][2] = String.valueOf(money);
						System.out.println("잔액: " + info[i][2]);
						return;
					}
				} else if (answer == 2) {
					accountCheck(info, a);
				}
			}
		} 

	}
	
	static void balance(String[][] info, int a, int b) {
		Scanner sc = new Scanner(System.in);
		System.out.println("계좌번호를 입력하세요");
		String account = sc.next();

		for(int i = 0; i < a; i++) {
			if(account.equals(info[i][1])) {
				System.out.print("- " + info[i][1]);
				System.out.println("      잔액: " + info[i][2]);
			}
			System.out.println();

		}

	}
}
