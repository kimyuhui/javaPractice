package test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Encrypte {

	public static void main(String[] args) throws Exception {
		byte[] encryptedData = Files.readAllBytes(Paths.get("C:/Users/kj/Desktop/김유희/image/bg.잠김"));

		for (int i = 0; i < encryptedData.length; i++) {
		    encryptedData[i] = (byte) (~encryptedData[i]); 
		}

		Files.write(Paths.get("C:/Users/kj/Desktop/김유희/image/bg.png"), encryptedData);
		Files.delete(Paths.get("C:/Users/kj/Desktop/김유희/image/bg.잠김"));
		System.out.println("원본 이미지로 완벽하게 복구되었습니다!");
	}
}