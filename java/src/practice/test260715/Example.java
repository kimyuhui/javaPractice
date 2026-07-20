package practice.test260715;

import java.util.Scanner;

public class Example {

	public final static int gameScore = 20; 

	public static void main(String[] args) {
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
		
		while(userDiceSum < gameScore) {
			System.out.println("주사위 고르세요 (3개 -> 123 형식으로 입력");
			String userDiceAnswer = sc.next();
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 1; j++) {
					userDice = userDiceAnswer.charAt(i);
					if(userDice == '1') {
						userDice = (char) dice.roll();
					} else if (userDice == '2') {
						userDice = (char) dangerdice.roll();
					} else if (userDice == '3') {
						userDice = (char) safedice.roll();
					} else if (userDice == '4') {
						userDice = (char) sosodice.roll();
					} 
				} 
				userDiceSum += userDice;
			}
			userCount++;
			System.out.println("합계: " + userDiceSum);
			System.out.println("========================");

			for(int i = 0; i < 3; i++) {
				computerDice = dice.roll();
				computerDiceSum += computerDice;
			} 
			computerCount++;
			System.out.println("합계: " + computerDiceSum);
			System.out.println("========================");
			
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
		}
	} 
}
