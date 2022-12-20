package work02;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 편의점 프로그램
		 * 지불금액 : 3,210원
		 * 소지금액 : 10,000원
		 * 
		 * 거스름돈 -> ?
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int myMoney, price, change, changeAmount;
		
		System.out.print("My money : ");
		myMoney = sc.nextInt();
		System.out.print("price : ");
		price = sc.nextInt();
		
		System.out.println("My money : " + myMoney);
		System.out.println("price : " + price);
		
		change = myMoney - price;
		
		System.out.println("Change : " + change);
		
		changeAmount = change / 5000;
		change = change % 5000;
		System.out.println("5000 : " + changeAmount);
		
		changeAmount = change / 1000;
		change = change % 1000;
		System.out.println("1000 : " + changeAmount);
		
		changeAmount = change / 500;
		change = change % 500;
		System.out.println("500 : " + changeAmount);
		
		changeAmount = change / 100;
		change = change % 100;
		System.out.println("100 : " + changeAmount);
		
		changeAmount = change / 50;
		change = change % 50;
		System.out.println("50 : " + changeAmount);
		
		changeAmount = change / 10;
		change = change % 10;
		System.out.println("10 : " + changeAmount);
		
	}

}
