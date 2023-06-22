package ch05;

import java.util.Scanner;

public class 연습문제2 {

	public static void main(String[] args) {
		// 200~202 4번
		
		int max =0;
		int[] array = {1,5,3,8,2};
		for (int arr: array) {
			if (arr > max) {
				max = arr;
			}
		}
		System.out.println("max: " + max);
		System.out.println();
		// 200~202 5번
		
		int[][] array2 = {{95,86},{83,92,96},{78,83,93,87,88}};
		int sum = 0;
		double avg = 0.0;
		double leng = 0.0;
		for (int i =0; i < array2.length; i++) {
			for (int k =0; k < array2[i].length; k++)
				sum += array2[i][k];
				leng += array2[i].length;
				avg = sum / leng;
		}		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		System.out.println();
		// 200~202 6번
		boolean run = true;
		int studentNum =0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.print("선택>");
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo ==1) {
				System.out.println("학생수>");
				studentNum = Integer.parseInt(scanner.nextLine());
				
			}else if(selectNo ==2) {
				for (int i =0; i <= studentNum; i++)
					scores[i] = Integer.parseInt(scanner.nextLine());
			} else if(selectNo ==3) {
			
			} else if(selectNo ==4) {
				
			} else {
				run = false;
			} 
			System.out.println("프로그램 종료");
			
			
			
			}
		}
}

