package practice.test260715;

import java.util.Scanner;

public class Game {

	public final static int gameScore = 300;

	public static void main(String[] args) {

		RockScissorPaper rspaper = new RockScissorPaper();
		Scanner sc = new Scanner(System.in);

		// 처음 메시지에서 2. 끝내기, 게임이 끝난 뒤 2. 나가기를 선택하면 while문이 종료되도록 함

		int count = 0; // 게임을 한 번도 진행하지 않고 나가기를 선택했을 시 다른 문구가 출력되도록 함

		while(true) {
			message();
			String onetwo = sc.next(); 
			if(onetwo.equals("1")) {
				rspaper.rsp();

				if(rspaper.i == 1) { // 가위바위보를 하여 이기면 입력하는 사람 먼저, 지면 컴퓨터 먼저
					play2(); // 컴퓨터가 먼저 턴을 갖게 되는 메소드
					count++;
					messageAgain(); // 게임이 끝난 뒤 출력될 문구
					String onetwo2 = sc.next();
					if(onetwo2.equals("1")) {
						continue; // 입력하는 사람이 1. 다시 하기를 선택하면 처음부터 다시 시작
					} else if(onetwo2.equals("2")) {
						System.out.println(); // 2. 나가기를 선택하면 while문 끝
						System.out.println("게임을 끝냅니다.");
						System.out.println("강아지: 멍멍~ 다음에 또 할 거죠? ^'ㅅ'^");
						break;
					}
					break;
				} else if(rspaper.i == 2) {
					play1(); // 입력하는 사람이 먼저 턴을 갖게 되는 메소드
					count++;
					messageAgain();
					String onetwo2 = sc.next();
					if(onetwo2.equals("1")) {
						continue;
					} else if(onetwo2.equals("2")) {
						System.out.println("게임을 끝냅니다.");
						System.out.println("강아지: 멍멍~ 다음에 또 할 거죠? ^'ㅅ'^");
						break;
					}
					break;
				} else if(rspaper.i == 4) { 
					// 가위바위보에서 잘못된 문자열을 5번 입력하고, 강아지에게 나쁜 말을 했을 때
					break;
				} break;
			} else if(onetwo.equals("2")) {
				System.out.println("게임을 종료합니다.");
				if(count == 0) { 
					System.out.println("강아지: 한 판도 안 했는데!");
					break;
				} else if (count >= 1) {
					System.out.println("강아지: 멍멍! 다음에 또 해요~ U^ㅅ^U");
					break; // 시작 메뉴에서 2. 끝내기를 선택하면 게임이 종료되도록 함 
				} else {
					System.out.println();
					System.out.println("잘못된 입력을 하셨습니다!");
					System.out.println("강아지: 1과 2만 누를 수 있어요! 멍멍");
					System.out.println();
					continue; // 시작 메뉴에서 1과 2를 제외한 다른 것을 입력하면 다시 시작되도록 함
				}
			}
		}

	}
	
	static void message() { 
		System.out.println(" □□□□□□ 주사위 게임 □□□□□□");
		System.out.println("========================");
		System.out.println("당신은 컴퓨터 강아지와 주사위 게임을 합니다");
		System.out.println("멍멍     ^-ㅅ-^     멍멍");
		System.out.println();
		System.out.println("네 개의 주사위가 있고 중복된 주사위를 고를 수 있습니다");
		System.out.println();
		System.out.println("1. 마약방석 주사위   2. 고구마훔치기 주사위   3. 새가슴 주사위   4. 개껌주사위");
		System.out.println("------------------------");
		System.out.println("마약방석 주사위 : 1~6 (좋은꿈 같을 수도 있고 악몽같을 수도 있음)   |  고구마훔치기 주사위 : 1, 6 (고구마 훔칠 때처럼 운을 시험하기)");
		System.out.println("새가슴 주사위 : 3, 4 (약하고 작은 동물들이 쓰는 주사위)          |  개껌주사위 : 2, 5 (보기엔 별거 없어보이지만 씹는 맛이 있는 개껌처럼)");
		System.out.println("(강아지는 마약방석 주사위만 사용합니다)");
		System.out.println();
		System.out.println("* 강아지와 가위바위보를 하여 순서를 정합니다 *");
		System.out.println("========================");
		System.out.println("1. play              2. 끝내기");
		
	}
	// 시작 메뉴 
	
