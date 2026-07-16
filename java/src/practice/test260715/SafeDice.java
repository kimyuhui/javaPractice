package practice.test260715;

import java.util.Random;

public class SafeDice extends Dice {
	// 일반주사위를 안전 주사위(새가슴 주사위)에 상속함

	int[] dice2 = {3, 3, 3, 4, 4, 4};
	int diceNumber2 = dice2.length;
	
	
	
	// 일반 주사위를 상속받았기 때문에
	// 일반 주사위에 구현된 인터페이스의 기능도 함께 상속받음
	@Override
	public int roll() {
		Random rd = new Random();
		int randomNumber2 = rd.nextInt(this.diceNumber2);
		int result2 = dice2[randomNumber2];
		
		System.out.println("새가슴 주사위 선택");
		System.out.println("결과: " + result2);
		
		return result2;
	}
}
