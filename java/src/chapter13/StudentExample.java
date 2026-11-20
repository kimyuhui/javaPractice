package chapter13;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentExample {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Student> stdList = new ArrayList<Student>();

		Student std = new Student();
		
		stdInfo(std);
		stdList.add(std);
		
		System.out.println("학번을 입력해주세요");

		
		
	}
	
	static void score(Student std) {

		
		
	}
	
	
	static void stdInfo(Student std) {
		System.out.println("이름을 입력하세요");
		std.setName(sc.nextLine());
		System.out.println("학년 반 번호를 입력하세요");
		String str = sc.nextLine();
		std.setGrade(Integer.parseInt(str.split(" ")[0].replace("학년", "")));
		std.setClas(Integer.parseInt(str.split(" ")[1].replace("반", "")));
		std.setNum(Integer.parseInt(str.split(" ")[2].replace("번", "")));
		
		System.out.println(std.getGrade() + "학년 " + std.getClas() + "반 " + std.getNum() + "번 " + std.getName());
		System.out.println("학번: " + std.getStudentNum());
		System.out.println("입력되었습니다");
		
	}
	
}
