package work05;

public class Exercise4 {

	public static void main(String[] args) {
		String str = "123";
		
		System.out.println(str + " is all num? " + isNumber(str));
		
		str = "1234o";
		
		System.out.println(str + " is all num? " + isNumber(str));
		
		str = "";
		
		System.out.println(str + " is all num? " + isNumber(str));
		
		str = null;
		
		System.out.println(str + " is all num? " + isNumber(str));
	}
	
	// TODO : 스크롤 우측에 표시하여 쉽게 접근할 수 있도록 함.
	static boolean isNumber(String str) {
		boolean b = true;
		
		if (str == null || str.length() == 0) {
			b = false;
			return b;
		}
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int n = (int) c;
			
			if (n < 48 || n > 57) { // ascii code
				b = false;
			}
		}
		
		return b;
	}

}
