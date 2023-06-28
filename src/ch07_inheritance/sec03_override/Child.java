package ch07_inheritance.sec03_override;
/**
 *  Method override(재정의)
 */
public class Child extends Parent{
	int childInt;
	
	void childeMethod () {
		System.out.println(this.childInt);
	}
	
	@Override
	void parentMthod() {
		System.out.println("Parent: ");
		super.parentMthod();
		System.out.println("Child: "+ this.childInt);
	}
}
