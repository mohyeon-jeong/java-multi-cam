package work06;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// students' grade manage
		String[] name = {"hong", "seong", "il"};
		int[] language = {90, 100, 95};
		int[] math = {95, 95, 80};
		int[] eng = {100, 90, 85};
		
		// sum of subject
		sum(language);
		sum(math);
		sum(eng);
		
		System.out.println();
		
		// avg of subject
		avg(language);
		avg(math);
		avg(eng);
		
		System.out.println();
		
		// sum and avg of a student
		sumAvgStd(name[0], language, math, eng);
		sumAvgStd(name[1], language, math, eng);
		sumAvgStd(name[2], language, math, eng);
		
		System.out.println();
		
		// who's the best?
		best(language, name);
		best(math, name);
		best(eng, name);
	}
	
	static void sum(int[] arr) {
		int r = 0;
		
		for (int i = 0; i < arr.length; i++) {
			r += arr[i];
		}
		
		System.out.println("sum : " + r);
	}
	
	static void avg(int[] arr) {
		int r = 0;
		
		for (int i = 0; i < arr.length; i++) {
			r += arr[i];
		}
		
		r = r / arr.length;
		
		System.out.println("avg : " + r);
	}
	
	static void sumAvgStd(String str, int[] l, int[] m, int[] e) {
		int sum = 0;
		int avg = 0;
		int index = 0;
		
		switch (str) {
			case "hong":
				index = 0;
				break;
			case "seong":
				index = 1;
				break;
			case "il":
				index = 2;
				break;
		}
		
		sum = l[index] + m[index] + e[index];
		avg = sum / 3;
		
		System.out.println("sum of " + str + " : " + sum);
		System.out.println("avg of " + str + " : " + avg);
	}
	
	static void best(int[] arr, String[] str) {
		int index1 = 0;
		int index2 = 0;
		int grade = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (grade == arr[i]) {
				index2 = i;
			} else if (grade < arr[i]) {
				grade = arr[i];
				index1 = i;
			}
		}
		
		if (index2 > 0) {
			System.out.println(str[index1] + " and " + str[index2] + " are the best");
		} else {
			System.out.println(str[index1] + " is the best");
		}
	}

}











