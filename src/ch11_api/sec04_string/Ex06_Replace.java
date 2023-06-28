package ch11_api.sec04_string;

public class Ex06_Replace {

	public static void main(String[] args) {
		String oldString = "자바는 객체지향 언어이고 자바는 풍부한 API를 지원함.";
		String newStr = oldString.replace("자바", "Java");
		System.out.println(newStr);
	}

}
