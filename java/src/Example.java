import java.util.Random;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] number = new int[4];
		
		Random rd = new Random();
		
		for(int i = 0; i < number.length; i++) {
			int rdNum = rd.nextInt(10);
			boolean duplicate = true;
			
			while(duplicate) {
				duplicate = false;
				for(int j = 0; j < i; j++) {
					if(rdNum == number[j]) {
						duplicate = true;
						break;
					}
				}
				if(duplicate) {
					rdNum = rd.nextInt(10);
				}
			}
			number[i] = rdNum;
		}
		
		for(int i = 0; i < number.length; i++) {
			System.out.print(number[i]);
		}System.out.println();
		
		System.out.println("종료하시려면 \"종료\" 입력하세요");
		
		while(true) {

			System.out.println("숫자를 입력하세요");
			String userNum = sc.nextLine();
			
			if(userNum.equals("종료")) {
				break;
			}

			if(userNum.length() != 4) {
				System.out.println("잘못된 입력입니다");
				continue;
			}

			String[] userNumArray = userNum.split("");

			int ball = 0;
			int strike = 0;

			for(int i = 0; i < number.length; i++) {
				for(int j = 0; j < userNumArray.length; j++) {
					if(Integer.parseInt(userNumArray[j]) == number[i] && i == j) {
						strike++;
					} else if(Integer.parseInt(userNumArray[j]) == number[i] && i != j) {
						ball++;
					}
				}
			}

			if(ball == 0 && strike == 0) {
				System.out.println("foul");
			}

			System.out.println("ball: " + ball);
			System.out.println("strike: " + strike);
			
			if(strike == 4) {
				System.out.println("정답입니다");
				break;
			}

		}
	}

}
