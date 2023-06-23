package ch06;

public class Ex01_interaciton {

	public static void main(String[] args) {
		int[] scores = {67, 89, 87, 92, 72};
		MyUtil myUtil = new MyUtil();			// 객체 생성
		int min = myUtil.getMinimum(scores);	// instance method 호출
		int max = myUtil.getMaximum(scores);	
		double average = MyUtil.getAverage(scores);		//static method 호출
		System.out.printf("%d, %d, %.1f\n", min, max, average);
		
//		myUtil.privateMethod();			//접근 제한자가 private 이라서 외부에서 사용 불가
	}

}
