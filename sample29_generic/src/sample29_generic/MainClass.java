package sample29_generic;

public class MainClass {

	public static void main(String[] args) {
		/*
			Generic (= template(형태))
			: 자료형의 변수. 같은 클래스에서 다양한 자료형을 사용하고 싶은 경우에 사용하는 요소
			: 어떤 자료형이 들어올 지 모를 때 사용
			
			number -> int, String, double
		 */
		
		// T to Integer
		Box<Integer> box = new Box<Integer>(123);
		System.out.println(box.getTemp() + 2); // Integer. 연산도 가능
		
		Box<String> sBox = new Box<String>("hi");
		System.out.println(sBox.getTemp());
		
		BoxMap<Integer, String> bm = new BoxMap<Integer, String>(3, "hi");
		System.out.println(bm.getKey());
		System.out.println(bm.getValue());
		
		BoxMap<String, String> bm2 = new BoxMap<String, String>("fuck", "you");
	}

}

//<> 안에 속성을 대문자로 임의 지정(아무거나 써도 됨)
class Box<T> {
	
	T temp;

	public Box(T temp) {
		this.temp = temp;
	}

	public T getTemp() {
		return temp;
	}

	public void setTemp(T temp) {
		this.temp = temp;
	}
	
}

class BoxMap<KEY, VALUE> { // 많이 써도 2개정도 까지만 씀
	
	KEY key;
	VALUE value;
	
	public BoxMap(KEY key, VALUE value) {
		this.key = key;
		this.value = value;
	}

	public KEY getKey() {
		return key;
	}

	public void setKey(KEY key) {
		this.key = key;
	}

	public VALUE getValue() {
		return value;
	}

	public void setValue(VALUE value) {
		this.value = value;
	}
	
}











