package chapter5;

import java.util.Random;
import java.util.Scanner;

public class 영화관 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("             §§§ 영화관 §§§");
		System.out.println();
		System.out.println();
		System.out.println("               좌석 선택");
		System.out.println("----------------------------------------");
		System.out.println("   A   B   C   D   E   F   G   H   I   J");
		
		char sitArr[][] = new char[5][10];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 10; j++) {
				sitArr[i][j] = '□';
			}
		}
		
		String[] A = {"예약가능", "예약불가"};
		String[] sit = {"A1", "A2", "A3", "A4", "A5",
						"B1", "B2", "B3", "B4", "B5",
						"C1", "C2", "C3", "C4", "C5",
						"D1", "D2", "D3", "D4", "D5",
						"E1", "E2", "E3", "E4", "E5",
						"F1", "F2", "F3", "F4", "F5",
						"G1", "G2", "G3", "G4", "G5",
						"H1", "H2", "H3", "H4", "H5",
						"I1", "I2", "I3", "I4", "I5",
						"J1", "J2", "J3", "J4", "J5"};
		
		int w = r.nextInt(0,9);
		int h = r.nextInt(0,4);
		sitArr[h][w] = '■';
		
		for(int k = 0; k < 8; k++) {
			 sitArr[h][w] = '■';
		}

		
		for (int i = 0; i < 5; i++) {
			for (int k = i; k == i; k++) {
				System.out.print(i+1);
			}
			for(int j = 0; j < 10; j++) {
				System.out.printf("%3c ", sitArr[i][j]);
			}
			System.out.println();
		}
		
	
		
		System.out.println("----------------------------------------");
		System.out.println();
		System.out.println("몇 좌석 예매하시나요?");

		
		
		
	}

}
