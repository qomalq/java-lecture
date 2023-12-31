package ch11_api.sec04_string;

import java.util.Arrays;

public class Ex12_Split {

	public static void main(String[] args) {
		String fruits = "감, 배, 귤, 밤";
		String[] fruitArray = fruits.split(",");
		System.out.println(Arrays.toString(fruitArray));


		fruits = "감, 배. 귤; 밤";
		fruitArray = fruits.split("[,|.|;]");		// 정규표현식 사용가능
		System.out.println(Arrays.toString(fruitArray));

		// PATH
		String paths = System.getenv("PATH");
		System.out.println(paths);
		String[] pathArray = paths.split(";");
		for (String path: pathArray) 
			System.out.println(path);
	}

}
