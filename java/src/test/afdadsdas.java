package test;

import java.util.Scanner;

public class afdadsdas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("진법 n, 미리 구할 숫자의 개수 t, 게임에 참가하는 인원 m, 튜브의 순서 p");
		System.out.println("(띄어쓰기로 구분)");
		String number = sc.nextLine();
		
		String[] str = number.split(" ");
		
		solution(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]));

	}

	
	    public static String solution(int n, int t, int m, int p) {
	            String answer = "";
	            String a = "";
	            
	            for(int i = 0; i < m * t; i++) {
	                String str = Integer.toString(i, n);
	                str = str.toUpperCase();
	                a = a + str;
	            }
	                     
	            char[] b = new char[t];
	            for(int i = 0; i < t; i++) {
	                b[i] = a.charAt(p + (m * i) - 1);
	                answer += String.valueOf(b[i]);
	                System.out.println(answer);
	            }  
	            return answer;
	        }
	    }