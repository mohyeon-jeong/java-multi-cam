package sample07;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * bit 연산자
		 * 
		 * bit : 0, 1
		 * 
		 * &	and
		 * |	or
		 * ^	xor
		 * <<	left shift
		 * >>	right shift
		 * ~	not
		 */
		
		// and
		int number = 0x71 & 0x8a; // 2진수로 변환하여 각 자리가 모두 1이 있으면 1 출력.
		// ex) 0x71 = 0111 0001, 0x8a = 1000 1010. 0111과 1000, 0001과 1010을 각각 대조 -> 0000 0000 = 0
		System.out.println(number); // 0 (false)
		
		// or
		int number1 = 0x71 | 0x8a; // or은 각 자리가 하나라도 1이면 1 출력.
		// ex) 0111 | 1000 = 1111, 0001 | 1010 = 1011. 1111 1011 = FB
		System.out.println(number1); // 251. 10진수로 나타남
		System.out.printf("%x \n", number1); // FB. 16진수로 표현
		
		// xor (보안에서 많이 쓰임) - 각 자리가 서로 다르면 1 출력.
		int number2 = 0x71 ^ 0x85; // 암호화
		// 0x71 = 0111 0001, 0x85 = 1000 0101. 0111 0001 ^ 1000 0101 = 1111 0100 = 0xF4
		System.out.println(number2);
		System.out.printf("%x \n", number2); // F4
		
		int number3 = 0xf4 ^ 0x85; // 복호화
		System.out.println(number3);
		System.out.printf("%x \n", number3);
		
		// left shift == * 2^n - 왼쪽으로 n칸 밂
		// 이 때, 밀려나는 왼쪽 비트들은 버림
		short sh;
		sh = 0x1 << 1; // 0x1 = 0000 0001. << 1 시, 0000 0010 = 2
		System.out.println(sh); // 2
		
		// right shift == / 2^n
		// 오른쪽 비트 버림
		sh = 0x8 >> 1; // == 8 / 2
		System.out.println(sh); // 4
		
		sh = 0x8 >> 3; // == 8 / 2^3 == 8 / 8
		System.out.println(sh); // 1
		
		// negative 0 -> 1, 1 -> 0
		byte by = ~0x55;
		// 0x55 = 0101 0101. ~0x55 = 1010 1010 = 0xAA
		System.out.printf("%x \n", by); // aa
		
	}

}

















