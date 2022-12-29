package cls;

public class Human { // extends Object 생략
	
	private String name;
	private int age;
	
	public Human() {
	}

	public Human(String name, int age) {
		super();
		// 모든 클래스는 Object 클래스를 상속받고있어(생략됨) super();가 문제되지 않음.
		this.name = name;
		this.age = age;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}

}
