package 연습문제2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar_ex {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2010, 0, 1);
		for (int i=1; i <12; i++) {
			int weekday = cal.get(Calendar.DAY_OF_WEEK);
			int secondSun = (weekday ==1) ? 8: 16 - weekday;
			cal.set(Calendar.DAY_OF_MONTH, secondSun);
			Date d = cal.getTime()
;
			System.out.println(new SimpleDateFormat("yyyy-MM-dd은 2번쨰 일요일입니다.").format(d));
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH, 1);
		}
		


	}

}


