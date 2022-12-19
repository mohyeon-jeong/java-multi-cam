package sample02;

public class MainClass {

	public static void main(String[] args) {
		
		/*
			숫자(상수)
			2진수 : 0, 1
			8진수 : 0 ~ 7. 8 -> 10, 10 -> 12, 12 -> 012 
			10진수 : 0 ~ 9
			16진수 : 0 ~ 9 + A B C D E F(15) 0x000000 : Black, 0xffffff : White
			
			2진수 -> 16진수
			1010 1100 : 2진수
			A	 C	  : 16진수 -> 0xAC. 0x : 뒤에 오는 숫자가 16진수임을 나타냄
			
			0xE5 : 16진수
			2진수 -> 1110 0101
					(E)  (5)
		
			변수 - 빈 공간(빈 메모리 공간)에 데이터를 저장할 수 있는 수. 데이터의 종류가 다양함.
			ex) 숫자, 문자열, 논리
			
			숫자
				정수(byte, short, int, long)
				실수(float, double)
				
			문자열
				문자(char)
				문자열(String)
				
			논리(boolean)
				true / false
		*/
		
		// 정수
		byte by;
		// byte의 크기는 1 byte(= 8 bit. 2진수 - 00000000)로 256개 숫자 표현. 0 ~ 255
		by = 12;
		// 단, 2진수로 나타내었을 때 맨 앞의 숫자는 부호를 나타내므로 -128 ~ 127까지 대입 가능.
//		by = 255; -> err
		by = -128;
		by = 127;
		
		short sh; // 2 byte
		sh = 134;
		
		int i; // 4 byte
		i = 1234567890;
		
		long l; // 8 byte
		l = 1234567890123456789L; // 이클립스에서 숫자는 기본적으로 int라 생각하기 때문에 long임을 나타내기 위해 뒤에 꼭 L을 붙여줘야 함.
		
		// 실수
		float f; // 4 byte
		f = 123.456f; // 위 long과 마찬가지. 기본 double로 받음.
		
		double d; // 8 byte
		d = 123.4567890123;
		
		// 문자
		char c; // 2 byte
		c = 'A';
		
		// 문자열
		String str;
		str = "Hello";
		
		// 논리
		boolean b;
		b = false; // = 0
		b = true; // = 1
		
		// 변수명 규칙
		// 알아보기 쉽게 자세히 써야 함
		int hH;
		int humanHeight;
		
		// 숫자로 시작해선 안 됨
//		int 1abc; - err
		
		// 공백 포함 불가
//		int a b c; - err
		
		// 전부 대문자로 이루어진 변수명 사용 지양
		int ABC;
		
		// camelCase
		int charPositionXdot;
		
		// 언더바 사용 지양(DB 등에서 안되는 경우 있음)
		int char_position_xdot;
		
		System.out.println("by = " + by);
		System.out.println("sh = " + sh);
		System.out.println("i = " + i);
		System.out.println("l = " + l);
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		System.out.println("c = " + c);
		System.out.println("str = " + str);
		System.out.println("b = " + b);
		
	}

}
