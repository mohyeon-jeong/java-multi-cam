package work06;

import java.util.ArrayList;
import java.util.List;

public class UsingList {

	public static void main(String[] args) {
		String[] name = {"hong", "seong", "il"};
		int[] language = {90, 100, 95};
		int[] math = {95, 95, 80};
		int[] eng = {100, 90, 85};
		
		best(language, name);
		best(math, name);
		best(eng, name);
	}
	
	static void best(int[] arr, String[] str) {
		int index = 0;
		int grade = 0;
		List<String> bestStd = new ArrayList<String>();
		
		for (int i = 0; i < arr.length; i++) {
			if (grade == arr[i]) {
				bestStd.add(str[i]);
			} else if (grade < arr[i]) {
				grade = arr[i];
				bestStd.clear();
				bestStd.add(str[i]);
			}
		}
		
		System.out.println("the best students : " + bestStd);
	}

}


