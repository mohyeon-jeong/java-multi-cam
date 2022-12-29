package cal;

// Class 만들 때 Interface란에서 Add하여 쉽게 만들 수 있음
public class CalculatorImpl implements Calculator {

	@Override
	public void plus() {
		System.out.println("CalculatorImpl plus()");
	}

	@Override
	public void minus() {
		System.out.println("CalculatorImpl minus()");
	}

}
