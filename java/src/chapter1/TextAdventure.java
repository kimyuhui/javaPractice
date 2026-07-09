package chapter1;


	import java.util.Scanner;

	public class TextAdventure {
	    private Scanner scanner;
	    private boolean isAlive;
	    private int gold;
	    private int health;
	    
	    public TextAdventure() {
	        scanner = new Scanner(System.in);
	        isAlive = true;
	        gold = 0;
	        health = 100;
	    }
	    
	    public static void main(String[] args) {
	        TextAdventure game = new TextAdventure();
	        game.start();
	    }
	    
	    public void start() {
	        System.out.println("╔════════════════════════════════════════╗");
	        System.out.println("║     신비로운 숲의 모험에 오신것을 환영합니다!   ║");
	        System.out.println("╚════════════════════════════════════════╝");
	        System.out.println();
	        System.out.print("모험가의 이름을 입력하세요: ");
	        String playerName = scanner.nextLine();
	        
	        System.out.println();
	        System.out.println(playerName + "님, 환영합니다!");
	        System.out.println("당신은 거대한 숲에서 깨어났습니다...");
	        System.out.println("당신의 목표는 숲의 보물을 찾는 것입니다!");
	        System.out.println();
	        
	        forestEntrance();
	    }
	    
	    public void forestEntrance() {
	        System.out.println("=== 숲의 입구 ===");
	        System.out.println("당신 앞에 두 개의 길이 있습니다.");
	        System.out.println("왼쪽 길: 어둡고 신비로운 길");
	        System.out.println("오른쪽 길: 밝고 깔끔한 길");
	        System.out.println();
	        System.out.println("(1) 왼쪽 길로 가기");
	        System.out.println("(2) 오른쪽 길로 가기");
	        System.out.print("선택: ");
	        
	        int choice = getChoice(1, 2);
	        
	        if (choice == 1) {
	            darkForest();
	        } else {
	            brightForest();
	        }
	    }
	    
	    public void darkForest() {
	        System.out.println();
	        System.out.println("=== 어두운 숲 ===");
	        System.out.println("당신이 어두운 길로 들어가자 갑자기 커다란 늑대가 나타났다!");
	        System.out.println("늑대가 으르렁 거리며 당신을 바라본다...");
	        System.out.println();
	        System.out.println("(1) 늑대와 싸우기");
	        System.out.println("(2) 도망치기");
	        System.out.println("(3) 음식을 던져주기");
	        System.out.print("선택: ");
	        
	        int choice = getChoice(1, 3);
	        
	        if (choice == 1) {
	            System.out.println();
	            System.out.println("당신은 늑대와 치열한 전투를 벌였다!");
	            int damageToPlayer = randomDamage(20, 40);
	            health -= damageToPlayer;
	            System.out.println("늑대의 공격을 받아 " + damageToPlayer + "의 피해를 입었다!");
	            System.out.println("현재 체력: " + health);
	            
	            if (health <= 0) {
	                System.out.println();
	                System.out.println("☠️ 당신은 늑대에게 패배했습니다... 게임 오버!");
	                isAlive = false;
	                return;
	            }
	            
	            System.out.println("당신은 간신히 늑대를 이겨냈다!");
	            gold += 50;
	            System.out.println("늑대의 굴에서 금화 50개를 발견했다!");
	            treasureRoom();
	            
	        } else if (choice == 2) {
	            System.out.println();
	            System.out.println("당신은 늑대를 피해 도망쳤다!");
	            System.out.println("다행히 안전한 곳에 도달했다.");
	            brightForest();
	            
	        } else {
	            System.out.println();
	            System.out.println("당신은 음식을 늑대에게 던졌다.");
	            System.out.println("늑대가 음식을 먹으며 태도가 부드러워졌다!");
	            System.out.println("늑대가 당신을 믿고 따라간다.");
	            System.out.println("늑대가 숨겨진 보물이 있는 동굴을 보여주었다!");
	            gold += 100;
	            System.out.println("금화 100개를 획득했다!");
	            treasureRoom();
	        }
	    }
	    
	    public void brightForest() {
	        System.out.println();
	        System.out.println("=== 밝은 숲 ===");
	        System.out.println("당신이 밝은 길을 따라 걸어가자 작은 요정 마을을 발견했다!");
	        System.out.println("친절해 보이는 요정이 당신에게 다가왔다.");
	        System.out.println();
	        System.out.println("요정: '안녕하세요! 당신은 누구신가요?'");
	        System.out.println();
	        System.out.println("(1) 친절하게 인사하기");
	        System.out.println("(2) 보물에 대해 물어보기");
	        System.out.println("(3) 무시하고 지나가기");
	        System.out.print("선택: ");
	        
	        int choice = getChoice(1, 3);
	        
	        if (choice == 1) {
	            System.out.println();
	            System.out.println("요정: '오, 참 친절하시네요!'");
	            System.out.println("요정이 당신에게 마법의 포션을 건네주었다.");
	            health = 100;
	            System.out.println("체력이 완전히 회복되었다!");
	            treasureRoom();
	            
	        } else if (choice == 2) {
	            System.out.println();
	            System.out.println("당신: '이 숲에 보물이 있나요?'");
	            System.out.println("요정: '물론이죠! 북쪽 깊은 동굴에 있어요.'");
	            gold += 30;
	            System.out.println("요정이 금화 30개를 주었다.");
	            treasureRoom();
	            
	        } else {
	            System.out.println();
	            System.out.println("요정들이 당신을 무서워하며 숲 깊숙한 곳으로 도망쳤다.");
	            System.out.println("혼자 남겨진 당신은 길을 잃었다...");
	            lostInForest();
	        }
	    }
	    
	    public void treasureRoom() {
	        System.out.println();
	        System.out.println("=== 보물실 ===");
	        System.out.println("당신은 신비로운 동굴에 도달했다!");
	        System.out.println("금빛으로 빛나는 보물 상자가 있다!");
	        System.out.println();
	        System.out.println("(1) 보물 상자를 열기");
	        System.out.println("(2) 조심스럽게 살펴보기");
	        System.out.print("선택: ");
	        
	        int choice = getChoice(1, 2);
	        
	        if (choice == 1) {
	            System.out.println();
	            System.out.println("당신이 보물 상자를 열었다!");
	            int treasureGold = randomDamage(100, 200);
	            gold += treasureGold;
	            System.out.println("금화 " + treasureGold + "개를 발견했다!");
	            endGame();
	            
	        } else {
	            System.out.println();
	            System.out.println("당신이 조심스럽게 주변을 살펴보자");
	            System.out.println("함정이 있었지만 간신히 피했다!");
	            System.out.println("안전하게 보물 상자를 열 수 있었다!");
	            int treasureGold = randomDamage(150, 250);
	            gold += treasureGold;
	            System.out.println("금화 " + treasureGold + "개를 발견했다!");
	            endGame();
	        }
	    }
	    
	    public void lostInForest() {
	        System.out.println();
	        System.out.println("=== 숲에서 길을 잃다 ===");
	        System.out.println("당신은 숲을 헤맸다...");
	        System.out.println();
	        System.out.println("(1) 큰 나무를 타고 올라가기");
	        System.out.println("(2) 물 소리를 따라가기");
	        System.out.print("선택: ");
	        
	        int choice = getChoice(1, 2);
	        
	        if (choice == 1) {
	            System.out.println();
	            System.out.println("나무 위에서 멀리 동굴 입구를 발견했다!");
	            treasureRoom();
	            
	        } else {
	            System.out.println();
	            System.out.println("물 소리를 따라가자 갑자기 계곡에 떨어졌다!");
	            int damageToPlayer = randomDamage(30, 50);
	            health -= damageToPlayer;
	            System.out.println(damageToPlayer + "의 피해를 입었다!");
	            System.out.println("현재 체력: " + health);
	            
	            if (health <= 0) {
	                System.out.println();
	                System.out.println("☠️ 당신은 계곡에서 죽었습니다... 게임 오버!");
	                isAlive = false;
	            } else {
	                System.out.println("당신은 간신히 살아남았다!");
	                treasureRoom();
	            }
	        }
	    }
	    
	    public void endGame() {
	        System.out.println();
	        System.out.println("╔════════════════════════════════════════╗");
	        System.out.println("║            🎉 게임 클리어! 🎉         ║");
	        System.out.println("╚════════════════════════════════════════╝");
	        System.out.println();
	        System.out.println("최종 통계:");
	        System.out.println("- 획득한 금화: " + gold + "개");
	        System.out.println("- 남은 체력: " + health);
	        
	        if (gold >= 250) {
	            System.out.println();
	            System.out.println("🏆 대단한 모험가님을 환영합니다!");
	            System.out.println("   당신은 이 숲의 진정한 영웅입니다!");
	        } else if (gold >= 150) {
	            System.out.println();
	            System.out.println("⭐ 훌륭한 성과입니다!");
	            System.out.println("   당신은 훌륭한 모험가입니다.");
	        } else {
	            System.out.println();
	            System.out.println("👍 축하합니다!");
	            System.out.println("   당신은 이 모험을 완수했습니다.");
	        }
	        
	        System.out.println();
	        System.out.println("게임을 종료합니다. 다시 놀러 오세요!");
	    }
	    
	    public int getChoice(int min, int max) {
	        while (true) {
	            try {
	                int choice = Integer.parseInt(scanner.nextLine());
	                if (choice >= min && choice <= max) {
	                    return choice;
	                } else {
	                    System.out.print("유효한 선택을 해주세요 (" + min + "-" + max + "): ");
	                }
	            } catch (NumberFormatException e) {
	                System.out.print("숫자를 입력해주세요: ");
	            }
	        }
	    }
	    
	    public int randomDamage(int min, int max) {
	        return (int) (Math.random() * (max - min + 1)) + min;
	    }
	}


