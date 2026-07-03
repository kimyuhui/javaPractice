package chapter3;

public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c1 = 'a';
		int i1 = c1;
		int i2 = c1 + 1;
		char c2 = (char) i2;
				System.out.println(c2);
				
		int x = 5;
		int y = 2;
		int result = x / y;
		System.out.println(result);
		
		double var1 = 3.5;
		double var2 = 2.7;
		int result1 = (int) (var1 + var2);
		
		long ar1 = 2L;
		float ar2 = 1.8f;
		double ar3 = 2.5;
		String ar4 = "3.9";
		int result2 = (int)(ar1 + ar2 + ar3) + (int)Double.parseDouble(ar4);
		System.out.println(result2);
	}
	
}
