package ch13_collection.sc01_list;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JSP");
		list.add("Servlet");
		
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println(list.size());
		
		for (int i=0; i< list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
		System.out.println();
		for (String element: list)
			System.out.print(element + " ");
		System.out.println();
		list.forEach(x->System.out.println(x)); // lamda x:print(x)
		
		list.remove(1);
		list.add("JDBC");
		list.add("Spring");
		
		list.forEach(x->System.out.println(x));
		
		System.out.println(list.isEmpty());
		System.out.println(list.contains("Spring"));
		
		list.clear();
		System.out.println(list.isEmpty());
	}

}
