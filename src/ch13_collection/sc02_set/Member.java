package ch13_collection.sc02_set;

import java.util.Objects;

import ch11_api.sec01_object.Key;

public class Member {
	private int age;
	private String name;
	private String tel;
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Member() {}
	public Member(int age, String name, String tel) {
		super();
		this.age = age;
		this.name = name;
		this.tel = tel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [age=" + age + ", name=" + name + ", tel=" + tel + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Member)) {
			return false;
		}
		Member member = (Member) obj;
		return this.tel ==member.getTel() && this.age == member.getAge() && this.name.equals(member.getName());
	}
}
