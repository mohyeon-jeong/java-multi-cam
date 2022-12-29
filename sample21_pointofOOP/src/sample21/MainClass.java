package sample21;

import cls.ChildClass;
import cls.ParentClass;

public class MainClass {

	public static void main(String[] args) {
		ChildClass cc0 = new ChildClass();
		
		System.out.println();
		
		ChildClass cc = new ChildClass('b'); // ParentClass 생성자부터 호출
		
		// 상속받았기 때문에 ParentClass의 요소들에 접근이 가능함
		cc.parentMethod();
		cc.name = "hong";
		System.out.println("ch : " + cc.ch);
		
		ParentClass pc = new ParentClass('a');
//		pc.func(); - Child Class의 method라 ParentClass에서는 접근 불가
		
//		cc.number = 123;
//		pc.number = 123; - main에서는 접근 불가. only for ChildClass
	}

}
