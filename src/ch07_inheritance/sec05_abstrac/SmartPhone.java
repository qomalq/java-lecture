package ch07_inheritance.sec05_abstrac;

public class SmartPhone extends Phone {
	@Override
	void turnOn() {
		System.out.println("스마트폰 전원을 켭니다.");
	}
	@Override
	void tunrOff() {
		System.out.println("스마트폰 전원을 끕니다.");
	}
	@Override
	public void call(String number) {
		System.out.println(number + "로 전화를 겁니다.");
	}
	
}
