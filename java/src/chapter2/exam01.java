package chapter2;

public class exam01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int sum = a + b;
		int sum2 = (a * 10) + (b + 3);

		a = 50;
		sum = a + b;

		// System.out.println("sum : " + sum);

		int x = 3;
		int y = 5;
		//System.out.println("x : " + x + " / y : " + y);

		int temp = x;
		x = y;
		y = temp;
		//System.out.println("x : " + x + " / y : " + y);
		
		byte bt1 = 100;
		byte bt2 = -100;
		//byte bt3 = 128; // 범위 벗어남
		short st1 = 128;
		short st2 = 30000;
		//short st3 = 100000; // 범위 벗어남
		int it1 = 150000;
		int it2 = 95000000;
		//int it3 = 2200000000;
		
		long ln1 = 100000000000L;
		
		char ch1 = 'A';
		//System.out.println("ch1 : " + ch1);
		
		//System.out.println("a : " + a);
		
		sum = a + (int)ch1;
		//System.out.println("sum : " + sum);
		
		String str = "I like apple."; 
		//System.out.println(str);
		
		
		String name = "김지현";
		String job = "강사";
		
		String str1 = "내 이름은 " + name + "이고요,\n직업은 " + job + "입니다";  
		//System.out.println(str1);
		
		String str2 = "김지현은 생각을 했습니다. '집에 가고싶다...'";
		//System.out.println(str2);
		
		float num1 = 10.4f, num2 = 5.7f;
		//int div = num1 / num2;
		float div = num1 / num2;
		
		System.out.println(div);
		
		double db1 = 3.14;
		double db2 = 7.5;
		
		double dbsum = db1 + db2;
		
		System.out.println(dbsum);
		
	}

}
