package sample23_override;

public class MainClass {

	public static void main(String[] args) {
		// 가정) 투수, 타자 도합 10명 모집
		// 투수만 혹은 타자만 10명 올 수도 있기 때문에 각각 10개씩 총 20개 공간 할당
		ChildOne[] pitcher = new ChildOne[10];
		ChildTwo[] batter = new ChildTwo[10];
		
		// 도합 10명만 뽑으니 부모 클래스에서 생성한다면 10개의 공간만 할당해주면 됨
		Parent[] player = new Parent[10];
		
		Parent[] parent = new Parent[5];
		
		parent[0] = new ChildOne();
		parent[1] = new ChildTwo();
		parent[2] = new ChildTwo();
		parent[3] = new ChildTwo();
		parent[4] = new ChildOne();
		
		for (int i = 0; i < parent.length; i++) {
			parent[i].method();
		}
		
		System.out.println();
		
//		parent[0].func(); - 접근 불가 err
		ChildOne one = (ChildOne) parent[0]; // cast
		one.func(); // 접근 가능
		
		System.out.println();
		
		// instanceof
		// a instanceof A : a 는 A Class로 생성되었는가?
		if (parent[0] instanceof ChildOne) {
			System.out.println("parent[0] is instance of ChildOne");
		}
		
		System.out.println();
		
		for (int i = 0; i < parent.length; i++) {
			if (parent[i] instanceof ChildOne) {
				System.out.println("parent[" + i + "] is instance of ChildOne");
			} else if (parent[i] instanceof ChildTwo) {
				System.out.println("parent[" + i + "] is instance of ChildTwo");
			}
		}
	}

}

class Parent {
	
	public void method() {
		System.out.println("Parent method()");
	}
	
}

class ChildOne extends Parent {
	
	public void method() {
		System.out.println("ChildOne method()");
	}
	
	public void func() {
		System.out.println("ChildOne func()");
	}
	
}

class ChildTwo extends Parent {
	
	public void method() {
		System.out.println("ChildTwo method()");
	}
	
	public void process() {
		System.out.println("ChildTwo process()");
	}
	
}











