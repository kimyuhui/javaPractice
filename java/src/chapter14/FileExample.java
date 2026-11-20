package chapter14;

import java.io.File;

public class FileExample {

	public static void main(String[] args) throws Exception{
		
		String folderPath = "C:/Users/kj/Desktop/김유희/test/java/javapractice/";
		String filePath = folderPath + "text.txt";
		File file = new File(filePath);
		
		boolean isExist = file.exists();
		System.out.println(isExist);
		
		// file.mkdirs();
		
//		file.createNewFile();
		
//		file.delete();
		
//		isExist = file.exists();
//		System.out.println(isExist);
		
//		boolean canRead = file.canRead();
//		System.out.println(canRead);
		
		
		String getFileName = file.getName();
		System.out.println(getFileName);
		
		String parentFolder = file.getParent();
		System.out.println(parentFolder);
		
		String path = file.getPath();
		System.out.println(path);
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.length());
		
		
	}

}
