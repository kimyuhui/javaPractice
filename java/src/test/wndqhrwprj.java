package test;

public class wndqhrwprj {

	public static void main(String[] args) {
		int[] arr = {1, 1, 1, 3, 4, 4, 5, 6, 6, 7, 8};
		solution(arr);

	}


	public static int[] solution(int[] arr) {
		
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i == 0 || arr[i] != arr[i-1]) {
				cnt++;
			}
		}
		
		int[] copy = new int[cnt];
		int number = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(i == 0 || arr[i] != arr[i-1]) {
				copy[number] = arr[i];
				number++;
			}
		}
		
		System.out.print("[ ");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println("]");
		
		return arr;
	}
}
