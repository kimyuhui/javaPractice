package chapter06.classExam;

public class Car {
	final int MAX_SPEED = 300;
	int speed;
	String color;
	
	//overloading : 같은 이름으로 여러 양식 만들기 - 자료형과 자료 개수가 다르면 다르다고 인식함(다형성)
	//overriding : 덮어씌우기
	
	Car(String color, int speed) {		
		this.speed = 0;
	}
	// 오버로딩 가능 매개변수 받는 순서가 달라서
	
//	Car(int speed, int gas){}
//	
//	Car(int gas, int speed){}
	// 변수명이 다르지만 자료형이 같아서 오버로딩 불가능
	
	Car(int speed, int gas){
		this.speed = speed;
	}
	
	Car(int gas, String color) {
		this(0, 10);
	}
	
	
	
	int sum(int a, int b) {
		return a + b;
	}
}
