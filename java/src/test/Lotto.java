package test;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		Random rd = new Random();
		int number[] = new int[6];

		for(int i = 0; i < number.length; i++) {
			number[i] = rd.nextInt(45);
			if(number[i] == 0) {
				i--;
			}

			for(int j = 0; j < i; j++) {
				if(number[i] == number[j]) {
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < number.length - 1; i++) {
			for(int j = 0; j < number.length - 1 - i; j++) {
				if(number[j] > number[j+1]) {
					int n = number[j];
					number[j] = number[j+1];
					number[j+1] = n;
				}
			}
		}

		System.out.print("로또 추첨 번호: ");

		for(int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}



		//		Arrays.sort(number);
		//		
		//		for(int i = 0; i < number.length; i++) {
		//			System.out.print(number[i] + " ");
		//		}

	}

}
