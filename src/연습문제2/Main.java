package 연습문제2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer>cart = new HashMap(); 
		Scanner scan = new Scanner(System.in);
		System.out.println("현재 잔액");
		int money = Integer.parseInt(scan.next());
		System.out.println("물건");
		String product = String(scan.next());	
		System.out.println("가격");
		int price = Integer.parseInt(scan.next());
		System.out.println("잔액");
		cart.put(product, price);
		for (int i = money; i < price; i++) {
			if (i < price); 
				System.out.println("잔액이 부족합니다.");
		}
	}

	private static String String(String next) {
		return null;
	}

}
