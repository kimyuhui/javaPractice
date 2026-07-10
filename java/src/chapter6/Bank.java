package chapter6;

import java.util.Scanner;

public class Bank {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정보 담을 변수
		String[][] info = new String[100][3];
		int a = 0;
		int b = 0;

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
					System.out.println("얼마를 입금하시겠습니까");
					b = sc.nextInt();
					int result1 = sum(info, a, b);
					System.out.println("잔액: ");
				}	
				
				else if(button == 4) {
					
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
	
	
	
	
	public static int person(String[][] info, int a) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		info[a][0] = name;

		System.out.println("계좌번호를 입력하세요");
	
			for(int i = 0; i < a; i++) {
				String account = sc.next();
				info[i][1] = account;
					for(int j = 0; j < i; j++) {
						if(info[i][1] == info[j][1]) {
							System.out.println("중복된 계좌입니다");
						} else {
							System.out.println("이름: " + info[a][0]);
							System.out.println("계좌번호: " + info[a][1]);
							a++;	
						
					}		
			
			}

	
			}
			return a;
			
		
	}

	public static void accountList(String[][] info, int a) {
		for(int i = 0; i < a; i++) {
			System.out.println(i+1 + ". " + info[i][1]);
		}		
	}
	
	static int sum(String[][] info, int a, int b) {
		
		int result = Integer.parseInt(info[a][2]) + b;		
		return result;
	}
	
}
