package ch07_inheritance.sec04_poly;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();
		
		Dog dog = new Dog();
		dog.sound();
		
		//다형성, 자식은 부모 타입으로 자동 타입 변환이 이루어 진다.
		Animal animal = new Cat();
		animal.sound();
		animal = dog;
		animal.sound();
		
		animal = dog;
		// 부모 타입을 자식타입으로 대입이 가능한지 확인 후에 강제타입 변환
		if (animal instanceof Cat) {
			cat.sound();
		} else if (animal instanceof Dog) {
			 dog = (Dog) animal;
			 dog.sound();
		} else {
			System.out.println("cat.sound()를 사용할 수 없음.");
		}
		Object obj = new Animal();
		//obj.sound();
		if (obj instanceof Animal) {
			animal = (Animal) obj;
			animal.sound();
		}
	}

}
