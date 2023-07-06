package mysql;

import java.io.*;
import java.util.Properties;

import ch13_collection.sc03_Map.Ex03_Properties;

public class Ex04_properties {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties(); // Map<String, String>

		// mysql.properties 파일 로드
		prop.load(Ex04_properties.class.getResourceAsStream("mysql.properties"));
		
		Properties props = new Properties();
		InputStream is = new FileInputStream("D:/javaworkspace/javalecture/src/mysql/mysql.properties");
		props.load(is);
		is.close();
		
		String host = props.getProperty("host");
		String user = props.getProperty("user");
		String password = props.getProperty("password");
		String database = props.getProperty("database");
		String port = props.getProperty("port");
		String connStr = "jdbc:mysql://" + host + ":" + port + "/" +  database;
		System.out.println(connStr);
		System.out.println("DriverManager.getConnection(connStr,user,password);" );
	}

}
