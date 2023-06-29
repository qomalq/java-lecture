package ch13_collection.sc03_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex01_HashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<>();		//Key의 sorting
		
		map.put("사과",1000); map.put("배", 2000); map.put("감", 800);
		System.out.println(map.size());
		
		// key로 value를 얻기
		int val = map.get("배");
		System.out.println("배: " +val);
		
		//Key으리 Set collection - Key set을 이용하길 권장함.
		Set<String> keySet = map.keySet();
		for (String key: keySet)
			System.out.println(key + " : " + map.get(key));
		System.out.println("=========================");
		
		// Entry의 Set collection
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry: entrySet)
			System.out.println(entry.getKey() + " : " + entry.getValue());
		System.out.println("=========================");
		
		// Stream으로 처리
		map.forEach((k,v)-> System.out.println(k+ " : " + v));
		
		// 검색
		System.out.println(map.containsKey("Apple"));
		System.out.println(map.containsValue(2000));
		
		// 값 변경
		map.put("사과", 1500);
		map.forEach((k,v)-> System.out.println(k+ " : " + v));
		
		// entry 삭제
		map.remove("감");
		map.forEach((k,v)-> System.out.println(k+ " : " + v));
		
	}

}
