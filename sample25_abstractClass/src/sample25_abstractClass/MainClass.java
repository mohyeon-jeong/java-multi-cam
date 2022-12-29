package sample25_abstractClass;

public class MainClass {

	public static void main(String[] args) {
		/* 
		 * abstract class : 추상 클래스. 추상 메소드를 하나 이상 포함하고 있는 클래스
		 * 
		 * abstract method : 내용이 없고, 선언만 되어있는 method
		 * 
		 * 일반 method
		 * public void method(int n) {
		 * 		(코드)
		 * }
		 * 
		 * 추상 method
		 * public abstract void method(int n);
		 */
		
//		AbstractClass aCls = new AbstractClass(); - err
		Child ch = new Child();
		ch.normalMethod();
		ch.abstractMethod();
		
		System.out.println();
		
		AbstractClass aCls = new Child();
		aCls.normalMethod();
		aCls.abstractMethod();
		
		System.out.println();
		
		AbstractClass bCls = new AbstractClass() {
			// can define here
			@Override
			public void abstractMethod() {
				System.out.println("AbstractClass abstractMethod()");
			}
		};
		bCls.normalMethod();
		bCls.abstractMethod();
	}

}

abstract class AbstractClass {
	
	private String name; // 변수 포함 가능
	
	// 일반 method 포함 가능
	public void normalMethod() {
		System.out.println("AbstractClass normalMethod()");
	}
	
	// abstract method
	public abstract void abstractMethod();
	
}

class Child extends AbstractClass {

	// can define here
	@Override
	public void abstractMethod() {
		System.out.println("Child abstractMethod()");
	}
	
}











