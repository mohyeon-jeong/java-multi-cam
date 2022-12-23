package work05;

import java.util.Arrays;

public class Exercise2 {

	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(Arrays.toString(result));
		
		// array는 address가 움직이기 때문에 굳이 위처럼 써줄 필요 없음
//		shuffle(original);
//		System.out.println(Arrays.toString(original)); // result와 동일
	}
	
	static int[] shuffle(int[] arr) {
		// Random Class의 .nextInt()로 난수 생성하는 방법과
		// Collections Class의 .shuffle로 섞는 방법도 있음
		for (int i = 0; i < arr.length; i++) {
			int temp, j;
			j = (int) (Math.random() * arr.length);
			
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		return arr;
	}

}
