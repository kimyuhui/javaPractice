package chapter4;

public class exam04 {

	public static void main(String[] args) {
		// 구구단 만들기
		// 2 x 1 = 2
		// 2 x 2 = 4... 하는 형식으로
		// 중첩 for문 사용하기 
		
		// i는 단수
		for(int i = 2; i <= 9; i++) {
			// j는 i단에 곱해지는 수 (1~9)
			for(int j = 1; j <= 9; j++ ) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
				//System.out.println(" i: " + i + " / j: " + j);
		} System.out.println("------------------------------");
		}
		
		
		
	}

}
