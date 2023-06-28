package ch11_api.sec03_class;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		Car car = new Car("Model 3", "Tesla");
		Class clazz = car.getClass();
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		System.out.println(clazz.getPackage().getName());
		System.out.println();
		
		clazz = Class.forName("ch11_api.sec03_class.Car");
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		System.out.println(clazz.getPackage().getName());
		System.out.println();
		
		clazz = Car.class;
		System.out.println(clazz.getName());
		System.out.println();

		System.out.println(clazz.getResource("test.txt"));
	}

}
