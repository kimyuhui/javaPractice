package practice.test260715;

import java.util.Random;
import java.util.Scanner;
// 수정본
public class Game {

	public final static int gameScore = 50;

	public static void main(String[] args) {
		RockScissorPaper rspaper = new RockScissorPaper();
		// 가위바위보를 해서 이긴 사람이 먼저 주사위를 굴리게 됨
		Scanner sc = new Scanner(System.in);
		int normalDice = 0; // 메소드를 호출하기 위해 선언
		int dangerDice = 0;
		int safeDice = 0;
		int sosoDice = 0;
		int count = 0; // 게임을 한 번도 진행하지 않고 나가기를 선택했을 시 다른 문구가 출력되도록 함

		while(true) {
			message();
			String onetwo = sc.next(); 
			if(onetwo.equals("1")) {
				rspaper.rsp();
				if(rspaper.lose == true) { // 가위바위보에서 졌을 때
					RollDice2(normalDice, dangerDice, safeDice, sosoDice);
					count++; // 게임을 하면 카운트가 오름 (종료했을 때 띄울 문구를 다르게 하려고)
					messageAgain(); // 게임이 끝난 뒤 출력될 문구
					String onetwo2 = sc.next();
					if(onetwo2.equals("1")) {
						continue; // 입력하는 사람이 1. 다시 하기를 선택하면 처음부터 다시 시작
					} else if(onetwo2.equals("2")) {
						System.out.println(); // 2. 나가기를 선택하면 while문 끝
						System.out.println("게임을 끝냅니다.");
						System.out.println("강아지: 멍멍~ 다음에 또 할 거죠?");
						break;
					}
					break;
				} else if(rspaper.win == true) { //가위바위보에서 이겼을 때
					RollDice(normalDice, dangerDice, safeDice, sosoDice);
					count++;
					messageAgain();
					String onetwo2 = sc.next();
					if(onetwo2.equals("1")) {
						continue;
					} else if(onetwo2.equals("2")) {
						System.out.println("게임을 끝냅니다.");
						System.out.println("강아지: 멍멍~ 다음에 또 할 거죠?");
						break;
					}
					break;
				} else if(rspaper.wrongAnswer == true) { 
					// 가위바위보에서 잘못된 문자열을 5번 입력하고, 강아지에게 나쁜 말을 했을 때
					break;
				} break;
			} else if(onetwo.equals("2")) {
				System.out.println("게임을 종료합니다.");
				if(count == 0) { 
					System.out.println("강아지: 한 판도 안 했는데!");
					break;
				} else if (count >= 1) {
					System.out.println("강아지: 멍멍! 다음에 또 해요~");
					break; // 시작 메뉴에서 2. 끝내기를 선택하면 게임이 종료되도록 함 
				} else {
					System.out.println();
					System.out.println("잘못된 입력을 하셨습니다!");
					System.out.println("강아지: 1과 2만 누를 수 있어요! 멍멍");
					System.out.println();
					continue; // 시작 메뉴에서 1과 2를 제외한 다른 것을 입력하면 다시 시작되도록 함
				}
			}
		}
	}

	static void message() { 
		System.out.println(" □□□□□□ 주사위 게임 □□□□□□");
		System.out.println("========================");
		System.out.println("당신은 컴퓨터 강아지와 주사위 게임을 합니다");
		System.out.println();
		System.out.println("네 개의 주사위가 있고 중복된 주사위를 고를 수 있습니다");
		System.out.println();
		System.out.println("1. 마약방석 주사위   2. 고구마훔치기 주사위   3. 새가슴 주사위   4. 개껌주사위");
		System.out.println("------------------------");
		System.out.println("마약방석 주사위 : 1~6   |  고구마훔치기 주사위 : 1, 6");
		System.out.println("새가슴 주사위 : 3, 4    |  개껌주사위 : 2, 5");
		System.out.println("(강아지는 랜덤으로 주사위를 사용합니다)");
		System.out.println();
		System.out.println("* 강아지와 가위바위보를 하여 순서를 정합니다 *");
		System.out.println("========================");
		System.out.println("1. play              2. 끝내기");
	}
	// 시작 메뉴 
	static void messageAgain() {
		System.out.println("1. 처음부터 다시 하기       2. 그만하기");
	}
	// 게임이 끝난 뒤 메뉴
	static void RollDice(int normalDice, int dangerDice, int safeDice, int sosoDice) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		Dice dice = new Dice();		// 주사위 클래스들 호출함
		DangerDice dangerdice = new DangerDice();
		SafeDice safedice = new SafeDice();
		SosoDice sosodice = new SosoDice();

