package chapter4;

public class practice3 {

	public static void main(String[] args) {
	
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("-------------------");
		
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------------------");
		
		for(int i = 1; i <= 5; i++) {				
			for(int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k < i*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("--------------------");
		
		
		
		for(int i = 1; i <=5; i++) {
			for(int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			for(int k = 11; k > i*2; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		System.out.println("--------------------");
		
		
		for(int i = 1; i <=3; i++) {
			for(int j = 2; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k<i*2; k++) {
				System.out.print("*");
			}
			System.out.println();
			}
		for(int i = 1; i <=2; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = 5; k > i*2; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		
		
		for(int i = 1; i <=3; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 7; k > i*2; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i <=2; i++) {
			for(int j = 1; j >= i; j--) {
			System.out.print(" ");}
			for(int k = 1; k <= 2*i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		
		for(int i = 1; i <= 7; i++) {
			for (int k = 1; k <= i; k++) { 
				System.out.print("*");
			}
			for(int j = 6; j >= i; j--) {
			System.out.print(" ");
			}
			for(int l = 7; l >= i; l--) {
				System.out.print("*");
			}
			System.out.println();
			}
		
		for(int i = 1; i <= 7; i++) {
			for (int k = 6; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) { 
				System.out.print("*");
			}
			for(int l = 1; l < i; l++) {
				System.out.print(" ");
			}
			for(int m = 7; m >= i; m--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("----------------------");
	}


}
		
	


