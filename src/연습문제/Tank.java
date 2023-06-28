package 연습문제;

public class Tank implements Unit{
	
	@Override
	public void move(int x, int y) {
		System.out.println( + x +"," + y +"로 이동합니다.");
	}

	@Override
	public void stop() {
		System.out.println("현재 위치에 정지");
	}
	public void changeMode() {
		System.out.println("공격모드를 변경합니다.");
	}
	 
}
