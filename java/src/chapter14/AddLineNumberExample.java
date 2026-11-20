package chapter14;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String filePath = "src/chapter14/AddLineNumberExample.java";
		
		FileReader reader = new FileReader(filePath);
		BufferedReader br = new BufferedReader(reader);
		
		int i = 1;
		while(true) {
			System.out.print(i + ": ");
			String data = br.readLine();
			if(data == null) break;
			System.out.println(data);
			i++;
		}
		br.close();
	}
}