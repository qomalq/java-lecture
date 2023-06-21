package ch04;

import java.time.LocalDateTime;
import java.util.Scanner;

public class FullAge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year;
		int month;
		int day;
		System.out.println("생년");
		year = Integer.parseInt(scan.nextLine());
		System.out.println("생월");
		month =  Integer.parseInt(scan.nextLine());
		System.out.println("생일");
		day =  Integer.parseInt(scan.nextLine());
		System.out.print(year); System.out.print(month); System.out.print(day); 

	}
}

