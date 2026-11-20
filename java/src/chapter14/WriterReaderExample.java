package chapter14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class WriterReaderExample {
	public static void main(String[] args) throws Exception {
//		Writer wt = new FileWriter("C:/Users/kj/Desktop/김유희/test.txt");
		
		// 한글자씩 넣기
//		char a = 'A';
//		char b = 'B';
//		char c = 'C';
		
		// 배열을 입력하여 여러글자 한번에 넣기
//		char[] a = 'A';
//		char[] b = 'B';
//		char[] c = 'C';
//		
//		wt.write(a);
//		wt.write(b);
//		wt.write(c);
		
//		char[] charArray = {'H', 'E', 'L', 'L', 'O'};
		
//		wt.write(charArray);
//		wt.write(charArray, 1, 2);
		
		//String을 이용하여 여러글자 한번에 넣기
		String str = "Hello Java!";
		
//		wt.write(str);
//		wt.write(str, 1, 5);
//		
//		wt.flush();
//		wt.close();
//		
//----------------------------------------------------------------------------------------
		Reader reader = new FileReader("C:/Users/kj/Desktop/김유희/test.txt");
		
//		String str1 = "";
//		// 한글자씩 가져오기
//		while(true) {
//			int data = reader.read();
//			if(data == -1) break;
//			str1 += String.valueOf((char)data);
//			System.out.println((char) data);
//		}
//		System.out.println(str1);
//		
		
		char[] buffer = new char[100];
		
		while(true) {
			int readCharNum = reader.read(buffer);
			if(readCharNum == -1) break;
			for(int i = 0; i < readCharNum; i++) {
				System.out.print(buffer[i]);
			}
			System.out.println();
		}
		
//		for(char c : buffer)
//			System.out.println(c);
//		
		
//		int readCharNum2 = reader.read(buffer);
//		if(readCharNum2 != -1) {
//			for(int i = 0; i < readCharNum2; i++) {
//				System.out.println(buffer[i]);
//			}
//		}
		
		reader.close();
		
	}

}
