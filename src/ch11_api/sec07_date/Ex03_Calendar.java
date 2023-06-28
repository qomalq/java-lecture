package ch11_api.sec07_date;

import java.util.Calendar;

public class Ex03_Calendar {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		
		int year= now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int date = now.get(Calendar.DAY_OF_WEEK);
		int amPm = now.get(Calendar.AM_PM);
		int hour24 = now.get(Calendar.HOUR_OF_DAY);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.printf("%d년, %d월, %d일, %d, %d,%d시, %d시,%d분,%d초\n", 
				year, month, day, date, amPm, hour, hour24, minute, second);
	}

}
