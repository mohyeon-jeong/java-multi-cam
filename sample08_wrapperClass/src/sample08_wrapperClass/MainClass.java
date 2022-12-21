package sample08_wrapperClass;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * wrapper class
		 * 일반 자료형(int char long 등)을 class로 만들어 놓은 것
		 * 
		 * 일반 자료형			wrapper class
		 * boolean			Boolean
		 * byte				Byte
		 * short			Short
		 * int				Integer		*
		 * long				Long
		 * float			Float
		 * double			Double		*
		 * char				Character
		 * char[]			String		*
		 * 
		 * *는 자주 쓰이는 wrapper class
		 * 
		 * class 사용 시에는 동적 할당(new)
		 * 
		 * 클래스명 변수(클래스) = new 클래스명();
		 * 클래스명 변수(클래스) = 값; - 이렇게 사용할 수도 있음
		 * ex) String str = "hello";
		 */
		
		int i = 123;
		Integer iobj = 123;
		Integer iobj2 = new Integer(123);
		
		System.out.println("i : " + i);
		System.out.println("iobj : " + iobj);
		System.out.println("iobj2 : " + iobj2);
		
		// String to Integer
		String numStr = "123";
		int number = Integer.parseInt(numStr);
		System.out.println("number + 1 : " + (number + 1));
		
		// int to String
		Integer oNumber = 12345;
		String str1 = oNumber.toString();
		System.out.println("str1 + 1 : " + (str1 + 1));
		
		// dec to bin (String)
		int number1 = 67;
		String str2 = Integer.toBinaryString(number1);
		System.out.println("67 to bin : " + str2);
		
		// dec to hex (String)
		String str3 = Integer.toHexString(number1);
		System.out.println("67 to hex : " + str3);
		
		// 비교
		String str4 = "hello";
		String str5 = "hello";
		
		boolean b = str4.equals(str5);
		System.out.println("b : " + b);
		
		// location
		String str6 = "abcabcabc";
		int n = str6.indexOf("c");
		System.out.println("n : " + n);
		
		int n1 = str6.lastIndexOf("c");
		System.out.println("n1 : " + n1);
		
		// length
		int len = str6.length();
		System.out.println("len : " + len);
		
		// replace
		String str7 = "A*B*C*D";
		String replaceStr = str7.replace("*", "");
		System.out.println("replaceStr : " + replaceStr);
		
	}

}

















