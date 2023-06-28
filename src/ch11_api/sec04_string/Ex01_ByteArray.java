package ch11_api.sec04_string;

import java.io.IOException;
import java.util.Arrays;

public class Ex01_ByteArray {

	public static void main(String[] args) throws Exception {
		byte[] bytes = {72, 101,108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		byte[] inputBytes = new byte[100];
		System.out.println("입력: ");
		int readBytes = System.in.read(inputBytes);
		
		String str3 = new String(inputBytes, 0, readBytes-2); // \r \n 제거
		System.out.printf("%d, %s\n", readBytes, str3);
		System.out.println(Arrays.toString(inputBytes));
	}

}
