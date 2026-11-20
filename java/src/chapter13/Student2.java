package chapter13;

public class Student2 {
	private String studentNumber;
	private String name;
	private int grade;
	private int clas;
	private int num;
	private String tel;
	private String gender;
	private double kor;
	private double eng;
	private double mat;
	private double sci;
	private double soc;
	private double average;
	
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber() {
		
		String str = String.valueOf(this.grade);
		
		if(clas < 10) str += "0" + this.clas;
		else str += this.clas;
		
		if(num < 10) str += "0" + this.num;
		else str += this.num;
		
		this.studentNumber = str;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClas() {
		return clas;
	}
	public void setClas(int clas) {
		this.clas = clas;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		// 01012345678
		// 010-1234-5678
		
		tel = tel.replace("-", "");
		Integer.parseInt(tel);
		
		this.tel = tel.substring(0,3) + "-" + tel.substring(3,7) + "-" + tel.substring(7,11);
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		if("남".equals(gender) || "남자".equals(gender)) {
			this.gender = "남";
		}else if ("여".equals(gender) || "여자".equals(gender)) {
			this.gender = "여";
		}else {
			System.out.println("잘못된 값이 입력되었습니다.");
			System.out.println("현재 입력된 값 : " + gender);
		}
		
		this.gender = gender;
	}
	public double getKor() {
		return kor;
	}
	public void setKor(double kor) {
		this.kor = kor;
	}
	public double getEng() {
		return eng;
	}
	public void setEng(double eng) {
		this.eng = eng;
	}
	public double getMat() {
		return mat;
	}
	public void setMat(double mat) {
		this.mat = mat;
	}
	public double getSci() {
		return sci;
	}
	public void setSci(double sci) {
		this.sci = sci;
	}
	public double getSoc() {
		return soc;
	}
	public void setSoc(double soc) {
		this.soc = soc;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage() {
		this.average = (this.kor + this.eng + this.mat + this.sci + this.soc) / 5;
	}
}
