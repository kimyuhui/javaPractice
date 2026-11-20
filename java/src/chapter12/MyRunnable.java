package chapter12;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try { Thread.sleep(1000); } catch (InterruptedException e) {}
			System.out.println(i + "초");
		}
	}







	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread thread = new Thread(mr);
		
		thread.start();
		
	}
}

