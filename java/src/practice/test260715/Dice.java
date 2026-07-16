package practice.test260715;

import java.util.Random;

public class Dice implements DiceRoll {
		// 일반 주사위 (마약방석 주사위)
	
		int[] dice0 = {1, 2, 3, 4, 5, 6};
		int diceNumber0 = dice0.length;
	
	@Override // 인터페이스의 기능을 일반 주사위에 구현함
	public int roll() { 
		Random rd = new Random();
		int randomNumber0 = rd.nextInt(this.diceNumber0);
		int result0 = dice0[randomNumber0];

		System.out.println("마약방석 주사위 선택");
		System.out.println("결과: " + result0);
	
		return result0; 
		
	}
}
