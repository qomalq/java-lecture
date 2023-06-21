package ch04;


import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = Integer.parseInt(scan.nextLine());
		int M = Integer.parseInt(scan.nextLine());
		if (H !=0 && M >=45)
			System.out.printf(H +"시" +(M-45)+"분");
		else if (H==0 && M< 45)
			System.out.printf(23 +"시" +(60-(45-M))+"분");
		else if (H!=0 && M>=45)
			System.out.printf(H +"시" +(M-45)+"분");
	}

}
