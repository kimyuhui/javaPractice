package chapter5;

import java.util.Random;

public class exam02 {

	public static void main(String[] args) {

		Random r = new Random();
		String str1 = ""; // 아무것도 없는 내용의 메모리를 가리킴
		String str2 = null; // 가리키고 있는 참조 자체가 없음
		// int i = null; 기본 타입은 실제로 값이 담겨야 되어서 컴파일 오류 -> 없다라는 의미는 값이 될 수 없음

		// "" / null 비교
		// 화장실에 갔는데 휴지심은 있고 휴지가 없는 상태 > ""
		// 화장실에 갔는데 휴지칸에 휴지심도 없음 > null

		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);

		int[] num = { 0, 1, 2, 3 };
		System.out.println(num.length); // length는 길이가 정해져있기 때문에 대입 불가

		int[][] array = new int[5][5];
		System.out.println(array.length);
		System.out.println(array[0].length);
		System.out.println(array[1].length);
		System.out.println(array[2].length);

		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25

		int n = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				array[i][j] += n;
				n++;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		
		
		int a1 = 1;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				array[i][j] = 2 * a1 - 1;
				a1++;
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		int a2 = 25;
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				array[i][j] = a2;
				a2--;
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		
		
		int sum = 26;
		
		for(int i = 0; i < 5; i++) { 
			for(int j = 0; j < 5; j++) {
				array[i][j] = sum - 5;
				sum--;
 			}
			}
			
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		

		System.out.println("------------------------------------------");
		
		// 1  3  5  7  9
		// 11 13 15 17 19
		// 21 23 25 27 29
		// 31 33 35 37 39
		// 41 43 45 47 49
		
		// 1  6  11  16  21
		// 2  7  12  17  22
		// 3  8  13  18  23
		// 4  9  14  19  24
		// 5  10 15  20  25
		
		
		// 
		//
		//
		//
		//

	}

}
