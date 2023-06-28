package ch11_api.sec01_object;

import java.util.Objects;

public class Key2 {
	int number;
	String name;
	
	Key2(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key2) {
			Key2 key = (Key2) obj;
			return this.number == key.number;
			
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(number);
//		return Objects.hash(number, name);
	}

	@Override
	public String toString() {
		return "Key2 [number=" + number + ", name=" + name + "]";
	}
}
