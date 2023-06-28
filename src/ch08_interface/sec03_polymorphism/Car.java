package ch08_interface.sec03_polymorphism;

public class Car {
	Rollable frontLeftTire = new HankookTire();
	Rollable frontRightTire = new HankookTire();
	Rollable backLeftTire = new KumhoTire();
	Rollable backRightTire = new KumhoTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	
	// 매개변수의 다형성
	void changeFrontTire(Rollable tire) {
		this.frontLeftTire = tire;
		this.frontRightTire = tire;
	}
	void changeBackTire(Rollable tire) {
		this.backLeftTire = tire;
		this.backRightTire = tire;
	}
}
