package chapter12;

public class ThreadExample {

	public static void main(String[] args) {
		Runnable task = new Task();
		Thread thread = new Thread(task);

		thread.start();
		print();
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
	}

	static void print() {
		System.out.println("print method입ㄴ디ㅏ");
	}
}
