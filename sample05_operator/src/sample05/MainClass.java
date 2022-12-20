package sample05;

public class MainClass {

	public static void main(String[] args) {
		
		// 연산자
		int num1, num2;
		num1 = 7;
		num2 = 2;
		
		int result;
		
		result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		result = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + result);
		
		result = num1 / num2; // num2 = 0일 경우 ArithmeticException
		System.out.println(num1 + " / " + num2 + " = " + result);
		
		result = num1 % num2;
		System.out.println(num1 + " % " + num2 + " = " + result);
		
		int money = 13500;
		int m = money % 1000; // 거슬러줘야 할 동전
		System.out.println("m = " + m);
		
		// 증감
		int number1 = 0;
//		number1 = number1 + 1;
		number1++;
		System.out.println("number1 = " + number1);
		
		number1--;
		System.out.println("number1 = " + number1);
		
		// 논리
		int number4 = 5;
		System.out.println(number4 < 10);
		System.out.println(number4 > 0 && number4 < 10);
		System.out.println(number4 < 0 || number4 < 10);
		System.out.println(!(number4 < 10)); // number4 >= 10
		
		// 삼항 연산자
		// 변수 = (조건) ? 값1 : 값2 ; - 조건 = true, 값1 / 조건 = false, 값2 대입
		int n;
		n = (number4 > 0) ? 11:22;
		System.out.println("n = " + n);
		
		char c;
		c = (number4 > 10)? 'Y' : 'N';
		System.out.println("c = " + c);
		
		String s;
		s = (number4 > 4)? "Yes" : "No";
		System.out.println("s = " + s);
		
	}

}
