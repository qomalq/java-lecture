package ch13_collection.sc01_list;

import java.util.Comparator;

public class MemberAgeComparator implements Comparator<Member> {
	public int compare(Member m1, Member m2) {
		return -(m2.getAge()) - (m1.getAge());
	}
}
