package cls;

public class ChildClass extends ParentClass { // 상속
	
	/*
	 * this : 자기 참조
	 * super : 부모 참조
	 */
	
	public ChildClass() {
		super('a'); // ParentClass(char c) 호출
		System.out.println("ChildClass' basic constructor");
	}
	
	public ChildClass(char c) {
		this(); // 기본 생성자 호출. 쓸거면 이 위에 다른 코드가 오면 안됨
		super.ch = c;
		System.out.println("ChildClass ChildClass(char c)");
//		this(); - err
	}
	
	public void func() {
		number = 123; // ParentClass에서 protected로 선언하여 접근 가능
		System.out.println("ChildClass func()");
	}

}
