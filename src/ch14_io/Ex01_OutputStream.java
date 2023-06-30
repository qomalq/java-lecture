package ch14_io;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex01_OutputStream {

	public static void main(String[] args) throws Exception {
		try {
			OutputStream os = new FileOutputStream("c:/Temp/test.db");
			byte a =10, b =20;
			int c = 30;
			os.write(a);
			os.write(b);
			os.write(c);
			
			byte[] array = {10 , 20, 30, 40, 50};
			
			os.write(array, 1, 3);

			os.flush();
			os.close();
		} catch (Exception e ) {
			e.printStackTrace();
		}
	}
}
