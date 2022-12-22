package sample10_continue;

public class MainClass {
	
	// continue
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			System.out.println("for 처리 1");
			
			if (i > 5) {
				continue;
			}
			
			System.out.println("for 처리 2"); // i > 5 면 안나오고 i++ 후 반복문 진행
		}
		
	}

}
