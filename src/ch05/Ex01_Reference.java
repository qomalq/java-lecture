package ch05;

import java.util.Scanner;

public class Ex01_Reference {

	public static void main(String[] args) {
		int a = 10, b = 10;
		System.out.println(a == b);
		String ref1 = "자바";
		String ref2 = "자바";
		System.out.println(ref1 == ref2);	// String의 내용이 같은지 물어보는 것이아니라 참조하는 기억장소가 같은지를 물어보는 것
		String ref3 = new String("자바");
		System.out.println(ref1 == ref3);
		System.out.println(ref1.equals(ref3));
		
		String s = null;
		String[] strArr = null;
		Scanner scan = null;
		System.out.println(s == null);
		
		String t = "";
		System.out.println(t.length());	// 0
//		System.out.println(s.length()); // NullPointerException
	}

}
