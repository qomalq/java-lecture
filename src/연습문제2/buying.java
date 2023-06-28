package 연습문제2;

public class buying {
	public void add(int money, String[] product){}
	public void buy(int money, int price) {
		if (money < price) {
			System.out.println("잔액이 부족합니다.");
		} else {
			int result = money - price;
			System.out.println("잔액은" + result +"원 입니다.");
		}
	}
}