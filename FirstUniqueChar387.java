import java.util.Map;
import java.util.HashMap;

public class FirstUniqueChar387 {
	
	

	public static void main(String[] args){
		
	}
	public int firstUniqChar(String s){
		Map<Character, Integer> map = new HashMap<>();
		for(char c:s.toCharArray()){
			map.put(c, map.getOrDefault(c,0)+1);	//getOrDefault(Object key, V defaultValue).  Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.

		}
		for(int i=0; i<s.length();i++){
			if(map.get(s.charAt(i)) == 1){
				return i;
			}
		}
		return -1;
	}	
}