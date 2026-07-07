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
		System.out.println("영화를 선택해주세요");
		System.out.println("1. 티파니에서 아침을       2. 석류의 빛깔       3. 버닝");
		System.out.print("선택: ");
		int movie = sc.nextInt();
		
		String[] moviename = {"티파니에서 아침을", "석류의 빛깔", "버닝"};
		
		System.out.println(moviename[movie-1] + " 선택하셨습니다");
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

			String[] seatList = new String[answer];
						
			int alp = 0; 			// 행을 알파벳으로 입력받고 숫자로 바꾸기 위해 선언
			int sit_Array = 0;		// sit[answer2-1(열)][alp(행)]를 저장해놓기 위해 선언
			int answer2 = 0;		// 열
			int i = 0;				// 아래의 while문을 돌리기 위해 선언한 변수 
			int price = 0;			// 가격을 계산하기 위해 선언
			int AclassCnt = 0;		// A구역, B구역, C구역을 몇 개씩 예매했는지 체크하기 위해 선언 (가격계산때문에)
			int BclassCnt = 0;
			int CclassCnt = 0;
	
			
			int[] height = new int[5];		//5열의 배열 생성
			int[] weight = new int[10];		//10행의 배열 생성 
			
			
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
		
				sit_Array = sit[answer2 - 1][alp];
				if (sit_Array == '■') {
					System.out.println("예약 불가능한 좌석입니다");
					continue;
				} // if문의 continue를 사용하여 입력하는 사람이 중복된 좌석을 고를 시 다시 조건문 시작 부분으로 돌아가게 함
				
				

				height[i] = answer2 - 1;
				weight[i] = alp;	
				seatList[i] = answer1 + answer2;
				i++; // n번째 돌렸을 때의 열과 행의 값을 저장해놓음 여러개를 저장해야 할수도 있어서 배열로
				
				
				// 1열-2열 : A구열, 3열-4열 : B구역, 5열 - C구역으로 정함
				// 입력된 좌석이 A, B, C구역인지 확인하기 위해 if문 사용
			
				
				if(answer2 < 3 && alp <= 10) {
					System.out.println("A구역 좌석을 선택하셨습니다. (15000원)");
							AclassCnt++;
				} else if(answer2 > 2 && answer2 < 5 && alp <=10) {
					System.out.println("B구역 좌석을 선택하셨습니다. (13000원)");
							BclassCnt++; 
				} else if(answer2 > 4 && alp <=10) {
					System.out.println("C구역 좌석을 선택하셨습니다. (11000원)");
							CclassCnt++;
				} else {System.out.println("잘못된 입력을 하셨습니다");}
						
				price = AclassCnt*15000 + BclassCnt*13000 + CclassCnt*11000;
			
			}
			System.out.println();
			System.out.println("예약하시겠습니까?");
			System.out.print("1. 예     2. 아니오: ");
			int yes = sc.nextInt();
			
			System.out.println("-------------------------------");
			
			if (yes == 1) {
				System.out.println("결제 방법을 선택하세요");
				System.out.println("1. 현금    2. 카드");
				System.out.printf("금액: %d\n", price);
				System.out.println("선택: ");
				int pay = sc.nextInt();
				System.out.println("----------------------------------");
				if(pay == 1) {
					System.out.print("지불할 현금 입력: ");
					int money = sc.nextInt();
					if(money < price) {System.out.println("금액이 부족합니다.");
					continue;
					}  else if(money>=price) {System.out.println(money + " 원 받았습니다");
					System.out.println("거스름돈: " + (money - price));
				} 
					
				} else {System.out.println("계산이 완료되었습니다");}
				
				System.out.println();
				System.out.println("예약이 완료되었습니다");
				System.out.println("----------------------------------------");
				System.out.printf("%s%3s %3s %3s %3s %3s %3s %3s %3s %3s %3s\n",
						" ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J");
						
				for (int k = 0; k < answer; k++) {
					sit[height[k]][weight[k]] = '■';
				}	// 선택된 좌석들을 ■로 표시하기 위해 for문 선언
				
				
				for (int x = 0; x < 5; x++) {
					for (int y = x; y == x; y++) {
						System.out.print(x + 1);
					}

					for (int z = 0; z < 10; z++) {
						System.out.printf("%3c ", sit[x][z]);
					}
					System.out.println();
				} // 좌석 선택창을 한 번 더 띄우기 위해 위에서 사용했던 for문을 한번 더 사용함
			}

			if (yes == 2) {
				boo = false;
				System.out.println();
				System.out.println("예약이 취소되었습니다");
				System.out.println("처음으로 돌아갑니다");
				System.out.println();
				continue;
			}
			System.out.println();
			System.out.println("-----------------------------------------------------------------");
			System.out.println("                        ♧   " + moviename[movie-1] + "   ♧");
			System.out.println("                        인원: " + answer + "명");       
			System.out.println("                        가격: " + price + " 원");
			System.out.print("                        좌석: ");
			for(int a = 0; a < answer; a++) {
				System.out.print(seatList[a] + " ");
			}	System.out.println();	
			System.out.println();
			System.out.println("                       ♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥");
			System.out.println("                         즐거운 관람 되세요 ^^");
			System.out.println("                       ♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥");          
			System.out.println("-----------------------------------------------------------------");
			break;
			

		}


				}
		
	}

