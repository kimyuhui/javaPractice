package chapter09.test;

public class Test {
	class Apple{
		int appleCnt = 0;

		void appleTest() {
			class Box {
				Box() {
					System.out.println("Box 생성됨");
				}
				int boxCnt;

				void boxPrint() {
					System.out.println("boxCnt: " + boxCnt);
				}
			}

			Box box = new Box();
			box.boxPrint();

		}


		void applePrint(){
			System.out.println("appleCnt: " + appleCnt);
		}
	}

	static class Apple2{
		static int appleCnt = 0;

		void applePrint(){
			System.out.println("appleCnt: " + appleCnt);
		}
	}

}
