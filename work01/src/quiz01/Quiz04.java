package quiz01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, z;
		
		System.out.print("x : ");
		x = sc.nextInt();
		System.out.print("y : ");
		y = sc.nextInt();
		
		z = x;
		x = y;
		y = z;
		
		System.out.println("x = " + x + " y = " + y);
		
	}

}
