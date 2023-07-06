package mysql.Login;

import java.util.Scanner;

public class LoginApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("+------------+----------+--------------+----------------+---------------+-----------------+-------------+");
			System.out.println("| 1.회원가입 | 2.로그인 | 3.아이디변경 | 4.비밀번호변경 | 5.아이디 찾기 | 6.비밀번호 찾기 | 7. 로그아웃 |");
			System.out.println("+------------+----------+--------------+----------------+---------------+-----------------+-------------+");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			switch(selectNo) {
			case 1:
				//membership
			case 2:
				//login
			case 3:
				// chage ID
			case 4:
				// change Pw
			case 5:
				// find ID
			case 6: 
				// find PW
			case 7:
				//log out
			}
		}
	}

}
