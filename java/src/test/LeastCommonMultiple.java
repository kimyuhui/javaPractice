package test;

import java.util.Scanner;

public class LeastCommonMultiple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 (1 2 3 4 5 형식으로)\n > ");
		String number = sc.nextLine();
		String[] numbers = number.split(" ");
		int[] array = new int[numbers.length];
		
		for(int i = 0; i < numbers.length; i++) {
			array[i] = Integer.parseInt(numbers[i]);
		}
		
		solution(array);

	}

	public static int[] solution(int array[]) {

//		//{3, 5, 15}
//		int[] number = new int[array.length-1];
//		for (int i = 0; i < array.length - 1; i++) {
//				number[i] = gcd(array[i], array[i+1]);
//		}
//		
//		// {1, 3, 5} - > 15
//		
//		int a = 1;
//		for (int i = 0; i < number.length; i++) {
//			a = a * number[i];
//		}
		
		// {1 * 3}0, {3 * 5}1, {15 * 15}
		int answer = 1;
		for(int i = 0; i < array.length; i++) {
			int a = 1;
			a = gcd(answer, array[i]);
			answer = answer * array[i] / a;
		}
		
		// 15 * 15 / 15
		
		System.out.println("최소공배수: " + answer);

		return array;
		
	}
	
	public static int gcd (int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
		
	}
}
