package chapter3;

import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		/* 
		 * 연산자란??
		 *     a      +       b
		 *  피연산자  연산자  피연산자
		 * <연산자>
		 * 단항연산자 : 항이 한 개인 식
		 *   ex) a++. !a...
		 * 이항연산자 : 항이 두 개인 식
		 *   ex) a + b, a - b ...
		 * 삼항연산자 : 항이 세 개인 식
		 *   ex) x == 3 ? a : b
		 *   
		 */
		
		// 증감연산자(++, --)
		int a = 100;
		int b1 = ++a; // ++를 먼저 계산한 후 대입한다
		int b2 = a++; // 대입하고나서 ++를 계산한다
		
		System.out.println("a : " + a + " / b1 : " + b1 + " / b2 : " + b2);
		
		int x = 10;
		int y = 20;
		
		// x++
		// x = x + 1
		
		int result = ++x + y--;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("result : " + result);
		
		// 논리 부정 연산자(!)
		boolean r = x > y;
		System.out.println("r : " + r);
		boolean r2 = !r;
		System.out.println("r2 : " + r2);
		// true - > false로, false - > true로
		
		
		// 이항연산자
		// 산술연산자 : 사칙연산
		// % : 나머지 계산
		int p = 15 % 4; // 15를 4로 나눈 나머지
		System.out.println("p : " + p);
		
		
		// 결합연산자(문자열) : +
		// 문자열에서 + 기호 사용 시 문자 연결이 된다
		String str = "x: " + x + y;
		System.out.println(str);
		
		// 비교연산자 : == != >= <= > < → true / false
		boolean b = x > y;
		System.out.println("b : " + b);
		
		String str1 = "Apple";
		String str2 = "I like Apple"; // 다른 공간에 있는 Apple을 가져오려고 다른 내용 저장함
		String str3 = str2.split(" ")[2]; // str2를 공백 기준으로 자른 내용의 세번째 내용을 str3에 담기게 함 (0~2)
		System.out.println(str3);
		
		System.out.println(str1 == str3); // 메모리 주소 비교
		System.out.println(str1.equals(str3)); // 내용 비교
		
		// 논리 연산자 : && || & | ^ !
		// 논리곱 : && & → 모두 true이면 true
		// boolean ba = 10 < 20 && 5 > 3; // 하나라도 거짓이 있으면 false로 나옴 전부 true여야 됨
		boolean ba = x >= 3 && y <= 3;
		System.out.println("ba: " + ba);
		
		//논리합 : || | → 둘 중 하나라도 true이면 true
		boolean bb = x >= 3 || y <= 3;
		System.out.println("bb: " + bb);
		
		int i = 5;
		int j = 8;
		if (i % 2 == 0 && j % 2 == 0) {
			System.out.println("i와 j는 모두 짝수입니다.");
		} 
		
		if (i % 2 == 0 || j % 2 == 0) {
			System.out.println("i와 j는 모두 짝수입니다.");
		}
		
		
		// 대입연산자(=)
		int k = 3;
		int l = 5;
		l += k;
		System.out.println("l: " + l);
		l = l + k;
		System.out.println("l: " + l);
		
		/* 
		 * 복합 대입 연산자
		 * += : 더해서 대입 l = l + k
		 * -+ : 빼서 대입 l = l - k
		 * *= : 곱해서 대입 l = l * k
		 * /= : 나눠서 대입 l = l / k
		 * %= : 나눈 나머지를 대입
		 * 
		 */
		
		// 삼항 연산자
		
		
		int value = 356;
		System.out.println(value - (value%100));
		
		double var1 = 10;
		double var2 = var1 / 100;
		System.out.println(var2);
		if(var2 == 0.1) {
			System.out.println("10%입니다.");
		} else {
			System.out.println("10%가 아닙니다.");
		}
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthTop + lengthBottom) * height);
		System.out.println(area);
		
		
		float f1 = 0.1f;
		System.out.printf("%.15f\n", f1);
		// float : 미세한 오차가 있음 
		// double은 float에 비해 정확도가 2배
		
		

		
	}

}
