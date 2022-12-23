package sample11_function;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		// function(= method)
		functionName();
		functionOne(0); // 0 : argument
		
		int[] arrNum = functionThree();
		System.out.println(Arrays.toString(arrNum));
		
		int num = functionFour(2);
		System.out.println(num);
		
		int n = functionFive('d', "bacd");
		System.out.println(n);
		
	}
	
	static void functionName() {
		System.out.println("called functionName");
	}
	
	static void functionOne(int n) { // n : parameter = 매개변수
		System.out.println("called functionOne. n = " + n);
	}
	
	static int[] functionThree() {
		int number[] = {1, 2, 3};
		return number;
	}
	
	static int functionFour(int n) {
		int r;
		r = n * 2;
		return r;
	}
	
	static int functionFive(char c, String s) {
		int r = s.indexOf(c + "");
		return r;
	}

}














