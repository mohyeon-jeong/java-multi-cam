package work05;

import java.util.Arrays;

public class Exercise3 {

	public static void main(String[] args) {
		int[] data = {3, 2, 9, 4, 7};
		
		System.out.println(Arrays.toString(data));
		System.out.println("max value : " + max(data));
	}
	
	static int max(int[] arr) {
		int r = arr[0];
		
		if (arr.length != 0) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > r)
					r = arr[i];
			}
		} else {
			r = -999999;
		}
		
		return r;
	}

}
