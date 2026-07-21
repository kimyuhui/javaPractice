package practice.test260715;

import java.util.Random;
import java.util.Scanner;

public class Example {

	public final static int gameScore = 20; 

	public static void main(String[] args) {
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
		} 
	}
}