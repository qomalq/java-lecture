package ch09_nested.sec01_nested_class;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		b.field1 = 5;
		b.method1();
		
		A.C c = new A.C();
		c.field1 = 7;
		c.field2 = 9;
		A.C.field2 = 10;
		c.method1();
		c.method2();
		A.C.method2();
		
		a.method();
		
	}

}
