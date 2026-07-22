package chapter13;

public class Student {

		private String StudentNum;
		private String name;
		private String class1;
		private String class2;
		private String num;
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
			StudentNum = studentNum;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getClass1() {
			return class1;
		}
		public void setClass1(String class1) {
			if(class1.indexOf("학년") == -1) {
				class1 = class1 + "학년";
			}
			this.class1 = class1;
		}
		public String getClass2() {
			if(class2.indexOf("반") == -1) {
				class2 = class2 + "반";
			}
			return class2;
		}
		public void setClass2(String class2) {
			this.class2 = class2;
		}
		public String getNum() {
			return num;
		}
		public void setNum(String num) {
			this.num = num;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
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
