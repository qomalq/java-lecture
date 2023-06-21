package ch02;

public class Ex01_Variable {
	private int value = 20;
	public static void main(String[] args) {
		int age;
		age = 21;
		int value = 80;
		int score = value * 2;		 // 변수를 선언하면서 초기화를동시에 해준는 것을 권장
		System.out.println("age:" + age + ", score:" + score );
		
		int x = 10, y = 20;
		// x와 y를 바꾸고 싶을 떄
		int tmp = x;
		x = y;
		y = tmp;
		
		if (score > 100) {
			int localVar = 10;			// if block 안에서만 사용가능한 로컬 변수
			//int value = 20;			// local 변수 value가 이미 whs재 하므로 사용 x
			System.out.println(localVar);
		}
		// 여기에서는 localVar를 사용 할 수 없음.
	}
}
