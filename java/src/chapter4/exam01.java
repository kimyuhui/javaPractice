package chapter4;

import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		
		// 조건문 : 조건을 만족하거나 만족하지 않을 때 실행
		// if () { 조건을 만족 시 실행할 문장들 }
		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		int x = Integer.parseInt(sc.nextLine()); //scanner로 입력받으면 string으로 저장되어 int로 바꿔줌
//		
//		if(x % 2 == 0) {
//			System.out.println("이 숫자는 짝수입니다.");
//		}else {
//			System.out.println("이 숫자는 홀수입니다.");
//		}
		
//		if (x >= 100) {
//			System.out.println("이 숫자는 100 이상입니다.");
//		}
		
		System.out.print("가위, 바위, 보 중 하나를 입력해 주세요. : ");
		String s = sc.nextLine(); //콘솔에 치는걸 s에 저장하겠다
		int result = 0; //result라는 그릇을 만들고 이상한 값이 담기지 않게 하려고 0을 입력해놓음
		
		System.out.println("입력한 값 : " + s);
		
		//가위 : 1
		//바위 : 2
		//보 : 3
//		System.out.println(s.equals("가위"));
//		System.out.println("가위".equals(s));
		
		if (s.equals("가위")) { // 괄호 내용이 true인지 false인지 봄
			result = 1; //s가 가위라는 글자와 같다면(true라면) 중괄호에 있는 내용을 실행하겠다
		} 
		else if (s.equals("바위")) { //가위가 아닌것중에 조건을 걸고싶음 else if - 위의 내용이 false인 경우에서 또 조건
			result = 2; //s = 바위라면 result를 실행하겠다 
		}
		else if (s.equals("보")) {
			result = 3;
		} else {
			System.out.println("잘못된 값이 입력되었습니다");
		}
		System.out.println("result : " + result);
		
		
		int a = sc.nextInt();
		
		if(a >= 3) {
			System.out.println("a는 3보다 크거나 같다");
		}else if(a >= 0) {
			System.out.println("a는 3보다 작으면서 0보다 크거나 같다");
		}else {
			System.out.println("a는 0보다 작다!");
		}
		
	}
	

}
