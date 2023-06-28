package 연습문제;

public class Marine implements Unit {
	@Override
	public void move(int x, int y) {
		System.out.println( + x +"," + y +"로 이동합니다.");
	}

	@Override
	public void stop() {
		System.out.println("현재 위치에 정지");
	}
	
	public void stimPack() {
		System.out.println("스팀팩을 사용한다.");
	}
	
}