		int computerDice = 0;	// 주사위 한번 굴린 값을 저장할 변수
		int computerDiceSum = 0; // 주사위 값을 더한 값
		int computerCount = 0; // 주사위를 굴린 횟수
		int userDice = 0;
		int userDiceSum = 0;
		int userCount = 0;
		int[] computer = {1, 2, 3, 4};
		int computerNum = computer.length;

		// user의 주사위 총합이나 컴퓨터의 주사위 총합이 gameScore를 넘으면 while문이 종료되도록 함
		while(userDiceSum < gameScore && computerDiceSum < gameScore) {
			int userTurnSum = 0;		// 한 턴에서 세 주사위의 합계를 구하기 위해 변수 선언
			int computerTurnSum = 0;	// while문 바깥에 선언하면 값이 계속 초기화되어서 while문 안에 선언함

			System.out.println("내 차례");
			System.out.println("주사위 고르세요 (3개 -> 123 형식으로 입력");
			String userDiceAnswer = sc.next(); // String으로 굴릴 주사위 유형을 선택받음
			if(userDiceAnswer.length() != 3) {	// 많은 숫자를 입력했을 시 출력되도록 함
				System.out.println("잘못된 입력입니다");
				System.out.println("이번 턴은 0점입니다");
			} else {
				for(int i = 0; i < 3; i++) {
					if(userDiceSum >= gameScore) { // user의 총합이 gameScore를 넘으면 for문이 끝나도록 함
						i = 3;
					} else {
						userDice = userDiceAnswer.charAt(i); // userDiceAnswer의 0, 1, 2 인덱스에 있는 숫자
						if(userDice == '1') {
							userDice = dice.roll();
							userCount++;	// 굴린 주사위 개수를 저장하기 위해 if문이 실행될 때마다 userCount를 증가
						} else if (userDice == '2') {
							userDice = dangerdice.roll();
							userCount++;
						} else if (userDice == '3') {
							userDice = safedice.roll();
							userCount++;
						} else if (userDice == '4') {
							userDice = sosodice.roll();
							userCount++;
						} else {
							System.out.println("잘못 입력하셨습니다");
							System.out.println("이번 턴은 0점입니다");
							break; // 잘못 입력했을 시 출력되는 문구
						}
						userTurnSum += userDice; // 이번 턴의 합계
						userDiceSum += userDice; // 총합
					} 
				}
			}
			System.out.println("합계: " + userTurnSum);
			System.out.println("========================");
			System.out.println("총합: " + userDiceSum);
			System.out.println("사용한 주사위 개수: " + userCount);
			System.out.println("========================");
			System.out.println();

			System.out.println("강아지 차례");
			for(int i = 0; i < 3; i++) {
				int computerRandom = rd.nextInt(computerNum);
				int computerResult = computer[computerRandom];
				if(computerDiceSum >= gameScore) {
					i = 3;
				} else {
					if(computerResult == 1) {
					computerDice = dice.roll();
					computerCount++;	// 굴린 주사위 개수를 저장하기 위해 if문이 실행될 때마다 userCount를 증가
				} else if (computerResult == 2) {
					computerDice = dangerdice.roll();
					computerCount++;
				} else if (computerResult == 3) {
					computerDice = safedice.roll();
					computerCount++;
				} else if (computerResult == 4) {
					computerDice = sosodice.roll();
					computerCount++;
				} 
				computerTurnSum += computerDice; // 이번 턴의 합계
				computerDiceSum += computerDice; // 총합
			}
			}
			System.out.println("합계: " + computerTurnSum);
			System.out.println("========================");
			System.out.println("총합: " + computerDiceSum);
			System.out.println("사용한 주사위 개수 " + computerCount);
			System.out.println("========================");
			System.out.println();
		}
		System.out.println();
		System.out.println("나의 총점: " + userDiceSum + " / " + "사용한 주사위 개수: " + userCount);
		System.out.println("강아지 총점: " + computerDiceSum + " / " + "사용한 주사위 개수: " + computerCount);
		System.out.println();
		if(userDiceSum >= computerDiceSum && userCount <= computerCount) {
			System.out.println("당신이 이겼습니다");
		} else if(userDiceSum == computerDiceSum && userCount == computerCount) {
			System.out.println("비겼습니다");
		} else if(userDiceSum <= computerDiceSum && userCount >= computerCount) {
			System.out.println("강아지가 이겼습니다");
		} return;
	} 
	// 사용자가 가위바위보를 이겼을 때 (사용자 먼저 턴을 갖게 됨)
	
	static void RollDice2(int normalDice, int dangerDice, int safeDice, int sosoDice) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		Dice dice = new Dice();
		DangerDice dangerdice = new DangerDice();
		SafeDice safedice = new SafeDice();
		SosoDice sosodice = new SosoDice();

		int computerDice = 0;
		int computerDiceSum = 0;
		int computerCount = 0;
		int userDiceSum = 0;
		int userCount = 0;
		int userDice = 0;
		int[] computer = {1, 2, 3, 4};
		int computerNum = computer.length;

		while(userDiceSum < gameScore && computerDiceSum < gameScore) {
			int userTurnSum = 0;
			int computerTurnSum = 0;

			System.out.println("강아지 차례");
			for(int i = 0; i < 3; i++) {
				int computerRandom = rd.nextInt(computerNum);
				int computerResult = computer[computerRandom];
				if(computerDiceSum >= gameScore) {
					i = 3;
				} else {
					if(computerResult == 1) {
					computerDice = dice.roll();
					computerCount++;	
				} else if (computerResult == 2) {
					computerDice = dangerdice.roll();
					computerCount++;
				} else if (computerResult == 3) {
					computerDice = safedice.roll();
					computerCount++;
				} else if (computerResult == 4) {
					computerDice = sosodice.roll();
					computerCount++;
				} 
				computerTurnSum += computerDice; 
				computerDiceSum += computerDice; 
			}
			}
			System.out.println("합계: " + computerTurnSum);
			System.out.println("========================");
			System.out.println("총합: " + computerDiceSum);
			System.out.println("사용한 주사위 개수: " + computerCount);
			System.out.println("========================");
			System.out.println();

			System.out.println("내 차례");
			System.out.println("주사위 고르세요 (3개 -> 123 형식으로 입력");
			String userDiceAnswer = sc.next();
			if(userDiceAnswer.length() != 3) {
				System.out.println("잘못된 입력입니다");
				System.out.println("이번 턴은 0점입니다");
			} else {
				for(int i = 0; i < 3; i++) {
					if(userDiceSum >= gameScore) {
						i = 3;
					} else {
						userDice = userDiceAnswer.charAt(i);
						if(userDice == '1') {
							userDice = dice.roll();
							userCount++;
						} else if (userDice == '2') {
							userDice = dangerdice.roll();
							userCount++;
						} else if (userDice == '3') {
							userDice = safedice.roll();
							userCount++;
						} else if (userDice == '4') {
							userDice = sosodice.roll();
							userCount++;
						} else {
							System.out.println("잘못 입력하셨습니다");
							System.out.println("이번 턴은 0점입니다");
							break;
						}
						userTurnSum += userDice;
						userDiceSum += userDice;
					} 
				}
			}
			System.out.println("합계: " + userTurnSum);
			System.out.println("========================");
			System.out.println("총합: " + userDiceSum);
			System.out.println("사용한 주사위 개수: " + userCount);
			System.out.println("========================");
			System.out.println();
		}
		System.out.println();
		System.out.println("나의 총점: " + userDiceSum + " / " + "사용한 주사위 개수: " + userCount);
		System.out.println("강아지 총점: " + computerDiceSum + " / " + "사용한 주사위 개수: " + computerCount);
		System.out.println();
		if(userDiceSum >= computerDiceSum && userCount <= computerCount) {
			System.out.println("당신이 이겼습니다");
		} else if(userDiceSum == computerDiceSum && userCount == computerCount) {
			System.out.println("비겼습니다");
		} else if(userDiceSum <= computerDiceSum && userCount >= computerCount){
			System.out.println("강아지가 이겼습니다");
		} return;
	} 
	
	// 사용자가 가위바위보를 졌을 때 (컴퓨터가 먼저 턴을 갖게 됨)
}
