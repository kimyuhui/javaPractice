package chapter14;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrinteStreamExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Users/kj/Desktop/김유희/printStreamTest.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[프린터 보조 스트림]");
		ps.print("마치");
		ps.println("프린터가 출력하는 것처럼 ");
		ps.println("데이터를 출력합니다.");
		
		ps.flush();
		ps.close();

	}

}
