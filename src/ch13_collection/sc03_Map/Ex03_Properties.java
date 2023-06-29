package ch13_collection.sc03_Map;

import java.io.IOException;
import java.util.Properties;

public class Ex03_Properties {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties(); // Map<String, String>
		
		// database.properties 파일 로드
		prop.load(Ex03_Properties.class.getResourceAsStream("database.properties"));
		String driver = prop.getProperty("driver");
		System.out.println(driver);
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("admin"));
		
	}

}
