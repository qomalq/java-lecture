package ch04;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		System.out.print("점수 입력>");
		Scanner scan = new Scanner(System.in);
		int score = Integer.parseInt(scan.nextLine());

		char grade;
		if (score >=90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >=60)
			grade = 'D';
		else
			grade = 'F';
		char result;
		if (score >= 97)
			result = '+';
		else if(score >= 93)
			result = '0';
		else if(score >= 90)
			result = '-';
		else if(score >= 87)
			result = '+';
		else if(score >= 83)
			result = '0';
		else if(score >= 80)
			result = '-';
		else if(score >= 77)
			result = '+';
		else if(score >= 73)
			result = '0';
		else if(score >= 70)
			result = '-';
		else if(score >= 67)
			result = '+';
		else if(score >= 63)
			result = '0';
		else if(score >= 60)
			result = '-';
		else
			result = ' ';
		System.out.println(score +"점은 " + grade + result +"학점 입니다.");

	}

}
