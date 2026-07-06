package chapter5;

import java.util.Random;

import java.util.Scanner;

public class 영화관 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		System.out.println("             §§§ 영화관 §§§");
		System.out.println();
		System.out.println();

		boolean boo = true;
		while (boo = true) {

			System.out.println("               좌석 선택");
			System.out.println("----------------------------------------");
			System.out.println("   A   B   C   D   E   F   G   H   I   J");

			char sit[][] = new char[5][10];
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 10; j++) {
					sit[i][j] = '□';
				}
			}

			String[] A = { "예약가능", "예약불가" };

			for (int k = 0; k < 8; k++) {
				int w = r.nextInt(0, 9);
				int h = r.nextInt(0, 4);
				sit[h][w] = '■';
			}

			for (int i = 0; i < 5; i++) { // 좌석 이름을 보기 편리하게 하기 위해
				for (int k = i; k == i; k++) { // 열과 행에 알파벳, 숫자가 보이도록 함
					System.out.print(i + 1);
				}
				for (int j = 0; j < 10; j++) {
					System.out.printf("%3c ", sit[i][j]); // 칸이 다닥다닥 붙어있지 않고 한칸씩 띄어지도록 함
				}
				System.out.println();
			}

			System.out.println("----------------------------------------");
			System.out.println();
			System.out.print("몇 좌석 예매하시나요? ");
			int answer = sc.nextInt();

			System.out.println("입력한 좌석 수: " + answer);
			System.out.println();
			System.out.println("좌석을 선택해주세요 (A1 ~ J5)");

			int alp = 0; 
			int sit_Array = 0;
			int answer2 = 0;
			int i = 0;

			int[] height = new int[5];
			int[] weight = new int[10];
			
			
			while (i < answer) {
				System.out.print("행(A~J): ");
				String answer1 = sc.next();
				
				switch (answer1) {
				case "A":
					alp = 0;
					break;

				case "B":
					alp = 1;
					break;

				case "C":
					alp = 2;
					break;

				case "D":
					alp = 3;
					break;

				case "E":
					alp = 4;
					break;

				case "F":
					alp = 5;
					break;

				case "G":
					alp = 6;
					break;

				case "H":
					alp = 7;
					break;

				case "I":
					alp = 8;
					break;

				case "J":
					alp = 9;
					break;
				} // switch 변수로 알파벳을 숫자로 변환함
				
				System.out.print("열(1~5): ");
				answer2 = sc.nextInt();
				
				height[i] = answer2 - 1;
				weight[i] = alp;
				i++;

				while (sit_Array == '■') {
					System.out.println("예약 불가능한 좌석입니다");
					i--;
					break;
				}
			}

			System.out.println();
			System.out.println("예약하시겠습니까?");
			System.out.println("1. 예     2. 아니오");

			int yes = sc.nextInt();
			
			if (yes == 1) {
				System.out.println();
				System.out.println("예약이 완료되었습니다");
				System.out.println("----------------------------------------");
				System.out.printf("%s%3s %3s %3s %3s %3s %3s %3s %3s %3s %3s\n",
						" ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J");

//			for (int k = 0; k < answer; k++) {
//				int[] h = new int[] {answer2 - 1};
//				int[] w = new int[] {alp};
//				sit[answer2 - 1][alp] = '■';
//			} 

				
				for (int k = 0; k < answer; k++) {
					sit[height[k]][weight[k]] = '■';
				}

				for (int x = 0; x < 5; x++) {
					for (int y = x; y == x; y++) {
						System.out.print(x + 1);
					}

					for (int z = 0; z < 10; z++) {
						System.out.printf("%3c ", sit[x][z]);
					}
					System.out.println();
				}
			}

			if (yes == 2) {
				boo = false;
				System.out.println();
				System.out.println("예약이 취소되었습니다");
				System.out.println("처음으로 돌아갑니다");
				System.out.println();
				continue;
			}
			break;

		}

	}

}
