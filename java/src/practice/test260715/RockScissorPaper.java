package practice.test260715;

import java.util.Random;
import java.util.Scanner;

public class RockScissorPaper {
	// 턴 순서를 가위바위보로 정하기 위해 가위바위보 클래스를 만들었음
	
	Random rd = new Random();
	String[] hand = {"가위", "바위", "보"};
	int i = 0;
	// i값을 메인 메소드에서도 사용하려고 필드로 선언함
	// i를 메소드 안에서만 선언하면 메인 메소드에서 i값을 읽지 못함
	
	
	// 가위바위보 메소드
	public void rsp() {

		Scanner sc = new Scanner(System.in);
	
		// 비겼을 때 가위바위보를 반복해야 하기 때문에 while문에 넣음
		// 입력하는 사람이 이기거나 지면 run = false가 되어 while문이 끝남
		// 승리하면 i = 2; 지면 i = 1로 승패 값을 저장함
		
		
		int fault = 0;
		boolean run = true;
		while(run == true) {
			int randomHand = rd.nextInt(this.hand.length);
			System.out.println("가위바위보 중에서 입력하세요");
			String userHand = sc.next();
			if(userHand.equals("가위")) {
				if(randomHand == 0) {
					System.out.println("강아지: 가위");
					System.out.println("비겼습니다");
					System.out.println("한 판 더!");
				} else if (randomHand == 1) {
					this.i = 1;
					System.out.println("강아지: 바위");
					run = false;
					break;
				} else if (randomHand == 2) {
					System.out.println("강아지: 보");
					this.i = 2;
					run = false;
					break;
				}
			} else if(userHand.equals("바위")) {
				if(randomHand == 0) {
					System.out.println("강아지: 가위");
					this.i = 2;
					run = false;
					break;
				} else if (randomHand == 1) {
					System.out.println("강아지: 바위");
					System.out.println("비겼습니다");
					System.out.println("한 판 더!");
				} else if (randomHand == 2) {
					System.out.println("강아지: 보");
					this.i = 1;
					run = false;
					break;
				}
			} else if(userHand.equals("보")) {
				if(randomHand == 0) {
					System.out.println("강아지: 가위");
					this.i = 1;
					run = false;
					break;
				} else if (randomHand == 1) {
					System.out.println("강아지: 바위");
					this.i = 2;
					run = false;
					break;
				} else if (randomHand == 2) {
					System.out.println("강아지: 보");
					System.out.println("비겼습니다");
					System.out.println("한 판 더!");
				}
			} else {System.out.println("가위, 바위, 보만 낼 수 있어요");
					System.out.println("강아지: 반칙하면 안 돼요! U-ㅅ-U");
					fault++;
					if(fault == 3) {
						System.out.println();
						System.out.println("강아지: 하기 싫으면 말로 해요! U◐ㅅ◑U");
						System.out.println();
					}
					else if(fault == 5) {
						System.out.println();
						System.out.println("강아지는 삐졌습니다");
						System.out.println("강아지가 놀고 싶지 않은가봅니다");
						System.out.println("1. 강아지 미안해!     2. 저리 가 똥개야");
						String answerDog = sc.next();
							if(answerDog.equals("1")) {
								System.out.println("강아지: 괜찮아요! 다시 해요! U^ㅅ^U");
								run = true;
							} else if (answerDog.equals("2")) {
								System.out.println("강아지: 저도 당신같은 주인님은 싫어요!");
								this.i = 4;
								run = false;
								break;
							} else {System.out.println("강아지: 주인님 때문에 화나요!");
							this.i = 4;
							break;
							} 
					} 
			} // 입력하는 사람이 가위, 바위, 보 말고 다른 문자열을 입력하면 위의 문구가 출력되도록 함
		}

		if(this.i == 1) {
			System.out.println("========================");
			System.out.println("당신이 졌습니다");
			System.out.println("강아지도 가위바위보를 잘합니다!");
			System.out.println("========================");
			System.out.println();
		} else if(this.i == 2) {
			System.out.println("========================");
			System.out.println("당신이 이겼습니다");
			System.out.println("강아지: 역시 주인님이에요! 멍멍!");
			System.out.println("========================");
			System.out.println();
		}

	}
}
