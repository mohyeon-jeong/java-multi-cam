package work07;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	
	int coin = 20;
	int bet, expectSum, dice1, dice2, getCoin;
	
	public int betCoin() {
		bet = sc.nextInt();
		coin -= bet;
		return bet;
	}
	
	public int expect() {
		expectSum = sc.nextInt();
		while (expectSum <= 2 || expectSum >= 12) {
			System.out.print("wrong number. please input 3 ~ 11. try again : ");
			expectSum = sc.nextInt();
		}
		return expectSum; 
	}
	
	public void game() {
		dice1 = rd.nextInt(5) + 1;
		dice2 = rd.nextInt(5) + 1;
		
		System.out.println("1st dice : " + dice1 + "\n2nd dice : " + dice2 + "\nSum : " + (dice1 + dice2));
		
		if (expectSum == dice1 + dice2) {
			if (dice1 + dice2 == 3 || dice1 + dice2 == 11) {
				System.out.println("x18!!");
				getCoin = bet * 18;
				coin += getCoin;
			} else if (dice1 + dice2 == 4 || dice1 + dice2 == 10) {
				System.out.println("x12!!");
				getCoin = bet * 12;
				coin += getCoin;
			} else if (dice1 + dice2 == 5 || dice1 + dice2 == 9) {
				System.out.println("x9!!");
				getCoin = bet * 9;
				coin += getCoin;
			} else if (dice1 + dice2 == 6 || dice1 + dice2 == 8) {
				System.out.println("x7!!");
				getCoin = bet * 7;
				coin += getCoin;
			} else if (dice1 + dice2 == 7) {
				System.out.println("x6!!");
				getCoin = bet * 6;
				coin += getCoin;
			}
		} else {
			System.out.println("failed..");
		}
	}
	
}









