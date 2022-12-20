package sample04;

public class MainClass {

	public static void main(String[] args) {
		
		// 자료형 변환
		// short(2), int(4), long(8), double(8)
		
		short sh;
		int i;
		
		// 자동 형변환(auto cast)
		sh = 128;
		i = sh; // short -> int
		System.out.println("i = " + i);
		
		// 강제 형변환
		i = 1234;
//		sh = i; - err
		sh = (short)i;
		System.out.println("sh = " + sh);
		
		// 강제 형변환 시, 데이터 용량 주의
		i = 1234567;
		sh = (short)i;
		System.out.println("sh = " + sh); // 이상한 값 나옴
		
		int number1, number2;
		number1 = 3;
		number2 = 2;
		
		float f;
		f = number1 / number2; // 3 / 2
		System.out.println("f = " + f);
		
		f = (float)number1 / number2; // 3.0 / 2
		System.out.println("f = " + f);
		
	}

}
