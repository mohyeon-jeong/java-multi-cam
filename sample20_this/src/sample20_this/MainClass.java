package sample20_this;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * this : 해당 객체의 주소(참조( = reference)) (C의 포인터와 비슷함)
		 */
		MyClass clsOne = new MyClass();
		
		// same address
		System.out.println(clsOne);
		System.out.println(clsOne.getThis());
		clsOne.method();
		
		MyClass clsTwo = new MyClass();
		
		// another address
		System.out.println(clsTwo);
		
		System.out.println();
		
		MyClass cls = new MyClass("tom");
	}

}

class MyClass {
	String name;
	
	public MyClass() {
		this("john"); // 아래 MyClass(String name) 부터 호출 후 진행
		System.out.println("MyClass MyClass()");
	}
	
	public MyClass(String name) {
//		this(); // 기본 생성자 호출
		System.out.println("MyClass MyClass(String name)");
		this.name = name;
	}
	
	MyClass getThis() {
		return this;
	}
	
	void method() {
		System.out.println(this);
		
		this.name = "illiil";
		this.getThis(); // 이 두 상황은 this 생략 가능
		
		name = "asdfasf";
		getThis();
	}
	
	void setName(String name) {
		// 위 MyClass 바로 아래 name과 이 메소드의 parameter name을 구분짓기 위해 this 사용
		// this가 붙는 쪽이 멤버 변수
		this.name = name;
	}
	
	void setNameMethod() {
		String name = "hong";
		
		this.name = name;
	}
	
}













