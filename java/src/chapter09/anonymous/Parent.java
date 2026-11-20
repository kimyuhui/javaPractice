package chapter09.anonymous;

public class Parent {
	class Child extends Parent {
		
	}
	
	void testMethod() {
		
	}
	
	class Test {
		Parent f = new Child();
		void method() {
			Parent localVar = new Child();
		}
		
	}
	
	
}
