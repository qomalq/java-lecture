package ch11_api.sec04_string;

public class 연습문 {

	public static void main(String[] args) {
		int num = 0;
		int count0 = 0;
		for (int i = 0; i <= 1000; i++) {
			num = i;
			System.out.print(num);
			if(num==1 || num==11 || num==111) {
				count0 += num;
				System.out.println(count0);
			}
		}
	}
}
