import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class KeyboardRow500 {
	
	

	public static void main(String[] args){
		
	}

	public String[] findWords(String[] words){
		String[] str = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<str.length; i++){
			for(char c:str[i].toCharArray()){
				map.put(c,i);
			}
		}
		List<String> list = new ArrayList<>();
		for(String w:words){
			if(w.equals("")) continue;
			int index = map.get(w.toUpperCase().charAt(0));
			for(char c:w.toUpperCase().toCharArray()){
				if(map.get(c) != index){
					index = -1;
					break;
				}
			}
			if(index != -1) list.add(w);
		}
		return list.toArray(new String[0]);
	}

	public String[] findwords2(String[] words){
		return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]* | [asdfghjkl]* | [zxcvbnm]*")).toArray(String[]::new);
	}	
}