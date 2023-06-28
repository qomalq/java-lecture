package ch12_thread.sec03_multi_thread;

public class Main {

	public static void main(String[] args) {
		Thread thread = new BeepThread();
		for (int i =0; i <5; i++) {
			System.out.println("Beep");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
