package sample26_interface;

import cal.Calculator;
import cal.CalculatorImpl;

public class MainClass {

	public static void main(String[] args) {
		/*
		   interface : 추상 method만을 포함하는 Class
		 			   선언하는 경우, prototype을 확인하는 경우에 많이 씀
		 			   다중 상속 가능
		 			   확장성, Class에서 포함하는 method를 파악하는 데 유리함
		 */
		
//		MyInterface mi = new MyInterface(); - err
		
		MyClass myCls = new MyClass();
		myCls.func();
		
		System.out.println();
		
		MyInterface myInt = new MyClass();
		myInt.func();
		
		System.out.println();
		
		MyInterface myIf = new MyInterface() {
			@Override
			public void func() {
				System.out.println("MyInterface func()");
			}
		};
		myIf.func();
		
		System.out.println();
		
		// 계산기를 코딩했다 가정했을 때 interface에서 호출하게 만들면
		// 사용자에게 logic이 있는 파일이 아닌 interface 파일을 보여주어
		// 어떠한 기능들이 있는지 한눈에 확인 가능하게 할 수 있음
		// 보안상의 이득은.. 있나?
		Calculator cal = new CalculatorImpl();
		cal.plus();
		cal.minus();
	}

}

interface MyInterface {
	
//	private int number; - err
	
//	public void method() {} - err
	
	public void func();	// abstract 안 붙임
	
}

class MyClass implements MyInterface {

	@Override
	public void func() {
		System.out.println("MyClass func()");
	}
	
}
















