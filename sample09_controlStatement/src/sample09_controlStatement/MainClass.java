package sample09_controlStatement;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * if (condition) {
		 * 		System.out.println("condition is true");
		 * }
		 */
		
		int a = 1;
		
		if (a > 1) {
			System.out.println("condition is true");
		} else {
			System.out.println("condition is false");
		}
		
		System.out.println();
		
		// for
		for (int i = 0; i < 5; i++) {
			System.out.println("i : " + i);
		}
		
		System.out.println();
		
		// switch
		switch (a) { // a = 1
		case 2: // there's no 1
			System.out.println("a : " + a); // not print
			break;
			
		default:
			System.out.println("there's no case"); // print
			break;
		}
		
		System.out.println();
		
		// while
		while (a < 5) {
			System.out.println("a = " + a + " in while");
			a++;
		}
		
		System.out.println();
		
		// do while
		int b;
		b = 0;
		
		do {
			System.out.println("do while " + b);
			b++;
		} while (b < 5);
		
	}

}









