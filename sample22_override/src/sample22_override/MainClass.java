package sample22_override;

public class MainClass {

	public static void main(String[] args) {
		// override : 상속받은 method를 자식 클래스에서 고쳐 기입하는 것.
		// return값, parameter, method명 등이 같아야 함
		Child cObj = new Child();
		
		cObj.process();
		
		System.out.println();
		/*
		 * (부모클래스) (부모클래스 객체) = new (자식클래스)();
		 * 
		 * 사용 이유 - 야구팀 예시
		 * (A팀) (A팀 객체) = new (투수)();
		 * (A팀) (A팀 객체) = new (타자)();
		 * 위와 같이 투수와 타자가 모두 A팀에 속해있어 관리를 용이하게 하기 위함.
		 * (투수나 타자로 객체를 생성하면 투수만, 혹은 타자만 관리할 수밖에 없음)
		 */
		Parent pObj = new Child();
		pObj.method(); // Child()를 호출했기 때문에 Child method() 호출
	}

}

class Parent {
	
	public Parent() {
		System.out.println("Parent()");
	}
	
	public void method() {
		System.out.println("Parent method()");
	}
	
}

class Child extends Parent {
	
	public Child() {
		System.out.println("Child()");
	}
	
	// Override
	public void method() {
		System.out.println("Child method()");
	}
	
	public void process() {
		super.method(); // Parent의 method()에 접근
		this.method(); // Child의 method() (this 생략 가능)
	}
	
}
