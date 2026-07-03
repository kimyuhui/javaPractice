package chapter4;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		
		
		// for = 횟수 정해놓고 돌릴 때
//	int sum = 0;
//	for(int i = 1; i <= 10; i++) {
//		System.out.println("sum : " + sum);
//		System.out.println("i : " + i);
//		sum = sum + i;
//		System.out.println("계산 후의 sum: " + sum);
//		System.out.println("--------------반복할 내용 끝--------------");
//		}
		
		
		
		//while : 사용자와 소통하는 상황, 입력을 주고받을 때 while을 사용
//		String input = "";
//		Scanner sc = new Scanner(System.in);
//		int i = 0;
//		int sum = 0;
//		while(!input.equals("q")) {
//			System.out.println("종료하시려면 q를 입력하세요.");
//			input = sc.nextLine();
//			System.out.println("input에는 " + input + "이 입력되었습니다.");
//			}
		
//		long j = 0;
//		long sum1 = 0;
//		while(j <= 30000000l) {
//			System.out.println("i: " + sum1 + j);
//			j++;
//		}
		
		int sum = 0;
		for(int i = 4; i <= 10; i++) {
			for(int j = 5; i <= 10; j++) {
				sum = (4 * i) + (5 * j);
				if(sum == 60) {
				System.out.println(i + j + sum);}
				else {}
			}
			
			
		}

		
		}
		
	
	
	}
	
		



