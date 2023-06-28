package ch07_inheritance.sec05_abstrac;

/**
 * Phone을 추상화한 클래스
 */
public abstract class Phone {
	public String owenr;
	public String number;
	
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	void tunrOff() {
		System.out.println("폰 전원을 끕니다.");
	}

	//추상 클래스를 상속받은 클래스는 추상 메소드를 반드시 재정의 해야함.
	public abstract void call(String number);
}
