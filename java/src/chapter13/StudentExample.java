package chapter13;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentExample {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student std = new Student();
		
		boolean run = true;
		while(run == true) {
			message();
			String str = sc.next();
			
			if(str.equals("5")) {
				System.out.println("종료합니다");
				run = false;
				break;
			}
		
			switch(str) {
			case "1" :
				bsc(studentList, std);
				studentList.add(std);
				break;
				
//			case "2" :
//				mod(studentList, std);
//				studentList.add(std);
//				break;

			case "4" :
				tel(studentList);
				studentList.add(std);
				break;

			case "3" :
				grd(studentList);
				studentList.add(std);
				break;
			}
		}
	}
	
	static void message() {
		System.out.println("1. 학생 기본정보 입력");
		System.out.println("2. 정보수정");
		System.out.println("3. 성적입력");
		System.out.println("4. 연락처입력");
		System.out.println("5. 종료");
		System.out.println("===================");
	}
	
	static void bsc(ArrayList<Student> studentList, Student std) { //학생 기본 정보
		System.out.print("이름 ");
		std.setName(sc.nextLine());
		
		System.out.print("학년 ");
		String grade = sc.nextLine(); // 입력된 문자열 중에서 숫자만 제외하고 지움
		grade = grade.replace("학년", "");
		std.setClass1(Integer.parseInt(grade));
		
		System.out.print("반 ");
		String cla = sc.nextLine();
		cla = cla.replace("반", "");
		std.setClass2(Integer.parseInt(cla));
		
		System.out.print("번호 ");
		String num = sc.nextLine();
		num = num.replace("번", "");
		std.setNum(Integer.parseInt(num));
		
		if(Integer.parseInt(grade) < 10) {
			grade = "0" + grade;
		}
		if(Integer.parseInt(cla) < 10) {
			cla = "0" + cla;
		}
		if(Integer.parseInt(num) < 10) {
			num = "0" + num;
		}
		std.setStudentNum(grade + cla + num);

		System.out.println(std.getName() + " / " + std.getClass1() + " / " + std.getClass2() 
		+ " / " + std.getNum() + " / " + std.getStudentNum());	
		return;
	}
	
	static void tel(ArrayList<Student> studentList) {
		System.out.println("학번");
		String stuNum = sc.nextLine();

		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getStudentNum().indexOf(stuNum) == -1) {
				System.out.println("학번을 잘못 입력하셨습니다");
				i = studentList.size();
			} else {
				System.out.println("전화번호");
				String tel = sc.nextLine();
				studentList.get(i).setTel(tel);
				i = studentList.size();
				System.out.println("입력하신 전화번호: " + studentList.get(i).getTel());
			}
		}
		return;
	}

	static void grd(ArrayList<Student> studentList) { // 국어 수학 영어 사회 과학
		System.out.println("학번 입력");
		String stuNum = sc.nextLine();
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getStudentNum().indexOf(stuNum) == -1) {
				System.out.println("학번을 잘못 입력하셨습니다");
				i = studentList.size();
			} else {
				System.out.print("국어 점수 ");
				String kor = sc.nextLine();
				kor = kor.replace("점", "");
				studentList.get(i).setKor(Integer.parseInt(kor));
				
				System.out.print("수학 점수 ");
				String mat = sc.nextLine();
				mat = mat.replace("점", "");
				studentList.get(i).setMat(Integer.parseInt(mat));
				
				System.out.print("영어 점수 ");
				String eng = sc.nextLine();
				eng = eng.replace("점", "");
				studentList.get(i).setEng(Integer.parseInt(eng));
				
				System.out.print("사회 점수 ");
				String soc = sc.nextLine();
				soc = soc.replace("점", "");
				studentList.get(i).setSoc(Integer.parseInt(soc));
				
				System.out.print("과학 점수 ");
				String sci = sc.nextLine();
				sci = sci.replace("점", "");
				studentList.get(i).setSci(Integer.parseInt(sci));
				
				i = studentList.size();
			}
		} 
		return;
	}
	
//	static void mod(ArrayList<Student> studentList, Student std) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("학번");
//		String stdNum = sc.nextLine();
//		
//		for(int i = 0; i < studentList.size(); i++) {
//			if(std.getStudentNum().indexOf(stdNum) == -1) {
//				System.out.println("잘못된 학번을 입력하셨습니다");
//			} else {
//				System.out.println(studentList.get(i).getName());
//				System.out.println(studentList.get(i).getClass1());
//				System.out.println(studentList.get(i).getClass2());
//				System.out.println(studentList.get(i).getNum());
//				System.out.println(studentList.get(i).getKor());
//				System.out.println(studentList.get(i).getMat());
//				System.out.println(studentList.get(i).getEng());
//				System.out.println(studentList.get(i).getSoc());
//				System.out.println(studentList.get(i).getSci());
//			}		
//		}	
//	}
}
