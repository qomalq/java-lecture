package ch14_io;

import java.io.*;

/**
 *  FileXXXStream VS. BufferdXXXStream 성능 비교
 */

public class Ex06_BufferdIO {
	public static void main(String[] args) throws Exception {
		//Case1
		FileInputStream fis = new FileInputStream("c:/Temp/img1.jpg");
		FileOutputStream fos = new FileOutputStream("c:/Temp/target1.jpg");
		
		// Case2
		FileInputStream fis2 = new FileInputStream("c:/Temp/img2.jpg");
		FileOutputStream fos2 = new FileOutputStream("c:/Temp/target2.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		// 성능 비교
		long noBufferTime = copy(fis, fos);	//0.5초
		System.out.println("버퍼 미사용: " + noBufferTime + " ns");
		long BufferTime = copy(bis, bos);	// 0.01초
		System.out.println("버퍼 사용: " + BufferTime + " ns");
		
		bis.close(); bos.close(); fis2.close();
		fos2.close(); fis.close(); fos.close();
	}
	static long copy(InputStream is, OutputStream os) throws Exception {
		long startTime = System.nanoTime();
		//1 byte 단위로 읽고 쓰기
		while(true) {
			int data = is.read();
			if (data == -1)
				break;
			os.write(data);
		}
		os.flush();
		long endTime = System.nanoTime();
		return endTime - startTime;
	}

}
