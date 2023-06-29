package ch13_collection_연습문제;

import java.util.Objects;

import ch13_collection.sc02_set.Member;

public class Student {
	public int studentNum;
	public String name;
	public Student(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(studentNum, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Member)) {
			return false;
		}
		Member member = (Member) obj;
		return member.equals(this.studentNum) && member.equals(name);
	}
}
