package chapter4;

import java.util.Random;
import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
		Random rn = new Random(); //Random 기능 사용하기
		Scanner sc = new Scanner(System.in); //Scanner 기능 사용하기
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.next(); //console에서 이름 입력받기 
		
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		
		System.out.println("안녕하세요 " + name + " 님" + " ^^");
		System.out.println("오늘의 운세는...");
	
		String[] mes = {
				"좋은 하루가 될 것입니다!", "즐거운 하루가 될 것입니다!",
				"건강한 하루가 될 것입니다!", "쉬어가는 하루 되세요!"
		}; //출력될 메시지들... 여러개의 값을 넣을 때는 [] 붙이기? 
		
		
		System.out.println(mes[rn.nextInt(mes.length)]);


	

	}

}
