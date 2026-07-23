package chapter13;

public class Student {

		private String StudentNum;
		private String name;
		private int class1;
		private int class2;
		private int num;
		private String tel;
		private String gender;
		private int kor;
		private int mat;
		private int eng;
		private int soc;
		private int sci;
		private int ave;
		
		public String getStudentNum() {
			return StudentNum;
		}
		public void setStudentNum(String studentNum) {
			this.StudentNum = studentNum;
		}
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
		public String getClass1() {
			return class1 + "학년";
		}
		public void setClass1(int class1) {
			this.class1 = class1;
		}
		
		
		public String getClass2() {
			return class2 + "반";
		}
		public void setClass2(int class2) {
			this.class2 = class2;
		}
		
		
		public String getNum() {
			return num + "번";
		}
		public void setNum(int num) {
			this.num = num;
		}
		
		
		public String getTel() {
			tel = tel.substring(0, 3) + "-" + tel.substring(3, 7) + "-" + tel.substring(7, 11);
			return tel;
		}
		public void setTel(String tel) {
			String telSet = tel.replace("-", "");
			if(tel.length() == 8) {
				telSet = "010" + telSet;
			}
			this.tel = telSet;
		}
		
		
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
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
		public int getAve() {
			return ave;
		}
		public void setAve(int ave) {
			this.ave = ave;
		}
	
	

}
