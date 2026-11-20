package chapter13;

public class Student {
	private String name;
	private int grade;
	private int clas;
	private int num;
	private String tel;
	private String studentNum;
	private int kor;
	private int mat;
	private int eng;
	private int soc;
	private int sci;
	private int average;
	
	
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
		tel = tel.replaceAll("[^0-9]", "");
		if(tel.length() == 8) {
			tel = "010" + tel;
		}
		tel = tel.substring(0, 3) + "-" + tel.substring(3, 7) + "-" + tel.substring(7, 11);
		
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	public String getStudentNum() {
		String str = String.valueOf(this.grade);
		if(this.clas < 10) {
			str = str + "0" + this.clas;
		}
		if(this.num < 10) {
			str = str + "0" + this.num;
		}
		
		return str;
	}
	
	
	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}
	
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	
	public int getSoc() {
		return soc;
	}
	public void setSoc(int soc) {
		this.soc = soc;
	}
	
	
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	
	
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	
	
	
	

}
