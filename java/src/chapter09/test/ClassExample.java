package chapter09.test;


public class ClassExample {

	public static void main(String[] args) {
		Test test = new Test();
		Test.Apple apple = test.new Apple();		
		Test.Apple apple2 = test.new Apple();		
		
//		Test.Apple2 staticApple = new Test.Apple2();

		apple.appleCnt = 10;
		apple.applePrint();

		apple2.appleCnt = 20;
		apple.applePrint();
		apple2.applePrint();
		
		apple.appleTest();
		
	}
}

// ClassExample$1test.class