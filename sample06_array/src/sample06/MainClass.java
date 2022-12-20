package sample06;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * Array
		 * int array[] = new int[10]; - new : 동적(dynamic) 할당
		 * array[0] = 1;
		 * array[1] = 2;
		 * 
		 * memory엔 stack, heap, static, system 영역이 있는데
		 * array[]는 stack 영역에, [10]은 heap 영역에 할당
		 */
		
//		int array[] = new int[10];
//		int []array = new int[10];		전부 같은 의미임
		int[] array = new int[10];
		
		System.out.println(array);
		
		// length(quantity) of array
		System.out.println(array.length); // 10
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		array[5] = 60;
		array[6] = 70;
		array[7] = 80;
		array[8] = 90;
		array[9] = 100;
		
		System.out.println(array[5] + array[3]);
		
	}

}















