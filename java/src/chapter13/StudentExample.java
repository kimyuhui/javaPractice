package chapter13;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student std = new Student();
		
		bsc(std);
		
	}

	
	static void bsc(Student std) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 ");
		std.setName(sc.nextLine());
		System.out.print("학년 ");
		std.setClass1(sc.nextLine());
		System.out.print("반 ");
		std.setClass2(sc.nextLine());
		System.out.print("번호 ");
		std.setNum(sc.nextLine());
		
		std.setStudentNum(std.getClass1() + std.getClass2() + std.getNum());

		
		
	}
}
