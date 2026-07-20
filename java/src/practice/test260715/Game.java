package practice.test260715;

import java.util.Scanner;
// 수정본
public class Game {

	public final static int gameScore = 50;

	public static void main(String[] args) {
		RockScissorPaper rspaper = new RockScissorPaper();
		Scanner sc = new Scanner(System.in);
		int normalDice = 0;
		int dangerDice = 0;
		int safeDice = 0;
		int sosoDice = 0;
		int count = 0; // 게임을 한 번도 진행하지 않고 나가기를 선택했을 시 다른 문구가 출력되도록 함

		while(true) {
			message();
			String onetwo = sc.next(); 
			if(onetwo.equals("1")) {
				rspaper.rsp();
				if(rspaper.lose == true) { // 가위바위보를 하여 이기면 입력하는 사람 먼저, 지면 컴퓨터 먼저
					RollDice2(normalDice, dangerDice, safeDice, sosoDice); // 컴퓨터가 먼저 턴을 갖게 되는 메소드
					count++;
					messageAgain(); // 게임이 끝난 뒤 출력될 문구
					String onetwo2 = sc.next();
					if(onetwo2.equals("1")) {
						continue; // 입력하는 사람이 1. 다시 하기를 선택하면 처음부터 다시 시작
					} else if(onetwo2.equals("2")) {
						System.out.println(); // 2. 나가기를 선택하면 while문 끝
						System.out.println("게임을 끝냅니다.");
						System.out.println("강아지: 멍멍~ 다음에 또 할 거죠? ^'ㅅ'^");
						break;
					}
					break;
				} else if(rspaper.win == true) {
					RollDice(normalDice, dangerDice, safeDice, sosoDice); // 입력하는 사람이 먼저 턴을 갖게 되는 메소드
					count++;
					messageAgain();
					String onetwo2 = sc.next();
					if(onetwo2.equals("1")) {
						continue;
					} else if(onetwo2.equals("2")) {
						System.out.println("게임을 끝냅니다.");
						System.out.println("강아지: 멍멍~ 다음에 또 할 거죠? ^'ㅅ'^");
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
					System.out.println("강아지: 멍멍! 다음에 또 해요~ U^ㅅ^U");
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
		System.out.println("멍멍     ^-ㅅ-^     멍멍");
		System.out.println();
		System.out.println("네 개의 주사위가 있고 중복된 주사위를 고를 수 있습니다");
		System.out.println();
		System.out.println("1. 마약방석 주사위   2. 고구마훔치기 주사위   3. 새가슴 주사위   4. 개껌주사위");
		System.out.println("------------------------");
		System.out.println("마약방석 주사위 : 1~6 (좋은꿈 같을 수도 있고 악몽같을 수도 있음)   |  고구마훔치기 주사위 : 1, 6 (고구마 훔칠 때처럼 운을 시험하기)");
		System.out.println("새가슴 주사위 : 3, 4 (약하고 작은 동물들이 쓰는 주사위)          |  개껌주사위 : 2, 5 (보기엔 별거 없어보이지만 씹는 맛이 있는 개껌처럼)");
		System.out.println("(강아지는 마약방석 주사위만 사용합니다)");
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
		Dice dice = new Dice();
		DangerDice dangerdice = new DangerDice();
		SafeDice safedice = new SafeDice();
		SosoDice sosodice = new SosoDice();

		int computerDice = 0;	// 주사위 한번 굴린 값을 저장할 변수
		int computerDiceSum = 0; // 주사위 값을 더한 값
		int computerCount = 0; // 턴을 가진 횟수
		int userDice = 0;
		int userDiceSum = 0;
		int userCount = 0;

		while(userDiceSum < gameScore && computerDiceSum < gameScore) {
			System.out.println("내 차례");
			System.out.println("주사위 고르세요 (3개 -> 123 형식으로 입력");
			String userDiceAnswer = sc.next();
			for(int i = 0; i < 3; i++) {
				userDice = userDiceAnswer.charAt(i);
				if(userDice == '1') {
					userDice = (char) dice.roll();
				} else if (userDice == '2') {
					userDice = (char) dangerdice.roll();
				} else if (userDice == '3') {
					userDice = (char) safedice.roll();
				} else if (userDice == '4') {
					userDice = (char) sosodice.roll();
				} else {
					System.out.println("잘못 입력하셨습니다");
					System.out.println("이번 턴은 0점입니다");
					break;
				}
				userDiceSum += userDice;
			} 
			userCount++;
			System.out.println("합계: " + userDiceSum);
			System.out.println("========================");
			System.out.println();

			System.out.println("강아지 차례");
			for(int i = 0; i < 3; i++) {
				computerDice = dice.roll();
				computerDiceSum += computerDice;
			} 
			computerCount++;
			System.out.println("합계: " + computerDiceSum);
			System.out.println("========================");
			System.out.println();
			System.out.println("현재 나의 총합: " + userDiceSum
					+ " / " + "주사위 굴린 횟수: " + userCount);
			System.out.println("현재 강아지 총합: " + computerDiceSum
					+ " / " + "주사위 굴린 횟수: " + computerCount);
		}

		if(userDiceSum >= computerDiceSum && userCount >= computerCount) {
			System.out.println("당신이 이겼습니다");
		} else if(userDiceSum == computerDiceSum && userCount == computerCount) {
			System.out.println("비겼습니다");
		} else {
			System.out.println("제가 이겼습니다");
		} return;
	} 
	// 사용자가 이겼을 때 (사용자 먼저 턴을 갖게 됨)
	static void RollDice2(int normalDice, int dangerDice, int safeDice, int sosoDice) {
		Scanner sc = new Scanner(System.in);
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

		while(userDiceSum < gameScore && computerDiceSum < gameScore) {
			System.out.println("강아지 차례");
			for(int i = 0; i < 3; i++) {
				computerDice = dice.roll();
				computerDiceSum += computerDice;
			} 
			computerCount++;
			System.out.println("합계: " + computerDiceSum);
			System.out.println("========================");
			System.out.println();

			System.out.println("내 차례");
			System.out.println("주사위 고르세요 (3개 -> 123 형식으로 입력");
			String userDiceAnswer = sc.next();
			for(int i = 0; i < 3; i++) {
				userDice = userDiceAnswer.charAt(i);
				if(userDice == '1') {
					userDice = (char) dice.roll();
				} else if (userDice == '2') {
					userDice = (char) dangerdice.roll();
				} else if (userDice == '3') {
					userDice = (char) safedice.roll();
				} else if (userDice == '4') {
					userDice = (char) sosodice.roll();
				} else {
					System.out.println("잘못 입력하셨습니다");
					System.out.println("이번 턴은 0점입니다");
					break;
				}
				userDiceSum += userDice;
			} 
			userCount++;
			System.out.println("합계: " + userDiceSum);
			System.out.println("========================");
			System.out.println();
			System.out.println("현재 나의 총합: " + userDiceSum
					+ " / " + "주사위 굴린 횟수: " + userCount);
			System.out.println("현재 강아지 총합: " + computerDiceSum
					+ " / " + "주사위 굴린 횟수: " + computerCount);
		}

		if(userDiceSum >= computerDiceSum && userCount >= computerCount) {
			System.out.println("당신이 이겼습니다");
		} else if(userDiceSum == computerDiceSum && userCount == computerCount) {
			System.out.println("비겼습니다");
		} else if(userDiceSum <= computerDiceSum && userCount <= computerCount){
			System.out.println("제가 이겼습니다");
		} return;
	} 
	// 사용자가 졌을 때 (컴퓨터가 먼저 턴을 갖게 됨)
}
