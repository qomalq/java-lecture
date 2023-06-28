package 연습문제;

import java.util.Random;
import java.util.Scanner;

public class Answers {
	public void q1() {
		for(int x =0; x <=10; x++ )
			for(int y = 0; y <=10; y++)
				if (2*x +4*y==10) {
					System.out.printf("x값: " + x + " y값: " + y + "\n");
				}
	}
	public void q2() {
		String str = "12345";
		int sum = 0;
		for(int i =0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
		}
		System.out.println("sum=" + sum);
	}
	public void q3() {
		int num = 12345;
		int sum = 0;
		
		while(num > 0) {
			sum += num%10;
			num /= 10;
		}
		System.out.println("sum=" + sum);

	}
	public void q4() {
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		System.out.println(num1+","+num2);
		for (int i =0; i<8; i++) {
			num3 = num1 + num2;
			System.out.println(","+num3);
			num1 = num2;
			num2 = num3;	
		}
	}
	public void q5() {
		int a =1;
		int b =0;
		int c = 0;
		for(int i =2; i<=9; i++) {
			for(int k=1; k<=3; k++) {
				a =i;
				b =k;
				c = a*b;
				System.out.printf(a +"*"+ b +"=" +c + "\t");
			}
		}
	}
	public void q6() {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		for(int i=0; i < value.length() ;i++) {
			ch = value.charAt(i);
			if(!('0'<=ch && ch<='9')) {
			isNumber = false;
			break;
			}
		}
		if (isNumber) {
			System.out.println(value + "는 숫자입니다.");
		} else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}
	}
	
	public void q7() {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;
		int count = 0;
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 :");
			input = s.nextInt(); 
			if(answer > input) {
				System.out.println(" 더 큰 수를 입력하세요."); 
				} else if(answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
				} else {
				System.out.println("맞췄습니다."); 
				System.out.println("시도횟수는 " +count+" 번입니다."); 
				break; 
				}
				} while(true);
	}
	public void q8() {
		int number = 12321;
		int tmp = number;
		int result = 0;
		while(tmp !=0) {
			result = result *10 + tmp % 10;
			tmp /=10;
		}
		if(number == result)
			System.out.println(number + "는 palindrome 입니다.");
		else
			System.out.println(number + "는 not palindrome 입니다.");
	}
}
