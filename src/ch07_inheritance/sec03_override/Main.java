package ch07_inheritance.sec03_override;

public class Main {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.ParentInt = 1000;
		parent.parentMthod();
		
		Child child = new Child();
		child.childInt = 300;
		child.ParentInt = 600;
		child.parentMthod();
	}

}
