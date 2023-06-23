package ch06;

public class Tmoney {
	private int age;
	private int cash;
	public static final int CHILD_FARE = 730;
	public static final int YOUTH_FARE = 1010;
	public static final int ADULT_FARE = 1450;
	
	public Tmoney(int age) {
		this.age = age;
	}
	public Tmoney(int age, int cash) {
		this.age = age;
		this.cash = cash;
	}
	
	public int charge(int cash) {
		this.cash +=cash;
		return cash;
	}
	public boolean ride() {
		if (this.age >= 7 && this.age <=12) {
			if (this.cash >= this.CHILD_FARE) {
				this.cash -= this.CHILD_FARE; return true;
			}
				return false;
		} else if (this.age >=13 && this.age <= 18) {
			if (this.cash >= this.YOUTH_FARE) {
				this.cash -= this.YOUTH_FARE; return true;
			}
				return false;
		} else if (this.age >=19) {
			if (this.cash >= this.ADULT_FARE) {
				this.cash -= this.ADULT_FARE; return true;
			}
				return false;
		} 
			return true;
			
	}
	@Override
	public String toString() {
		return "Tmoney [age=" + age + ", cash=" + cash + "]";
	}
	
	
}
