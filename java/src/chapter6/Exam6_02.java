package chapter6;

import java.util.Scanner;

public class Exam6_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 두 개를 입력해 주세요.");
		String input = sc.nextLine();
		double[] number = new double[2];
		double result = 0;
		number[0] = Double.parseDouble(input.split(" ")[0]);
		number[1] = Double.parseDouble(input.split(" ")[1]);
		
		System.out.print("기호를 입력해 주세요. >>");
		String input2 = sc.nextLine();
		
		switch(input2) {
		case "+": {
			result = add(number[0], number[1]);
			break;
		}
		case "-": {
			result = min(number[0], number[1]);
			break;
		}
		case "*": {
			result = sub(number[0], number[1]);
			break;
		}
		case "/": {
			result = div(number[0], number[1]);
			break;
		}
		}
		
		System.out.printf("%.0f %s %.0f = %.0f", number[0], input2, number[1], result);
	}

	public static double add(double number1, double number2) {
				// 내가 결과를 보내줘야하는 자료형 
		//               ㄴ public static [ 여기에 입력  ] 메서드이름(매개변수, 파라미터라고도 함) <- 이런 형식
				// 매개변수가 있고 return을 해주어야 하는 메서드를 위와 같이 입력
		
				// 매개 변수가 없는 경우 비워둘 수 있음
				// return이 필요 없는 경우 (메서드가 끝나고 뭔가 연산되거나 보여줄 것이 없을 때) 
		        //                     -> public static void 사용
		
		
		double result = number1 + number2;
		return result;
	}
	
	
	public static double min(double number1, double number2) {
		double result = number1 - number2;
		return result;
	}

	public static double sub(double number1, double number2) {
		double result = number1 * number2;
		return result;
	
	}
	public static double div(double number1, double number2) {
		double result = number1 / number2;
		return result;
	}

}
