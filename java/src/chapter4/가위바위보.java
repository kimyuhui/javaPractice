package chapter4;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

	
		System.out.print("가위, 바위, 보 중 하나를 입력해 주세요. : ");
		String s = sc.next(); //콘솔에 치는걸 s에 저장하겠다
		
		String[] mes = {"가위", "바위", "보"};
		//출력될 메시지들... 여러개의 문자열을 넣을 때는 [] 붙이기? 
		
		System.out.println("컴퓨터: " + mes[rd.nextInt(mes.length)]);
		// 배열을 랜덤으로 뽑아야 해서 nextInt를 사용한다???? 
		
		if(s.equals("가위")) {
			if(mes.equals("가위")) {
				System.out.println("비겼습니다");
			} else if(mes.equals("바위")) {
				System.out.println("제가 졌네요");
			} else if(mes.equals("보")) {
				System.out.println("제가 이겼습니다!!");
			} 
		} else if(s.equals("바위")) {
			if(mes.equals("가위")) {
				System.out.println("제가 이겼습니다!!");
			} else if(mes.equals("바위")) {
				System.out.println("비겼습니다");
			} else if(mes.equals("보")) {
				System.out.println("제가 졌네요");
			} 
		} else if(s.equals("보")) {
			if(mes.equals("가위")) {
				System.out.println("제가 졌네요");
			} else if(mes.equals("바위")) {
				System.out.println("제가 이겼습니다!!");
			} else if(mes.equals("보")) {
				System.out.println("비겼습니다");
			}
		} else {System.out.println("잘못된 입력을 하셨습니다");}

		}
	}

