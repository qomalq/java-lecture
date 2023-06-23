package ch06;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		int x = Integer.parseInt(scan.nextLine());
		int y = Integer.parseInt(scan.nextLine());
		System.out.printf("더하기: " + x + "+" + y +"=" + calc.add(x, y) + "\n" + "뺴기: " + + x + "-" + y +"=" + calc.sub(x, y) + "\n" + "곱하기: " + + x + "*" + y +"=" + calc.mul(x, y) + "\n" + "나누기: " + + x + "/" + y +"=" + calc.div(x, y));
		System.out.println();
		System.out.println(x * x * Math.PI);
	}
}