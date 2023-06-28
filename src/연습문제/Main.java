package 연습문제;

public class Main {

	public static void main(String[] args) {
		Marine marine = new Marine();
		marine.move(1, 3);
		marine.stop();
		marine.stimPack();
		
		Tank tank = new Tank();
		tank.move(3, 5);
		tank.stop();
		tank.changeMode();
		
		Dropship dropship = new Dropship();
		dropship.move(7, 8);
		dropship.stop();
		dropship.load();
		dropship.unload();
	}

}
