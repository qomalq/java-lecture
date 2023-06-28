package ch11_api.sec04_string;

public class Palindrome {

	public static void main(String[] args) {
		int maxPal = 0, x=0, y=0;
		for (int i = 100; i <=999; i++) {
			for (int k = i; k <=999; k++) {
				int mul =i*k; 
				if (Strings.isPalindrome(String.valueOf(mul))) {
					if(mul >maxPal) {
						maxPal = i*k;
						x = i;
						y = k;
					}
				}
			}
		}
		System.out.printf("%d x %d = %d\n",x,y,maxPal);
	}

}

