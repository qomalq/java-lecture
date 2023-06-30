package ch14_io;

import java.io.*;

/**
 * BufferedReader를 사용하면 line 단위로 글을 읽을 수 있음
 */

public class Ex07_ReadLine {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("c:/Temp/test.txt"));
		int lineNum = 1;
		while (true) {
			String line = br.readLine();
			if (line ==null)
				break;
			System.out.println(lineNum + ": " + line);
			lineNum++;
		}
		br.close();
		
	}

}
