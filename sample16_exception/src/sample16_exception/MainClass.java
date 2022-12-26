package sample16_exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * Exception
		 * 
		 * 1. in code
		 * 
		 * try {
		 * (exception이 발생할 수 있는 코드)
		 * } catch ((예외클래스1) e) {
		 * (메시지 출력)
		 * } catch ((예외클래스2) e) {
		 * (메시지 출력)
		 * } finally {
		 * (무조건 실행되는 코드)
		 * (복구 코드) - undo / rollback
		 * }
		 * 
		 * 2. in method
		 * 
		 * static void func() throws (예외클래스) {
		 * (exception이 발생할 수 있는 메소드)
		 * }
		 * 
		 * 본 파일에서 다루는 내용과 나중에 실 사용할 내용이 다를 수 있음
		 * 기본형을 배운다고 생각하면 될듯
		 */
		
		int[] array = {1, 2, 3};
		
		System.out.println("- start -");
		
		try {
			for (int i = 0; i < 4; i++) {
				System.out.println(array[i]);
			}
			
			System.out.println("- process -"); // unreachable (exception occured)
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOFBoundsException has occured");
//			e.printStackTrace(); // print entire exception
//			System.out.println(e.getMessage()); // print only message
			return; // 얘 쓰면 main이 void형이기 때문에 이 아래로 전부 실행되지 않고 끝나지만
			// 예외로 아래 finally는 반드시 실행되기 때문에 "- finally -"까지 출력되고 끝남
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("- finally -");
		}
		
		System.out.println("- end -");
		
//		func();
		
		System.out.println();
		
		// NullPointerException
		String str = null;
		
		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException has occured. str is null");
		}
		
		// steady seller
		
		// ArrayIndexOutOfBoundsException
		int[] array2 = {1, 2, 3};
		
		try {
			array2[3] = 1;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException has occured");
		}
		
		// FileNotFoundException
		File f = new File("D:\\asdfafsafeg");
		FileInputStream is;
		
		try {
			is = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException has occured. there is no file");
		}
		
		// StringIndexOutOfBoundsException
		String str1 = "java";
		
		try {
			str1.charAt(5);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOf~ has occured.");
		}
		
		// NumberFormatException
		try {
			int i = Integer.parseInt("12o3");
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatEx~ has occured.");
		}
		
		System.out.println();
		
		// 구체적인 Exception을 써줄 수 있다면 좋지만, 간단하게 쓰는 방법도 있음
		try {
			int i = Integer.parseInt("12o3");
		} catch (Exception e) {
			System.out.println("Exception has occured.");
		}
	}
	
	static void func() throws IndexOutOfBoundsException {
		int[] num = {1, 2, 3};
		
		for (int i = 0; i < 4; i++) {
			System.out.println(num[i]);
		}
	}

}














