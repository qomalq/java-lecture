package ch06;

import java.util.Scanner;

public class Ex05_Tmoney {

	public static void main(String[] args) {

//		Tmoney tm1 = new Tmoney(15,10000);
//		Tmoney tm2 = new Tmoney(25,10000);
//		// 15세 청소년 사례
//		System.out.println(tm1);
//		while (true) {
//			if (tm1.ride() ==true)
//				System.out.println(tm1);
//			else
//				break;
//		}
//		System.out.println();
//		// 25세 청년 사례
//		System.out.println(tm2);
//		while (true) {
//			if (tm2.ride() ==true)
//				System.out.println(tm2);
//			else
//				break;
//		}
		Scanner scan = new Scanner(System.in);
		Tmoney tmoney = new Tmoney(Integer.parseInt(scan.nextLine()), Integer.parseInt(scan.nextLine()));
		System.out.println(tmoney);
		for (int i =1; i < Integer.MAX_VALUE; i++) {
			if (tmoney.ride() ==true)
				System.out.print(i + "회 탑승후 ");
		}
	}

}
