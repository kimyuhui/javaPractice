package chapter5;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[][] array = new int[5][5];
		
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
			sum = sum - 1;
			for(int j = 0; j < 5; j++) {
				array[i][j] = sum - 5 * j;
			}
		}
			
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		
		sum = 0;
		for(int i = 0; i < 5; i++) { 
			sum = sum + 1;
			for(int j = 0; j < 5; j++) {
				array[i][j] = sum + 5 * j;
			}
		}
			
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}
		

		System.out.println("------------------------------------------");
		
		int [][] array2 = new int[5][5];
		int height = 0;
		int weight = 0;
		int height1 = 4;
		int weight1 = 4;
		int sum2 = 0;
		
		
		while(sum2 < 26) {
				for(int j = weight; j < weight1 && j >= 0; j++) {
					array2[height][j] += sum2;
				}
					height++;
			
			for(int i = height; i < height1 && i >= 0; i++) {
					array2[i][weight1] += sum2;
				}
					weight1--;
			
			for(int j = weight1; j < weight && j >= 0; j--) {
					array2[height1][j] += sum2;
				}
					height1--;
			
			for(int i = height1; i < height && i >= 0; i--) {
					array2[i][weight] += sum2;
					weight++;
			}
		}
		
		
		for (int i = height; i < height1; i++) {
			for (int j = weight; j < weight1; j++) {
				System.out.printf("%2d ", array2[i][j]);
			}
			System.out.println();
		}
		
		
//		System.out.println("몇 칸 짜리로 만드시겠습니까");
//		int x = sc.nextInt();
//		
//		int array2[][] = new int[x][x];
//		
//		int t = 1;
//
//		for (int i = 0; i < x; i++) {
//			for (int j = 0; j < x; j++) {
//				array2[i][j] += t;
//				t++;
//			}
//		}
//		
//	
//		for (int i = 0; i < x; i++) {
//			for (int j = 0; j < x; j++) {
//				System.out.printf("%2d ", array2[i][j]);
//			}
//			System.out.println();
//		}
//		
		
		
	}

}
