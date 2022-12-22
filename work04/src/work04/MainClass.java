package work04;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		// Calculator
		Scanner sc = new Scanner(System.in);
		
		int index, value1, value2;
		String operator = "";
		
		index = 0;
		value1 = 0;
		value2 = 0;
		
		while (true) {
			System.out.println("1 : calculate, 2 : exit");
			index = sc.nextInt();
			if (index == 1) {
				System.out.print("value 1 : ");
				value1 = sc.nextInt();
				System.out.print("operator : ");
				operator = sc.next();
				System.out.print("value 2 : ");
				value2 = sc.nextInt();
				System.out.print(value1 + operator + value2 + "=");
				if (operator.equals("+")) {
					System.out.println(value1 + value2);
				} else if (operator.equals("-")) {
					System.out.println(value1 - value2);
				} else if (operator.equals("*")) {
					System.out.println(value1 * value2);
				} else if (operator.equals("/")) {
					System.out.println(value1 / value2);
				} else {
					System.out.println("wrong operator");
					continue;
				}
			} else if (index == 2) {
				System.out.println("Exiting...");
				break;
			}
		}
		
	}

}
