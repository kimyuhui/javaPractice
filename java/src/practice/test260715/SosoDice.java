package practice.test260715;

import java.util.Random;

public class SosoDice extends Dice {
	// 일반 주사위를 애매한 주사위(개껌 주사위)에 상속함
	
	int[] dice3 = {2, 2, 2, 5, 5, 5};
	int diceNumber3 = dice3.length;
	
	
	// 일반 주사위의 기능을 상속받았기 때문에
	// 일반 주사위에 구현된 인터페이스의 기능도 함께 상속받음
	@Override
	public int roll() {
		Random rd = new Random();
		int randomNumber3 = rd.nextInt(this.diceNumber3);
		int result3 = dice3[randomNumber3];
		
		System.out.println("개껌주사위 선택");
		System.out.println("결과: " + result3);
		
		return result3;
	}

}
