package chapter5;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		
		// void main -> main이 끝나고 나면 반환하는거 없이 끝남 
		Scanner sc = new Scanner(System.in);
		
		
		int[][] array = new int[5][5];
		
		int n = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				array[i][j] += n;
				n++;
			}
		}

		printArray(n, array);
		//메서드의 틀 모양과 같은 타입으로 넣어야됨
		// ㄴ printArray(array, n) -> 컴파일 오류 
		// Ctrl 누르고 클릭하면 해당 메서드로 이동함
	
	
		System.out.println("------------------------------------------");
		
		
		int a1 = 1;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				array[i][j] = 2 * a1 - 1;
				a1++;
			}
		}
		
		printArray(a1, array);
		
		
		System.out.println("------------------------------------------");
		
		int a2 = 25;
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				array[i][j] = a2;
				a2--;
			}
		}
		
		printArray(a2, array);
		
		System.out.println("------------------------------------------");
		
		
		int sum = 26;
		
		for(int i = 0; i < 5; i++) { 
			sum = sum - 1;
			for(int j = 0; j < 5; j++) {
				array[i][j] = sum - 5 * j;
			}
		}
			
		
		printArray(sum, array);
		
		System.out.println("------------------------------------------");
		
		sum = 0;
		for(int i = 0; i < 5; i++) { 
			sum = sum + 1;
			for(int j = 0; j < 5; j++) {
				array[i][j] = sum + 5 * j;
			}
		}
			
		printArray(sum, array);
		

		System.out.println("------------------------------------------");
		
		int [][] array2 = new int[5][5];
		int height = 0;
		int weight = 0;
		int height1 = 4;
		int weight1 = 4;
		int sum2 = 1;
		
		
		while(sum2 < 26) {
			for(int j = weight; j <= weight1; j++) {
					array2[height][j] = sum2;
					sum2++;
				}
					height++;
			
			for(int i = height; i <= height1; i++) {
					array2[i][weight1] = sum2;
					sum2++;
				}
					weight1--;
			
			for(int j = weight1; j >= weight && j >= 0; j--) {
					array2[height1][j] = sum2;
					sum2++;
				}
					height1--;
			
			for(int i = height1; i >= height && i >= 0; i--) {
					array2[i][weight] = sum2;
					sum2++;		
				}
					weight++;
		}
		
		
		printArray(sum2, array2);
		
		
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
	
	public static void printArray(int arrayCnt, int[][] myArray) {
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ", myArray[i][j]);
				}
			System.out.println();
		}
		
		
		//void = 반환해주는게없다 메서드가 끝나면 바로 끝냄 
		// 메서드 = 메인도 메서드이므로 안에 같이 있으면 안됨
		
		
		
		
	}
	
	

}
