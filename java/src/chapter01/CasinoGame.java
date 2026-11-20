package chapter01;

import java.util.Random;
import java.util.Scanner;

public class CasinoGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("===== 🎰 미니 카지노 =====");
        System.out.print("처음 가지고 시작할 포인트: ");
        int money = sc.nextInt();

        while (money > 0) {

            System.out.println("\n현재 포인트: " + money);
            System.out.print("베팅할 포인트 (0 입력하면 종료): ");
            int bet = sc.nextInt();

            if (bet == 0) {
                break;
            }

            if (bet < 0 || bet > money) {
                System.out.println("베팅할 수 없는 금액입니다.");
                continue;
            }

            System.out.println("\n1. 플레이어");
            System.out.println("2. 딜러");
            System.out.print("어디에 베팅할까요? ");
            int choice = sc.nextInt();

            if (choice != 1 && choice != 2) {
                System.out.println("잘못 선택했습니다.");
                continue;
            }

            // 플레이어와 딜러에게 1~9 사이의 숫자를 랜덤으로 뽑음
            int player = rd.nextInt(9) + 1;
            int dealer = rd.nextInt(9) + 1;

            System.out.println("\n플레이어: " + player);
            System.out.println("딜러: " + dealer);

            if (player == dealer) {
                System.out.println("무승부!");

            } else if (choice == 1 && player > dealer) {
                System.out.println("🎉 플레이어 승리! +" + bet);
                money += bet;

            } else if (choice == 2 && dealer > player) {
                System.out.println("🎉 딜러 승리! +" + bet);
                money += bet;

            } else {
                System.out.println("💸 패배! -" + bet);
                money -= bet;
            }
        }

        System.out.println("\n게임 종료!");
        System.out.println("최종 포인트: " + money);

        sc.close();
    }
}