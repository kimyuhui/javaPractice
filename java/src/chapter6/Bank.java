package chapter6;

import java.util.Scanner;

public class Bank {

	private static final String[][] String = null;




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정보 담을 변수
		String[][] info = new String[100][3];
		int a = 0;

		boolean run = true;
		
		while(run == true) {
			messege();
			int button = sc.nextInt();
			
				if(button == 1) {
					
				}
				
				else if(button == 2) {
					
				}
				
				else if(button == 3) {
					System.out.println("3");
				}
				
				else if(button == 4) {
					System.out.println("4");
				}
				
				else if(button == 5) {
					System.out.println("5");
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
					+ "===========================");
	}
	
	
	
	
	public static void person(String[][] info, int a) {
		Scanner sc = new Scanner(System.in);
		a = 0;
		
		
		System.out.println("이름을 입력하세요");
		String name = sc.next();

		System.out.println("계좌번호를 입력하세요");
		String account = sc.next();

			info[a][0] = name;
			info[a][1] = account;
			a++;

			System.out.println("이름: " + info[a][0]);
			System.out.println("계좌번호: " + info[a][1]);
			return;
		
	}

	
}
