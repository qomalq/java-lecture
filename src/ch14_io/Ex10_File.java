package ch14_io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Ex10_File {

	public static void main(String[] args) throws IOException {
		File dir = new File("c:/Temp/images");
		File file =new File("c:/Temp/file.txt");
		
		if(!dir.exists())
			dir.mkdirs();
		if(!file.exists())
			file.createNewFile();
		
		// c:/Temp 디렉토리 검색
		File temp = new File("c:/Temp");
		File[] contents = temp.listFiles();
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for (File f: contents) {
			System.out.printf("%-24s", sdf.format(f.lastModified()));
			if (f.isDirectory())
				System.out.printf("%-14s %-22s", "<DIR>", f.getName());
			else
				System.out.printf("%,14d %-22s", f.length(), f.getName());
			System.out.println();
		}
	}

}
