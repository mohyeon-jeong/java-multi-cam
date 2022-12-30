package sample28_static;

public class MainClass {

	public static void main(String[] args) {
		/*
			static : 정적 != 동적(dynamic)
					 memory 공간이 확보, 유지됨
					 
			변수 종류
			지역 변수(local), 멤버 변수(class), 매개변수(method), 정적 변수(static), 전역 변수(global) (자바에서는 static이 전역 변수 역할을 수행함)
			
			memory 공간 종류
			stack - 지역 변수, 매개 변수				
			heap - 멤버 변수
			static - 정적 변수
			system
		 */
		
		// 지역 변수 (stack에서 자동으로 생성 및 삭제가 이루어짐)
		int localVar;
		
		// 멤버 변수 (heap)
		MyClass my = new MyClass();
		my.memberVar = 12;
		
		// 매개 변수 (stack)
		my.method('a');
		
		// 정적 변수
		// 프로그램 실행 시 생성, 종료 시 삭제
		// 타 클래스에 있어도 객체 생성과정 없이 접근 가능
		MyClass.stNum = 1;
		
		// 메소드도 이렇게 접근(역시 객체생성 없어도 됨)
		MyClass.stMethod();
	}
	
	static void func() {
		int localVar;
	}

}

class MyClass {
	
	// 멤버 변수
	int memberVar;
	
	// 정적 변수
	static int stNum;
	
	// 매개 변수
	public void method(char c) {
		int localVar; // 지역 변수
		int memberVar = 2; // 지역 변수
	}
	
	public void func() {
		// 정적 변수
//		static int stNum = 1; // err - 지역 변수로 사용할 수 없음
	}
	
	// static method
	public static void stMethod() {
//		this.memberVar = 1; // err. super 또한 사용 불가능
		System.out.println("MyClass stMethod()");
		
	}
	
}













