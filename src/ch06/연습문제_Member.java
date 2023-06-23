package ch06;

public class 연습문제_Member {
	private String name;
	private String id;
	private String password;
	private int age;
	public 연습문제_Member() {}
	public 연습문제_Member(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public 연습문제_Member(String name, String id, String password, int age) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "연습문제 [name=" + name + ", id=" + id + ", password=" + password + ", age=" + age + "]";
	}
	
}
