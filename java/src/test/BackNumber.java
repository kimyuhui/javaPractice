package test;

import java.util.Scanner;

public class BackNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 \n > ");
		String number = sc.nextLine();
		
		String[] arrayNum = number.split(" ");
		
		int array[] = new int[arrayNum.length];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(arrayNum[i]);
		}
		
		
		solution(array);
	}


	public static int[] solution(int[] numbers) {

		for(int i = 0; i < numbers.length; i++) {
				int[] answer = new int[numbers.length];
				answer[i] = -1;
				
			for(int j = i+1; j < numbers.length; j++) {
				if(numbers[i] < numbers[j]) {
					answer[i] = numbers[j];
					break;
				} 
			}
			System.out.print(answer[i] + " ");
		}
		return numbers;
	}
}
