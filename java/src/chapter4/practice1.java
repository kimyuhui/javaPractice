package chapter4;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		/**
		 * <미니 계산기 만들기>
		 * - 조건 -
		 * 1. 계산은 덧셈, 뺄셈, 곱셈, 나눗셈만 잘 동작하면 됨
		 * 2. 숫자 두 개는 입력받기
		 * 3. 간단한 설명 출력해주기 (어떻게 작동하는지 설명)
		 * 4. 코드마다 주석 달기
		 * 5. 소수로도 계산이 가능해야 함 
		 * 6. 출력 형태는 소수점 둘째자리까지만
		 * 
		 */
		
		Scanner sc = new Scanner(System.in); //Scanner 기능을 사용해서 Console에 입력하는 글을 인식하겠다
		System.out.print("첫 번째 숫자: ");
		double num1 = sc.nextDouble(); //소수점까지 계산할 수 있어야 하므로 실수형인 Double 사용
		
		System.out.println("1. +  2. -  3.  *  4. /");
		System.out.print("무엇을 하시나요? (숫자로): ");
		int int1 = sc.nextInt(); //부호를 선택하여 숫자로 입력하게 하기
		
		if(int1 > 4 || int1 < 1) {
			System.out.println("잘못된 값을 입력하셨습니다");}  // int1이 1~4 외의 숫자일 시 해당 문구 출력
		
		else { //int1이 1~4의 숫자로 옳게 입력됐을 경우
		
		System.out.print("두 번째 숫자: ");
		double num2 = sc.nextDouble();
		
		if(int1 == 1) {
			System.out.printf("답: %.2f", (num1 + num2)); //소수점 둘째자리까지 출력되게 해야 하므로 %.2f를 사용함
			                                             // *printf -> 괄호 안의 첫 번째 문자열 형식대로 내용 출력하기
		}  //%.2f <= f는 float의 f
		else if(int1 == 2) {
			System.out.printf("답: %.2f", (num1 - num2));
		}
		else if(int1 == 3) {
			System.out.printf("답: %.2f", (num1 * num2));
		}
		else if(int1 == 4) { 
			if(num2 == 0) { //두 번째 숫자가 0일 경우 아래 문구가 출력되도록 함 : else 뒤에 이것을 적으면 (답: %.2f) 부분이 먼저 계산되어 함께 출력되므로 위에 적기
				System.out.println("계산할 수 없는 식입니다");}
			else { //두 번째 숫자가 0이 아닐 경우 정상적으로 나눗셈이 되도록 함
			System.out.printf("답: %.2f", (num1 / num2));
			} 
		} 
		}
		
//		switch(int1) { 
//		case 1 :
//			System.out.println("계산결과 : %.2f", num1 + num2);
//			break;
//		case 2 :
//			System.out.println("계산결과 : %.2f", num1 - num2);
//			break;
//		case 3 :
//			System.out.println("계산결과 : %.2f", num1 * num2);
//			break;
//		case 4 :
//			System.out.println("계산결과 : %.2f", num1 / num2);
//			break;
//		default:
//				System.out.println("잘못된 기호입니다");
//		} 
	
		
	}
}
