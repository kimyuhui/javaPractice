package chapter5;

public class exam5_03 {

	public static void main(String[] args) {
		
		int[] a = {0, 1, 2};
		//int[] b = a; // 주소값이 대입되므로 같이 바뀜
		
		int[] b = new int[3];
		for(int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		
		b[1] = 4;
		
		for(int i : a) {
			System.out.print(i + " ");
		}
//		for(int i = 0; i < a.length; i++) {
//		System.out.print(a[i] + " ");
//		}
		System.out.println();
		
		
		for(int i : b) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		String[] array = {"Hello", "world", "Java"};
		
		for(String  str : array) {
			System.out.print(str + " ");
		} // 향상된 for문 - 무조건 배열에 있는 원소들을 전부 거쳐감
			// 인덱스 번호가 존재하지 않음
		
		
		
	}
	

}
