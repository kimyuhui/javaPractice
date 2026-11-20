package chapter13;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentExample2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Student2> stdList = new ArrayList<Student2>(); 
		while(true) {
			System.out.println("실행할 메뉴를 선택해 주세요.");
			System.out.println("1. 학생정보등록");
			System.out.println("2. 연락처등록");
			System.out.println("3. 성적입력");
			System.out.println("4. 학생정보수정");
			
			String selectMenu = sc.nextLine();
			String stdNum = null;
			switch(selectMenu) {
			case("1"):
				Student2 stdInfo = inputInfo();
				if(stdInfo != null)
					stdList.add(stdInfo);
				else
					System.out.println("학생정보를 다시 입력하시겠습니까?");
				break;
			case("2"):
				System.out.print("변경할 학생의 학번을 입력해주세요 : ");
				stdNum = sc.nextLine();
				
				for(Student2 std : stdList) {
					
					if(stdNum.equals(std.getStudentNumber())) {
						inputTel(std);
					}
				}
				break;
			case("3"):
				System.out.print("변경할 학생의 학번을 입력해주세요 : ");
				stdNum = sc.nextLine();
			
				for(Student2 std : stdList) {
					
					if(stdNum.equals(std.getStudentNumber())) {
						inputPoint(std);
					}
				}
				break;
			case("4"):
				System.out.print("변경할 학생의 학번을 입력해주세요 : ");
				stdNum = sc.nextLine();
			
				for(Student2 std : stdList) {
					
					if(stdNum.equals(std.getStudentNumber())) {
						updateInfo(std);
					}
				}
			}
		}
	}

	static void updateInfo(Student2 std) {
		System.out.println("수정할 내용을 선택하세요 : ");
		System.out.println("1. 이름");
		System.out.println("2. 학년");
		System.out.println("3. 반");
		System.out.println("4. 번호");
		System.out.println("5. 연락처");
		
		String selectMenu = sc.nextLine();
		String inputInfo = null;
		switch(selectMenu) {
		case("1"):
			System.out.println("현재 입력된 이름 : " + std.getName());
			System.out.print("변경할 이름:");
			inputInfo = sc.nextLine();
			std.setName(inputInfo);
			break;
		case("2"):
			System.out.println("현재 입력된 학년 : " + std.getGrade());
			System.out.print("변경할 학년:");
			inputInfo = sc.nextLine();
			std.setGrade(Integer.parseInt(inputInfo.replace("학년", "")));
			std.setStudentNumber();
			break;
		case("3"):
			System.out.println("현재 입력된 반 : " + std.getClas());
			System.out.print("변경할 반:");
			inputInfo = sc.nextLine();
			std.setClas(Integer.parseInt(inputInfo.replace("반", "")));
			std.setStudentNumber();
			break;
		case("4"):
			System.out.println("현재 입력된 번호 : " + std.getNum());
			System.out.print("변경할 번호:");
			inputInfo = sc.nextLine();
			std.setNum(Integer.parseInt(inputInfo.replace("번", "")));
			std.setStudentNumber();
			break;
		case("5"):
			System.out.println("현재 입력된 연락처 : " + std.getTel());
			System.out.print("변경할 연락처:");
			inputInfo = sc.nextLine();
			std.setTel(inputInfo);
			break;
		}
		
	}
	
	static void inputPoint(Student2 std) {
		System.out.println("국어/영어/수학/사회/과학 순서로 입력해주세요.(각과목은 엔터로 구분)");
		std.setKor(Integer.parseInt(sc.nextLine()));
		std.setEng(Integer.parseInt(sc.nextLine()));
		std.setMat(Integer.parseInt(sc.nextLine()));
		std.setSoc(Integer.parseInt(sc.nextLine()));
		std.setSci(Integer.parseInt(sc.nextLine()));
	}
	
	static void inputTel(Student2 std) {
		System.out.println("===========<" + std.getName() + "> 연락처 입력=============");
		System.out.println("취소하시려면 숫자가아닌 다른것을 입력해주세요.");
		try {
			std.setTel(sc.nextLine());
		} catch (Exception e) {
			return;
		}
		
	}

	static Student2 inputInfo() {
		Student2 stdInfo = new Student2();
		// 입력받는 부분
		System.out.println("===========학생 정보 입력=============");
		System.out.print("이름 : ");
		stdInfo.setName(sc.nextLine());
		System.out.println("학년 반 번호 : ");
		try {
			String gcn = sc.nextLine();
			stdInfo.setGrade(Integer.parseInt(gcn.split(" ")[0].replace("학년", "")));
			stdInfo.setClas(Integer.parseInt(gcn.split(" ")[1].replace("반", "")));
			stdInfo.setNum(Integer.parseInt(gcn.split(" ")[2].replace("번", "")));
			stdInfo.setStudentNumber();
		} catch (Exception e) {
			System.out.println("학생정보가 정상적으로 입력되지 않았습니다..");
			stdInfo = null;
		}
		return stdInfo;
	}
}

