package practice.test260715;

import java.util.Random;

public class DangerDice extends Dice {
	// 일반 주사위를 모아니면도 주사위(고구마훔치기 주사위)에 상속함
	
	int[] dice1 = {1, 1, 1, 6, 6, 6};
	int diceNumber1 = dice1.length;
	
	
	
	// 일반 주사위의 기능을 상속받았기 때문에
	// 일반 주사위에 구현된 인터페이스의 기능도 함께 상속받음
	@Override
	public int roll() {
		Random rd = new Random();
		int randomNumber1 = rd.nextInt(this.diceNumber1);
		int result1 = dice1[randomNumber1];
		
		System.out.println("고구마훔치기 주사위 선택");
		System.out.println("결과: " + result1);
		
		return result1;
	}
	

}
