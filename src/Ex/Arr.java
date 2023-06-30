package Ex;

import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

import ch11_api.sec04_string.Strings;

public class Arr {

	public static void main(String[] args) {
		String text = "But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure?";
		String regex = "[^a-zA-Z0-9가-힣\\s]";
		System.out.println();
		Map<String, Integer> wordCountMap = new HashMap<>();
		System.out.println(text.length());
		String cleanText = text.replaceAll("[.|?|,]","");
		String[] words = cleanText.split(" ");
		System.out.println("단어 갯수: " + words.length);
		
		Set<String> set = new HashSet<>();
		for (String word: words)
			set.add(word.toLowerCase());
		System.out.println("고유단어 갯수: " + set.size());
		
		Map<String, Integer> map = new HashMap<>();
		for (String word: words) {
			String newWord = word.toLowerCase();
			if (map.containsKey(newWord)) {
				map.put(newWord, map.get(newWord)+1);
			}
			else
				map.put(newWord, 1);
				
		}
	}
}


