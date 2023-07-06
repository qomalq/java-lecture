package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex02_SelectParameter {

	public static void main(String[] args) {
		select("KOR",10);
		
	}
	static void select(String countrycode, int num) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world",
					"ysuser", "Bigdata!2345");
			String sql = "select * from city where countrycode = ? limit ?";
			
			// SQL의 파라메터 세팅
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, countrycode);
			pstmt.setInt(2, num);
			
			// Select 실행
						ResultSet rs = pstmt.executeQuery();
						while (rs.next()) {
							int id = rs.getInt(1);
							String name = rs.getString(2);
							String countryCode = rs.getString(3);
							String district = rs.getString(4);
							int population = rs.getInt(5);
							System.out.printf("%d, %s, %s, %s, %d%n", id, name, countryCode, district, population);
						}
						rs.close(); pstmt.close(); conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
