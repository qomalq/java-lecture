package ch11_api.sec04_string;

public class Strings {
	public static int count(String src, String target) {
		String eliminated = src.replace(target, "");
		int len = (src.length()-eliminated.length()) / target.length();
		return len;
	}
	public static boolean isPalindrome(String str) {
		return str.equals(reverse(str));
	}
	private static String reverse(String str) {
		String reverseStr = "";
		for (int i = str.length()-1; i >=0; i--)
			reverseStr += str.charAt(i);
		return reverseStr;
	}
}
