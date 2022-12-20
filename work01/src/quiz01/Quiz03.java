package quiz01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name, phone, address;
		int age;
		boolean man;
		double height;
		
		System.out.print("name? ");
		name = sc.next();
		System.out.print("age? ");
		age = sc.nextInt();
		System.out.print("man? ");
		man = sc.nextBoolean();
		System.out.print("phone? ");
		phone = sc.next();
		System.out.print("height? ");
		height = sc.nextDouble();
		System.out.print("address? ");
		address = br.readLine();
		
		System.out.println(">> name " + name);
		System.out.println(">> age " + age);
		System.out.println(">> man " + man);
		System.out.println(">> phone " + phone);
		System.out.println(">> height " + height);
		System.out.println(">> address " + address);
		
		
	}

}
