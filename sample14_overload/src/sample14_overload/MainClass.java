package sample14_overload;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * overload : 함수명은 같고 매개변수의 갯수나 자료형이 다른 함수를 의미함 - 이름만 같고 다른 함수
		 * 			  구분은 parameter로 함
		 */
		func();
		func('c');
		func(1);
		func('a', 1);
		func(1, 'a');
		
		int a = sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(a);
	}
	
	static void func() {
		System.out.println("called func()");
	}
	
	static void func(char c) {
		System.out.println("called func(char c)");
	}
	
	static void func(int i) {
		System.out.println("called func(int i)");
	}
	
	static void func(char c, int i) {
		System.out.println("called func(char c, int i)");
	}
	
	static void func(int i, char c) {
		System.out.println("called func(int i, char c)");
	}
	
	// 가변인수
	static int sum(int...number) {
		int s = 0;
		
		for (int i = 0; i < number.length; i++) {
			s += number[i];
		}
		
		return s;
	}

}
