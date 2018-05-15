import java.util.HashMap;

public class WordPattern290 {
	
	

	public static void main(String[] args){
		
	}	

	public static boolean wordPattern(String pattern, String str){
		String[] words = str.split(" ");
		HashMap<Character, String> map = new HashMap<>();
		if(words.length != pattern.length()){
			return false;
		}
		for(int i=0 ; i<words.length; i++){
			char key = pattern.charAt(i);
			String word = words[i];
			if(map.containsKey(key) && !map.get(key).equals(word)){
				return false;
			}
			if(!map.containsKey(key) && map.get(key).equals(word)){
				return false;
			}
			map.put(key, word);
		}
		return true;
	}
}