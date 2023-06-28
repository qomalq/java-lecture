package ch11_api.sec04_string;

public class NumberCount {

	public static void main(String[] args) {
		String numStr = "";
		for (int i=1; i <=1000; i++)
			numStr +=i;
		for(int i=0; i <=9; i++)
			int count = Strings.count(numStr, ""+i);
			System.out.println(i+":" + count);
	}

}
