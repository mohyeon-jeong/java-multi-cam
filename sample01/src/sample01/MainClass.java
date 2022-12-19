package sample01;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Hello Java");
		
		// 주석 -> Compile X
		
		/* 
			범위 주석
			HTML : <!-- -->
			JSP : <%-- --%>
			MySQL : --
			Python : #, """ """
		*/
		
		System.out.println("Hello World");
		System.out.print("Hello");
		System.out.print("월드");
		
		// 기능 : escape sequence
		// \n : 개행, \b : backspace(한 칸 앞으로 감), \t : tab(띄어쓰기)
		System.out.print("World\n");
		System.out.println("헬로\b");
		System.out.println("\"Hello World\"");
		System.out.println("\tHello\tWorld");
		System.out.println("\t월드\t헬로");
		System.out.println("\\Hello World\\");
		
		// printf(data type, value)
		System.out.printf("%s \n", "Hello");
		
		System.out.println(1024);
		System.out.println("Hello" + "World");
		
	}

}
