package 연습문제2;

import java.util.*;
import java.text.*;
class Birth {
	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		String pattern2 = " E ."; // 'E' ~ . 입력하신 날짜는 요일입니다 는 일 토 중의 하나가 된다
		DateFormat df = new SimpleDateFormat(pattern);
		DateFormat df2 = new SimpleDateFormat(pattern2);
		Scanner s = new Scanner(System.in);
		Date inDate = null;
		do {
			System.out.println("날짜를 " + pattern 
			+ "의 형태로 입력해주세요.( 입력예 :2007/05/11)"); 
			try {
			System.out.print(">>");
			inDate = df.parse(s.nextLine()); // ParseException . 이 발생할 수 있다
			break; // parse() . 에서 예외가 발생하면 이 문장은 수행되지 않는다
			} catch(Exception e) {}
			} while(true);
		System.out.println(df2.format(inDate));
	} // main
}
