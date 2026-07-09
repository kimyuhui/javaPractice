package chapter5;

import java.util.Scanner;

public class 소용돌이 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 칸");
		int n = sc.nextInt();
		
		
		int [][] array2 = new int[n][n];
		
		int height = 0;
		int weight = 0;
		int height1 = n-1;
		int weight1 = n-1;
		int sum2 = 1;
		
		
		while(sum2 < n*n-1) {
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
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%2d ", array2[i][j]);
				}
			System.out.println();
		}
		
		
	}

}
