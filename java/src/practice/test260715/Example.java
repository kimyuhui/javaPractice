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
		
		String computerDice;
		String computerDiceResult;
		String computerDiceSum;

		
		int userDice; // 유저가 선택할 주사위 숫자

		int userDiceSum = 0;
		
		int count = 0;
		System.out.println("주사위 고르세요");
		
		
		while(userDiceSum < gameScore) {
			
			
		for(int i = 0; i < 3; i++) {
			userDice = Integer.parseInt(sc.next());
			if(userDice == 1) {
				userDice = dice.roll();
			} else if (userDice == 2) {
				userDice = dangerdice.roll();
			} else if (userDice == 3) {
				userDice = safedice.roll();
			} else if (userDice == 4) {
				userDice = sosodice.roll();
			}
			for(int j = 0; j == 0; j++) {
				userDiceSum += userDice;
				System.out.println("합계: " + userDiceSum);
			} 
		} count++;
		System.out.println(count + "번 끝 ");
		
		
	}
	}

}
