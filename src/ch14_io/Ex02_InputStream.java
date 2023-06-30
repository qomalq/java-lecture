package ch14_io;

import java.io.*;
import java.util.Arrays;

public class Ex02_InputStream {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("c:/Temp/test.db");
	
		// 1.
		while(true) {
			int data = is.read(); // read 1byte 
			if (data == -1)
				break;
			System.out.print(data + " ");
		}
		// 2.
		byte[] arr = new byte[20];
		while (true) {
			int num = is.read(arr);
			System.out.println("읽은 바이트 수:" + num);
			if (num == -1)
				break;
		}
		System.out.println(Arrays.toString(arr));
		
		is.close();
	}

}
