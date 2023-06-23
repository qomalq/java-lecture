package ch06;

public class MyUtil {
	public MyUtil() { }	// 필드 값이 없어서 Java에서 알아서 만들어주는 생성자
	
	public int getMinimum(int[] array) {
		int min = Integer.MAX_VALUE;
		for (int element: array) {
			if (min > element)
				min = element;
		}
		return min;
	}
	public int getMaximum(int[] array) {
		int max = Integer.MIN_VALUE;
		for (int element: array) {
			if (max < element)
				max = element;
		}
		return max;
	}
	public static double getAverage(int[] array) {
		int sum = 0;
		for (int element: array)
			sum += element;
		return (double) sum / array.length;
	}
}