	static void messageAgain() {
		System.out.println("1. 처음부터 다시 하기       2. 그만하기");
	}
	// 게임이 끝난 뒤 메뉴
	
	static int userRollDice(int normalDice, int dangerDice, int safeDice, int sosoDice) {
		Scanner sc = new Scanner(System.in);
		Dice dice = new Dice();
		DangerDice dangerdice = new DangerDice();
		SafeDice safedice = new SafeDice();
		SosoDice sosodice = new SosoDice();
		// 일반 주사위, 모아니면도 주사위, 안전 주사위, 애매한 주사위 클래스 호출
		
		int i = 0; // 주사위를 굴릴 횟수 -> while문에 넣어서 3번 돌아가도록 함
		int userDiceNum = 0; // 주사위에서 나온 랜덤한 숫자를 저장할 변수
		int userSum = 0; // 주사위 숫자들을 더한 값을 저장할 변수
	
		while(i < 3) {
			System.out.println("□■ 주사위를 고르세요 ■□");
			System.out.println("1. 마약방석  2. 고구마 훔치기  3. 새가슴  4. 개껌");
			String answer = sc.next();
			if (answer.equals("1") || answer.equals("2") || answer.equals("3") || answer.equals("4"))
			{ // 어떤 주사위를 사용할지 숫자로 입력받음 
			switch(answer) {
			case "1":
				userDiceNum = dice.roll(); //일반 주사위
				break;
				
			case "2":
				userDiceNum = dangerdice.roll(); //모아니면도 주사위
				break;
				
			case "3":
				userDiceNum = safedice.roll(); //안전한 주사위
				break;
				
			case "4":
				userDiceNum = sosodice.roll(); //애매한 주사위
				break;
			}
			} else {System.out.println("잘못된 입력을 하셨습니다");
				i--; //사용자가 잘못된 입력을 하면 i값을 감소시켜서 체크되지 않도록 함
			}
			i++; // 한 번 돌릴 때마다 i값 증가하고 userSum 변수에 합해짐
			userSum += userDiceNum;
			}
		System.out.println(" > 합계 : " + userSum + " <");
		return userSum; //세 숫자가 더해진 값이 리턴되도록 한다
	
	}
	// 입력하는 사람의 주사위 턴
	
	static int computerRollDice(int computerDice1, int computerDice2, int computerDice3) {
		Dice dice = new Dice(); // 일반 주사위만 사용할 것이므로 일반주사위 클래스만 호출함
		int i = 0;
		int computerDiceNum = 0;
		int computerSum = 0;
		
		while(i < 3) {
				i++;
				computerDiceNum = dice.roll();
				computerSum += computerDiceNum;
	}
		System.out.println(" > 합계 : " + computerSum + " <");
		return computerSum;
	}
	// 컴퓨터 주사위 턴
	
