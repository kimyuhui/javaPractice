package chapter5;

public class practice {

	public static void main(String[] args) {

		int[][] array = new int[5][5];
		
		int n = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				array[i][j] += n;
				n++;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		
		
		int a1 = 1;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				array[i][j] = 2 * a1 - 1;
				a1++;
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		int a2 = 25;
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				array[i][j] = a2;
				a2--;
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		
		
		int sum = 26;
		
		for(int i = 0; i < 5; i++) { 
			sum = sum - 1;
			for(int j = 0; j < 5; j++) {
				array[i][j] = sum - 5 * j;
			}
		}
			
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		
		sum = 0;
		for(int i = 0; i < 5; i++) { 
			sum = sum + 1;
			for(int j = 0; j < 5; j++) {
				array[i][j] = sum + 5 * j;
			}
		}
			
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}
		

		System.out.println("------------------------------------------");
		
		
		
		
		int y = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				array [i][j] = y + 1;
				y++;
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				while(j == 4) {i++; 
				while(i == 4) {j--;
				while (j == 0) {i--;
				while (i == 1) {
								j++; {
									while (j == 3) {
										i++; {
											while (i == 3) {
												j--; {
													while (j == 1) {
														i--; {
															while(i == 2) {
																j--;
																while(j==2) {
																		
																	
																}
															}
													
															
														}
													}
													
												}
												
												
											}
											
											
										}
									}
								}
								
							}
						}
					
					
					}
			
				}
				System.out.printf("%2d ", array[i][j]);	
			}
			
			System.out.println();
		}

		
		
		
	}

}
