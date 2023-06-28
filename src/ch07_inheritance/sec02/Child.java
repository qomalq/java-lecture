package ch07_inheritance.sec02;

public class Child extends Parent {
	int childInt;
	Child() {}
	Child(int childInt) {
		super(childInt*2);
		this.childInt = childInt;
	}
	void childMethod() {
		System.out.println(this.childInt);
	}
}
