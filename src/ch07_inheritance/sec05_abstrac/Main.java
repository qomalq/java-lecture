package ch07_inheritance.sec05_abstrac;

public class Main {

	public static void main(String[] args) {
		//Phone phone = new Phone();	// 추상 클래스는 객체화 할 수 없음
		SmartPhone sp = new SmartPhone();
		sp.turnOn();
		sp.call("010-1234-5678");
		sp.tunrOff();
		
	}

}
