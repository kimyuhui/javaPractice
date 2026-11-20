package chapter06.classExam;

public class Example {
	public static void main(String[] args) {
		Car c = new Car(30, 0);
		Car c2 = new Car(0, "red");
//		int result = test(1); <- Type mismatch : void에 int를 저장할 수 없음 
		
//		void result = test(1); <- void is an invalid type for the variable result : void는 반환값이 없으므로 저장도 못함
		
		test(1); // 실행됨 void는 실행만 시키는 역할
		
		c.speed = 50;
		// 객체는 똑같은 클래스 내에서 만들었어도 완전 별개라서 c2의 값은 바뀌지 않음
		
		
	}
	
	static void test(int num ) {
		return;
		// ... <- 배열[] 대신 ... <- 숫자들을 받아서 배열로 만든다
		
	}
	
	void test1(int...num) {
		return;
		
//		int sum = 0;
//		for(int n : num) {
//			sum+=n;
//		}
		// -> unreachable code -> return 아래에 만들어서 동작하지 않음
		
		// void일 때도 리턴이 됨 -> 반환하는 값이 없고 메소드의 종료를 알려주는 역할
	}
	
}
