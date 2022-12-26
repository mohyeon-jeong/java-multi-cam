package sample15_calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainClass {

	public static void main(String[] args) {
//		Calendar cal = new GregorianCalendar(); 잘 안쓰고 아래 방법으로 많이 씀
		Calendar cal = Calendar.getInstance();
		
		// today
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // 0 ~ 11이라 1월 ~ 12월로 표시해주기 위한 +1
		int day = cal.get(Calendar.DATE);
		
		System.out.println(year + "/" + month + "/" + day);
		
		// date setting
//		cal.set(Calendar.YEAR, 2023);
//		cal.set(Calendar.MONTH, 3 - 1); // 3으로 set하면 4로 나오기 때문에 -1
//		cal.set(Calendar.DATE, 15);
//		
//		year = cal.get(Calendar.YEAR);
//		month = cal.get(Calendar.MONTH) + 1;
//		day = cal.get(Calendar.DATE);
//		
//		System.out.println("new date " + year + "/" + month + "/" + day);
		
		// am / pm
		String ampm = cal.get(Calendar.AM_PM) == 0 ? "AM":"PM"; // 삼항 연산자
		System.out.println(ampm);
		
		int weekday = cal.get(Calendar.DAY_OF_WEEK); // sunday(1) to saturday(7)
		System.out.println(weekday);
		
		// last day of month
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
		
		// top blank(달력으로 봤을 때 직전 월 마지막 일요일부터 당월 1일 전까지의 일 수) (28 29 30 31 1 2 3 -> 4일)
		cal.set(Calendar.DATE, 1);
		weekday = cal.get(Calendar.DAY_OF_WEEK);
		int upBlank = (weekday - 1) % 7;
		System.out.println(upBlank);
		
		// create calendar
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		
		System.out.println(year + "/" + month);
		System.out.println("=====================================================");
		
		String week_day = "일월화수목금토";
		
		for (int i = 0; i < week_day.length(); i++) {
			char c = week_day.charAt(i);
			System.out.print(c + "\t");
		}
		
		System.out.println();
		
		System.out.println("=====================================================");
		
		// top blank
		for (int i = 1; i < firstDay; i++) {
			System.out.print("*" + "\t");
		}
		
		// date
		int day1 = 1;
		
		for (int i = 0; i < lastDay; i++) {
			System.out.print(day1 + "\t");
			if ((day1 + firstDay - 1) % 7 == 0)
				System.out.println();
			day1++;
		}
		
		// bottom blank
		for (int i = 0; i < (7 - (firstDay + lastDay - 1) % 7); i++) {
			System.out.print("*" + "\t");
		}
		
		System.out.println();
		
		System.out.println("=====================================================");
	}

}














