package sample13_sorting;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 낮은 숫자부터 정렬 : 오름차순
		 * 높은 숫자부터 정렬 : 내림차순
		 */
		
		int[] number = {3, 6, 4, 8, 1, 5, 2, 7};
		int temp;
		
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (number[i] > number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		
	}

}
