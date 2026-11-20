package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dlstkrhrhk2 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		List<String[]> score = new ArrayList<>();
		
		System.out.println("입력할 사원 수");
		int person = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < person; i++) {
		System.out.println("점수 입력");
		String scores = sc.nextLine();
		String[] scoreResult = scores.split(" ");
		score.add(scoreResult);
		}
		 
		
		System.out.println("입력된 점수");
		for(int i = 0; i < person; i++) {
			System.out.println("[" + score.get(i)[0] + ", " + score.get(i)[1] + "]");
		}
		
		int[] sumResult = new int[person];
		for(int i = 0; i < person; i++) {
			String[] sum = score.get(i);
			sumResult[i] += Integer.parseInt(sum[0]) +  Integer.parseInt(sum[1]);
		}
		
		int rank;
		int[] rankResult = new int[person];
		
		for(int i = 0; i < person; i++) {
			rank = 1;
			for(int j = 0; j < person; j++) {
				if(sumResult[i] < sumResult[j]) {
					rank++;
				}
				if(Integer.parseInt(score.get(i)[0]) < Integer.parseInt(score.get(j)[0]) && 
						Integer.parseInt(score.get(i)[1]) < Integer.parseInt(score.get(j)[1])) {
					rank = -1;
					break;
				}
			} rankResult[i] = rank;
		}
		System.out.println("완호의 순위: " + rankResult[0]);	
	}
}
