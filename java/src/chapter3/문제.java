package chapter3;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째 수: ");
		Double a9 = Double.parseDouble(scanner.nextLine());
		
		System.out.println("두 번째 수: ");
		Double a10 = Double.parseDouble(scanner.nextLine());
	
		System.out.println("-----------------------");
		
		
		if(a10==0) {
			System.out.println("결과: 무한대");
		}else {
			System.out.println("결과값: " + (a9 / a10));
		}

	}
}
