package chapter6;

class Student {
	String name;
	String tel;
	                 //필드 - 타입 변수 (int adfasd)
	int korea;
	int english;
	int math;
					
	/* Student라는 객체를 만들고싶다
	 * Student라는 공간안에 이름, 각 과목들의 점수, 연락처 
	 *  ㄴ 이것들을 묶어서 std1이라는 이름을 붙여놓음
	 *  
	 *  new Student(생성자)로 실행 -> 정보를 넣을 Student라는 공간을 새로만듦 
	 *                             클래스를 인스턴스화 시킬 때 초기화하는 것을 도와주는 역할??
	 * 
	 * 클래스 안에 필드 안에 메소드
	 * 
	 * 
	 */
	Student(String inputName){
		this.name = inputName; //this -> 클래스 안에 있는 필드들 중에서 찾기
	}
	
	double average() {
		double average = ((double)this.korea + (double)this.english + (double)this.math) / 3;
		return average; // 계산이 끝나면 저장된 값을 반환해서 보여준다
	}
	
}

public class exam6_01 {
	
	String studentName;
	
	exam6_01(){}
	exam6_01(String name){
		
		this.studentName = name;
	}
	
	public static void main(String[] args) {
		Student std1 = new Student("김유희");
		Student std2 = new Student("김희유");
		System.out.println(std1.name);
		System.out.println(std2.name);
		 
		std1.korea = 100;
		std1.math = 110;
		std1.english = 120;
		
		System.out.println(std1.average());
		 
	}

}
