package ch05;

import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {
		// 160~162 2번
		int ttimes = 0; 
		for (int i=0; i <= 100; i+=3) {
			 ttimes += i;
		}
		System.out.println("1~100 까지의 3의 배수의 합: " + ttimes);
		System.out.println();
		// 160~162 3번
		int diceSum = 0;
		while (true) {
			int dice1 = 1 + (int)(Math.random()*6);
			int dice2 = 1 + (int)(Math.random()*6);
			System.out.println(dice1 + dice2 + " ");
			diceSum = dice1 + dice2;
			if (diceSum == 5)
				break;
		}
		System.out.println(); System.out.println(diceSum);
		System.out.println();
		// 160~162 4번
		for (int  x= 0;  x<= 10; x++) {
			for (int y = 0; y <=10; y++) {
				if ( 4*x + 5*y ==60)
					System.out.printf(" x값은: "+ x +" y값은: "+ y + "\n");
			}
		}
		System.out.println();
		
		//160~162 7번
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------");
			System.out.println("선택>");
			scanner.nextLine();
			System.out.println("예금액>");
			scanner.nextLine();
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------");
			System.out.println("선택>");
			scanner.nextLine();
			System.out.println("출금액>");
			scanner.nextLine();
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------");
			System.out.println("선택>");
			scanner.nextLine();
			System.out.println("잔고>");
			scanner.nextLine();
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------");
			System.out.println("선택>");
			scanner.nextLine();
			System.out.println("프로그램 종료");
			break;
		}
}
}
