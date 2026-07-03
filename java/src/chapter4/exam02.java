package chapter4;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		System.out.println("메뉴를 선택해주세요 (1~4 입력)");
		System.out.println("------------------------");
		System.out.println("1. 아메리카노 (HOT)");
		System.out.println("2. 아메리카노 (ICE)");
		System.out.println("3. 카페라떼 (HOT)");
		System.out.println("4. 카페모카 (HOT)");	
		System.out.println("------------------------");
		System.out.print("메뉴 입력: ");

		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
//		if (menu == 1) {
//			System.out.println("아메리카노(HOT)를 선택하셨습니다.");
//		} else if (menu == 2) {
//			System.out.println("아메리카노(ICE)를 선택하셨습니다.");
//		} else if (menu == 3) {
//			System.out.println("카페라떼(HOT)을 선택하셨습니다.");
//		} else if (menu == 4 ) {
//			System.out.println("카페모카(HOT)을 선택하셨습니다.");
//		} else {
//			System.out.println("잘못된 메뉴를 선택하셨습니다.");
//		}
		
		/*
		 * switch문
		 * switch(변수){
		 * case ~ :  
		 * 		//case에 해당되면 실행할 문장 - 정수, 실수, char, string 올 수 있음
		 * 
		 * 
		 * ※ case에 입력해주는 값은 변수의 자료형과 맞춰서 작성해 주어야 한다
		 * ※ 각 case들의 마지막에 break;를 넣어주지 않는다면 중단하지 않고 계속 진행된다
		 * ※ switch문은 단순 동등 비교밖에 못함 (대소 비교 X)
		 * 
		 * 
		 */
		
		
		// ↑ 위의 if 코드와 같은 동작 수행함 ↓
		// 조건이 단순한 경우 사용 : 대부분 if를 사용함
		
		
		
		switch(menu) {
		case 1:
			System.out.println("아메리카노(HOT)를 선택하셨습니다.");
			break; //break를 안 넣으면 해당되는 케이스가 있어도 멈추지 않고 끝까지 실행함
		case 2:
			System.out.println("아메리카노(ICE)를 선택하셨습니다.");
			break;
		case 3:
			System.out.println("카페라떼(HOT)를 선택하셨습니다.");
			break;
		case 4:
			System.out.println("카페모카(HOT)를 선택하셨습니다.");
			break;
		default:
			System.out.println("잘못된 메뉴를 선택하셨습니다.");
		}
	}

}
