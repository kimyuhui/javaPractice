package test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) throws Exception {
		byte[] fileData = Files.readAllBytes(Paths.get("C:/Users/kj/Desktop/김유희/image/bg.png"));

		for (int i = 0; i < fileData.length; i++) {
		    fileData[i] = (byte) (~fileData[i]); 
		}

		Files.write(Paths.get("C:/Users/kj/Desktop/김유희/image/bg.잠김"), fileData);
		Files.delete(Paths.get("C:/Users/kj/Desktop/김유희/image/bg.png"));
		System.out.println("성공적으로 파일이 잠겼고 원본이 삭제되었습니다.");
	}
}