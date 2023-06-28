package 연습문제;

public class Dropship implements Unit {

	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void stop() {
		
	}
	
	public void load() {
		System.out.println("선택된 대상을 태운다.");
	}
	
	public void unload() {
		System.out.println("선택된 대상을 내린다.");
	}
	
}
