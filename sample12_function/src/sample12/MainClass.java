package sample12;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		  static void func1(int num) : value를 넘겨줌
		  
		  static void func2(int[] array) : address를 넘겨줌
		 */
		int num = 4;
		int[] array = {4, 5, 6};
		
		funcOne(num);
		funcTwo(array);
		
		// num은 value만 넘어가서 메소드 사용에 관계 없이 다시 4 출력
		System.out.println("num after func = " + num);
		
		// array[]는 address가 넘어갔기 때문에 메소드에서 연산해준 값인 8 출력
		System.out.println("array[0] after func = " + array[0]);
		
		int[] array2 = {1, 2, 3, 4};
		
		funcThree(array2); // sent address
		System.out.println(Arrays.toString(array2)); // 2, 4, 6, 8
		
	}
	
	static void funcOne(int num) {
		num = num * 2;
		System.out.println("num = " + num);
	}
	
	static void funcTwo(int[] array) {
		array[0] = array[0] * 2;
		System.out.println("array[0] = " + array[0]);
	}
	
	static void funcThree(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * 2;
		}
	}

}
