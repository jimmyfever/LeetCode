import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.Arrays;

public class MostCommonWord819 {
	
	

	public static void main(String[] args){
		
	}	
	public String mostCommonWord(String paragraph, String[] banned){
		Set<String> ban = new HashSet<>(Arrays.asList(banned));
		Map<String, Integer> count = new HashMap<>();
		String[] words = paragraph.toLowerCase().split("[ !?',;.']+");
		String res = "";
		for(String w : words){
			if(!ban.contains(w)){
				count.put(w, count.getOrDefault(w, 0) + 1);
			}
		}
		return Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();
	}
}