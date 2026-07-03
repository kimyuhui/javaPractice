package chapter2;

import java.util.Random;
import java.util.Scanner;

public class exam02 {

											//throws Exception - 예외나 오류가 발생 시 넘기기
	public static void main(String[] args) throws Exception {
		/** 기본타입 - 정수형
		 * byte : 1byte -> 256개 > -128~127
		 * short : 2byte -> 65536 > -32768~32767
		 * int : 4byte -> 2의 32제곱 
		 * long : 8byte -> 2의 64제곱 (int 범위를 벗어나는 숫자는 L 표시)
		 * 
		 * char(문자형) : 2byte(유니코드) -> 0~65536
		 * 
		 * 기본타입 - 실수형
		 * float : 4byte (소수점 사용 시 f 표시)
		 * double : 8byte
		 * 
		 * 클래스 타입 (기본 타입이 아닌 것)
		 * String : 문자열 (크기 제한 X)
		 */
		
		/* 논리형
		 * boolean : 2가지 종류의 값 (true / false)
		 */
	
		int a = 3, b = 5;
		boolean result = a < b;
		//System.out.println(result);
		
		// 타입변환
		int num1;
		short num2 = 10;
		
		//자동형변환 (작은 타입 > 큰 타입 대입)
		num1 = num2;
		//System.out.println(num1);
		
		//강제형변환 ( 큰 타입 > 작은 타입 대입)
		num1 = 50;
		num2 = (short)num1;
		
		// 작은 타입 --------------------------------- 큰 타입
		// byte < short(char) < int < long < float < double
		// string은 기본 타입이 아니기 때문에 빠져 있음 -> int로 바꾸려면 함수를 사용해야 한다
		
		char ch = 'A';
		int num3 = ch;
		
		//System.out.println("num3: " + num3);
		
		byte bt1 = 10, bt2 = 20;
		//System.out.println("bt1: " + bt1 + " bt2: " + bt2);
		
		byte btsum = (byte)(bt1 + bt2);
		//System.out.println(btsum);
	
		//100p 예제 생각더하기
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		
		long sum = value1 + value2 + value3;
		System.out.println(sum);
		
		
		System.out.println("result : " + value1 + value2 + value3);
		System.out.println("result : " + (value1 + value2 + value3));
		System.out.printf("result : %d\n", (value1 + value2 + value3));
		System.out.println("1" + 5);
		System.out.println(Integer.parseInt("1") + 5);
		
		// print
		// println > ln : line(한 줄)
		// printf > f : format(형식)
		// ♥♡♥♡-> 형식지정자 %d(정수) %f(실수) %s(문자열 - string) %c(문자 - char?)...♥♡♥♡
		
		System.out.printf("printf result : %d + %d + %d = %d\n", 
				value1, value2, value3, value1 + value2 + value3);
		// %d 자리에 내가 뒤에 넣은 순서대로 들어감, C언어에는 println이 없기 때문에 이걸 기본형으로 사용
		
		String st1 = "My name is";
		String name = "Yuhui";
		String st2 = " and I'm";
		int age = 28;
		String st3 = "years old.";
		
		// My name is Yuhui and I'm 28 years old
		System.out.printf("%s %s%s %d %s\n", st1, name, st2, age, st3);
		
		
		int year = 2026;
		int month = 6;
		int day = 29;
		
		//_ _ _ _ _ _ _ 1 2 3 -> 10칸 만들어놓고 글자 채워넣기
		System.out.printf("%10d원\n", 123);
		System.out.printf("%10d원\n", 12345);
		System.out.printf("%10d원\n", 1234567);
		System.out.printf("%10d원\n", 1234);
		System.out.printf("%10d원\n", 12356);
		
//		int keycode = System.in.read();
//		System.out.println("keycode : " + keycode);
//		// 123을 적으면 49 출력 (맨 앞글자만 나옴)
//		System.out.printf("keycode : %c\n", keycode);
//		// 1을 적으면 1, 9를 적으면 9로 출력 
//		// 한글은 인식을 못함 -> 숫자, 영어 인식 할때만 거의 사용함
		
		Scanner scanner = new Scanner(System.in);
		// Scanner > Ctrl + space > java.util 선택
		// -> Java에서 제공하는 Scanner 기능을 사용하겠다
		String inputName = scanner.nextLine();
		System.out.println(inputName);
		

			}

	
		
		
		
	}
