package cls;

public class ParentClass {
	
	public String name; // 접근 가능하게 하기 위한 public
	public char ch;
	protected int number; // protected : ChildClass에서 접근 허용, 외부 접근 차단
	
	public ParentClass() {
		System.out.println("ParentClass' basic constructor");
	}
	
	public ParentClass(char ch) {
		System.out.println("ParentClass ParentClass(char ch)");
		this.ch = ch;
	}
	
	public void parentMethod() {
		System.out.println("ParentClass parentMethod()");
	}
	
}
