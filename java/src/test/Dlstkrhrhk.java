package test;

import java.util.Scanner;

public class Dlstkrhrhk {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("점수를 입력할 사원 수 \n> ");
		int person = sc.nextInt();
		sc.nextLine();
		int score1 = 0;
		int score2 = 0;
		int[] totalScore = {score1, score2};

		int[][] array = new int[person][2];

		int w = 0;
		while(w < person) {
			System.out.print("점수를 입력하세요: ");
			String score = sc.nextLine();
			String[] arrayNum = score.split(" ");

			array[w][0] = Integer.parseInt(arrayNum[0]);
			array[w][1] = Integer.parseInt(arrayNum[1]);

			w++;
		}

		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < 1; j++) {
				System.out.print("[" + array[i][0] + ", " + array[i][1] + "]");
			}
		} System.out.println();

		int sum[][] = new int[array.length][2];

		for(int i = 0; i < array.length; i++) {
			sum[i][0] = array[i][0] + array[i][1];
		}

		for(int i = 0; i < array.length; i++) {
			int rank = 1;
			boolean a = false;
			for(int j = 0; j < array.length; j++) {
				if(array[i][0] < array[j][0] && array[i][1] < array[j][1]) {
					a = true;
				}
				if(sum[i][0] < sum[j][0]) {
					rank++;
				}
			}
			if(a == true) {
				sum[i][1] = -1;
			} else {
				sum[i][1] = rank;
			}
		} System.out.println("0번 인덱스의 순위: " + sum[0][1]);
	}
}
