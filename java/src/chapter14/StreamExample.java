package chapter14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class StreamExample {

	public static void main(String[] args) throws Exception {
		write("안녕하세요 지금은 11시 31분입니다.");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Users/kj/Desktop/김유희/teststream.txt");
		Writer writer = new OutputStreamWriter(fos);
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception {
		FileInputStream fis = new FileInputStream("C:/Users/kj/Desktop/김유희/teststream.txt");
		Reader reader = new InputStreamReader(fis);
		
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		reader.close();
		String data = new String(buffer, 0, readCharNum);
		
		return data;
		
		
	}
}
