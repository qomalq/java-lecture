package ch06;

import java.time.LocalDate;

public class Calculator {
	public int add(int x, int y) {
		int result = x + y;
		return result;
	}
	public int mul(int x, int y) {
		int result = x * y ;
		return result;
	}
	public int sub(int x, int y) {
		int result = x - y;
		return result;
	}
	public double div(int x, int y) {
		int result =  x / y;
		return result;
	}
}
