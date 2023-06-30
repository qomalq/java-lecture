package Ex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Grep {

	public static void main(String[] args) {
		grep("for","c:/Temp/Q1_CountWord.java");
	}

	static void grep(String word, String filePath)  {
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			int lineNo = 0;
			while (true) {
				String line = br.readLine();
				if (line ==null)
					break;
				lineNo++;
				String newLine = line.toLowerCase();
				if (newLine.contains(word.toLowerCase()));
					System.out.printf("%4d:\t%s\n", lineNo,line);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
