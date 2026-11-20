package chapter14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class InputOutputStream {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Users/kj/Desktop/김유희/test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
//		byte[] array = {10, 20, 30};
//		
//		os.write(array);
//
//		os.flush();
//		os.close();
		
		InputStream is = new FileInputStream("C:/Users/kj/Desktop/김유희/test1.db");
		while(true) {
			int data = is.read();
			if(data == -1) break;
			System.out.println(data);
		}
		is.close();
		
		
	}

}
