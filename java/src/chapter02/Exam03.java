package chapter02;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		String name = "감자바";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";

		System.out.println("이름: " + name);
		System.out.print("나이: " + age + "\n");
		System.out.printf("전화: %s-%s-%s", tel1, tel2, tel3);

		System.out.println("\n--------------------------------------------");
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("\n첫 번째 수:");
		String strNum1 = scanner.next();

		System.out.print("두 번째 수:");
		String strNum2 = scanner.next();

		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과: " + result);
		System.out.println("-------------------------------------");
		System.out.println("[필수 정보 입력]");

		System.out.print("1. 이름: ");
		String name2 = scanner.next();

		System.out.print("2. 주민번호 앞 6자리: ");
		int number = scanner.nextInt();

		System.out.print("3. 전화번호: ");
		String tel4 = scanner.next();
		tel4 = tel4.substring(0, 3) + "-" + tel4.substring(3, 7) + "-" + tel4.substring(7, 11);

		System.out.println("[입력된 내용]");
		System.out.println("1. 이름: " + name2);
		System.out.println("2. 주민번호 앞 6자리: " + number);
		System.out.println("3. 전화번호: " + tel4);
		
		scanner.close();		
	}
}
