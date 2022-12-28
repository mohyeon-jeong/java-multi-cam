package sample19_constructor;

public class MyClass {

	public static void main(String[] args) {
		/*
		 * constructor : 생성자 - 객체 생성과 동시에 실행되는 method
		 * 				 함수(method)
		 * 				 method명 = Class명
		 * 				 return value가 없음
		 * 				 overload 가능
		 * 				 별도 호출 불가능
		 * 				 생략 가능(생성자 안 써도 됨)
		 */
		BaseClass bc1 = new BaseClass();
		BaseClass bc2 = new BaseClass(2);
		BaseClass bc3 = new BaseClass(3, "fuck");
		
	}

}

class BaseClass {
	int number;
	String name;
	
	public BaseClass() { // method명 = Class명
		System.out.println("BaseClass BaseClass()");
	}
	
	public BaseClass(int num) { // overload
		System.out.println("BaseClass BaseClass(int num)");
	}
	
	public BaseClass(int num, String na) {
		number = num;
		name = na;
		System.out.println("BaseClass BaseClass(" + num + ", " + na + ")");
	}
	
	public void method() {
		
	}
	
	public void method(int n) {
		
	}

}













