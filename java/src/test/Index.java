package test;

import java.util.Arrays;

public class Index {

	public static void main(String[] args) {
//		int[] array = new int[2];
//		
//		array[0] = 1;
//		array[1] = 2;
//		
//		int b = 0;
//		
//		array[3] += b;

		
		int[] array = {1, 2};
		
//		int b = 0;
//		array[3] += b;
		
		
		int[] copyArray = new int[array.length * 2];
		
		for(int i = 0; i < array.length; i++) {
			copyArray[i] = array[i];
		}

		
		System.out.println("배열의 길이: " + copyArray.length);
		System.out.println("배열 내용: " + Arrays.toString(copyArray));
		
	}

}
