package work07;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Random rd = new Random();
	
		for (int i = 0; i < 30; i++) {
			int num = rd.nextInt(11) + 2;
			System.out.print(num + " ");
		}
	}

}
