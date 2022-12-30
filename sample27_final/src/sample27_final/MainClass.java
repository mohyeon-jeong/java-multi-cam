package sample27_final;

public class MainClass {

	public static void main(String[] args) {
		/*
			final : 변수, 클래스, 메소드에 적용 (= const, define)
		 */
		
		// 일반 변수(변경 가능)
		int number = 1;
		number = 2;
		
		// 상수(변경 불가능). 대입용으로 사용. 대문자로 사용함
		final int NUMBER = 1;
//		number2 = 2; // err
		
		int num = NUMBER;
	}

}

// 상속 불가능
final class MyClass {
}

class YourClass /* extends MyClass */ { // err
}

class MyClass2 {
	
	// Override 불가능
	public final void method() {}
	
}

class YourClass2 extends MyClass2 {
	
//	public void method() {} // err
	
}