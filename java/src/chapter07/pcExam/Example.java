package chapter07.pcExam;


public class Example {

	public static void main(String[] args) {

		
		for(int i = 5; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			} System.out.println();
		} 
		
		
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			} System.out.println();
		}
		
		
		System.out.println();
		
		
		for(int i = 0; i < 3; i++) {
			for(int j = 2; j > i; j--) {
				System.out.print(" ");
			}
			
			for(int k = 0; k <= i*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 2; k >= 2 * i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			} 
			
			for(int k = 4; k >= 2 * i; k--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 2; j > i; j--) {
				System.out.print(" ");
			}
			
			for(int k = 0; k <= 2 * i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		
		
		
		
	}
}
