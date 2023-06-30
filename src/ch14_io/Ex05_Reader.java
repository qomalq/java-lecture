package ch14_io;

import java.io.*;

public class Ex05_Reader {

	public static void main(String[] args) throws Exception {
		Reader reader = null;
		
		// 한 문자씩 읽기
		reader = new FileReader("C:/temp/test.txt");
		while (true) {
			int data = reader.read();
			if (data == -1)
				break;
			System.out.print((char) data);
		}
		reader.close();
		System.out.println();
		
		// 문자 배열로 읽기
		reader = new FileReader("C:/temp/test.txt");
		char[] buffer = new char[100];
		while(true) {
			int num = reader.read(buffer);		//num -> 읽은 문자수
			System.out.println(num);
			if (num == -1)
				break;
			for (int i = 0; i < num; i++)
				System.out.print(buffer[i]);
			System.out.println();
		}
		reader.close();
	}

}
