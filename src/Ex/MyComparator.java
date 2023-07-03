package Ex;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class MyComparator implements Comparator<Map.Entry<String, Integer>> {

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		if (o1.getValue() == o2.getValue())
			return o1.getKey().compareTo(o2.getKey());
		return o2.getValue() - o1.getValue();
		
	}
	
}
