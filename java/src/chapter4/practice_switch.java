package chapter4;

import java.util.Scanner;

public class practice_switch {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in); //Scanner 기능으로 Console에 입력할 수 있게 하기
		
		System.out.print("첫 번째 숫자: "); 
		double num1 = sc.nextDouble(); //Double.parseDouble(sc.nextLine())으로 입력 가능
		                               //num1 = sc에 입력한 숫자, 소수점 둘째자리까지 계산해야 해서 double로 입력
		
		System.out.print("두 번째 숫자: ");
		double num2 = sc.nextDouble();
		
		System.out.print("어떤 계산을 하시나요?(+ - * /) : ");
		String str = sc.next(); // nextLine으로 하면 위에서 Double을 입력한 뒤 엔터 쳐서 오류 -> next로
		                        // sc에 입력한 문자열
		
		
		
		System.out.println("------");
		//str에 + - * /값이 들어오면 switch 실행하기
		//str.equals() 안에 문자열을 여러개 넣을수 없음 하나씩 하기
		if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
	
			switch(str) {
			case "+": 
				System.out.printf("답: %.2f", (num1 + num2));
				break; //더하기, 실수의 소수점 둘째자리까지 나와야 하므로 %.2f 
				       //break 넣지 않으면 case 처음부터 끝까지 실행하므로 꼭 case 끝마다 넣기
			
			case "-":
				System.out.printf("답: %.2f", (num1 - num2));
				break;
				
			case "*":
				System.out.printf("답: %.2f", (num1 * num2));
				break;
				
			case "/":
				if(num2 == 0) { // 0일 경우에 아래 문구 출력되게 하기 : else 뒤에 이것을 적으면 (답: %.2f) 부분이 먼저 계산되어 함께 출력되므로 위에 적기
					System.out.printf("0은 계산할 수 없습니다");}
				else {
					System.out.printf("답: %.2f\n", (num1 / num2));}
					break; // num1이나 num2가 0이면 아래의 문구 출력
				} 
		} else {System.out.println("잘못된 입력입니다");} //str에 + - * / 이외의 문자열이 들어오면 해당 문구 출력
	}
}
		


