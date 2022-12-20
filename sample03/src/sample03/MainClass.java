package sample03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
		// input(입력)
		Scanner sc = new Scanner(System.in);
		
		// boolean
		boolean b;
		System.out.print("b? ");
		b = sc.nextBoolean();
		System.out.println("b : " + b);
		
		// integer
		int number;
		System.out.print("number? ");
		number = sc.nextInt();
		System.out.println("number : " + number);
		
		// double
		double d;
		System.out.print("d? ");
		d = sc.nextDouble();
		System.out.println("d : " + d);
		
		// String
		String str;
		System.out.print("str? ");
		str = sc.next(); // 띄어쓰기 인식 불가
		System.out.println("str : " + str);
		
		// 띄쓰 인식 가능한 입력 방법. file, Network에도 사용됨
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str2;
		System.out.print("str2? ");
		str2 = br.readLine();
		System.out.println("str2 : " + str);
		
	}

}