	static void play1(){
		
		int normalDice = 0; // 각 주사위들 값을 저장하기 위해 변수로 선언
		int dangerDice = 0;
		int safeDice = 0;
		int sosoDice = 0;
		
		int user = 0; // 입력하는 사람의 총합을 저장할 변수
		int computer = 0; // 컴퓨터의 총합을 저장할 변수
		int userResult = 0; // 주사위 턴 메소드에서 나온 값을 저장할 변수 
		int computerResult = 0; //컴퓨터 턴 메소드에서 나온 값을 저장할 변수
		
		int userCount = 0; // 입력하는 사람이 몇 번 턴을 가졌는지 저장할 변수
		int computerCount = 0; // 컴퓨터가 몇 번 턴을 가졌는지 저장할 변수
		
	while(user <= gameScore && computer <= gameScore) {
			
			userResult = userRollDice(normalDice, dangerDice, safeDice, sosoDice);
			// 주사위를 굴리는 메소드에서 나온 값을 저장함
			System.out.println("=====================");
			userCount++; // userRollDice 메소드가 한 번 실행될 때마다 userCount가 증가함
			
			computerResult = computerRollDice(normalDice, normalDice, normalDice);
			// 컴퓨터가 주사위 굴리는 메소드에서 나온 값 저장
			computerCount++; // 한 번 실행될 때마다 computerCount 증가
			
			user += userResult; // while문이 한 번 실행될 때마다 이곳에 컴퓨터와 사용자의 주사위 합계가 더해짐
			computer += computerResult;
			System.out.println("=====================");
			System.out.println("현재 총합");
			System.out.println("나 : " + user + " / " + userCount + "턴");
			System.out.println("강아지 : " + computer + " / " + computerCount + "턴");
			System.out.println("=====================");
			System.out.println();
					
			if(user >= gameScore && computer >= gameScore) {
				break; // 컴퓨터나 사용자의 주사위 총합이 300 이상이면 while문이 끝나도록
			}
		}
		
		System.out.println("내 턴 횟수: " + userCount);
		System.out.println("강아지 턴 횟수: " + computerCount);
		
		if(userCount >= computerCount && user >= computer) {
			System.out.println("당신이 이겼습니다"); 
			System.out.println("강아지: 멍멍! 우리 주인님은 역시 못하는 게 없어요!");
		} else if(userCount == computerCount && user == computer) {
			System.out.println("강아지와 비겼습니다");
			System.out.println("강아지: 저는 개발로(강아지 발로), 주인님은 개발로(코딩으로)!");
		} else {
			System.out.println("강아지가 이겼습니다");
			System.out.println("강아지: 이게 바로 개발(puppy paw)의 힘! 멍멍!");
		} 
	}
	// 가위바위보에서 입력하는 사람이 승리했을 때
	
	static void play2() {
		int normalDice = 0;
		int dangerDice = 0;
		int safeDice = 0;
		int sosoDice = 0;

		int user = 0;
		int computer = 0;
		int userResult = 0;
		int computerResult = 0;

		int userCount = 0;
		int computerCount = 0;

		while(user <= gameScore && computer <= gameScore) {
			computerResult = computerRollDice(normalDice, normalDice, normalDice);
			computerCount++;


			userResult = userRollDice(normalDice, dangerDice, safeDice, sosoDice);
			System.out.println("=====================");
			userCount++;


			computer += computerResult;
			user += userResult;

			System.out.println("=====================");
			System.out.println("현재 총합");
			System.out.println("나 : " + user + " / " + userCount + "턴");
			System.out.println("강아지 : " + computer + " / " + computerCount + "턴");
			System.out.println("=====================");
			System.out.println();

		}

		System.out.println("내 턴 횟수: " + userCount);
		System.out.println("강아지 턴 횟수: " + computerCount);

		if(userCount >= computerCount && user >= computer) {
			System.out.println("당신이 이겼습니다");
			System.out.println("강아지: 우리 주인님이 세상에서 제일 멋져요~ 멍멍");
		} else if(userCount == computerCount && user == computer) {
			System.out.println("강아지와 비겼습니다");
			System.out.println("강아지: 저는 개발로(강아지 발로), 주인님은 개발로(코딩으로)!");
		} else {
			System.out.println("강아지가 이겼습니다");
			System.out.println("강아지: 이게 바로 개발(puppy paw)의 힘! 멍멍!");
		}

	}
	// 가위바위보에서 컴퓨터가 승리했을 때 -> play1 메소드에서 주사위턴 메소드 순서만 변경함
	
}
