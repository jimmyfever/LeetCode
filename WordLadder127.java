import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class WordLadder127 {
	
	

	public static void main(String[] args){
		
	}
	public int ladderLength(String beginWord, String endWord, List<String> wordList){
		Set<String> reached = new HashSet<>();
		Set<String> wordDict = new HashSet<>(wordList);

		if(!wordDict.contains(endWord)){
			return 0;
		}
		reached.add(beginWord);

		int distance = 1;

		while(!reached.contains(endWord)){
			Set<String> toAdd = new HashSet<>();
			for(String each : reached){
				for(int i = 0; i < each.length(); i++){
					char[] chars = each.toCharArray();
					for(char ch = 'a'; ch <= 'z'; ch++){
						chars[i] = ch;
						String word = new String(chars);
						if(wordDict.contains(word)){
							toAdd.add(word);
							wordDict.remove(word);
						}
					}
				}
			}
			distance++;
			if(toAdd.size() == 0){
				return 0;
			}
			reached = toAdd;
		}
		return distance;
	}	
}