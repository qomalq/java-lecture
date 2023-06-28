package ch08_interface.sec01;

public interface RemoteControllable {
	// 상수(constant)
	public int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	// 추상 메소드(Abstract method)
	void turnOn();			// public abstract가 생략
	public abstract void turnOff();
	public abstract void setVolume(int volume);
}
