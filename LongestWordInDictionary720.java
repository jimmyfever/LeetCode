import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class LongestWordInDictionary720 {
	
	

	public static void main(String[] args){
		
	}	
	public String longestWord(String[] words){
		Arrays.sort(words);
		Set<String> set = new HashSet<>();
		String res = "";
		for(String word:words){
			if(word.length()==1 || set.contains(word.substring(0, word.length()-1))){
				set.add(word);
				if(word.length()>res.length()){
					res = word;
				}
			}
		}
		return res;
	}
}