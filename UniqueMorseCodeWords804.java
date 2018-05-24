import java.util.HashSet;

public class UniqueMorseCodeWords804 {
	
	

	public static void main(String[] args){
		
	}	
	public int uniqueMorse(String[] words){
		String[] d = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> set = new HashSet<String>();
        for(String word:words){
        	String code = "";
        	for(char c:word.toCharArray()) code += d[c - 'a'];
        	set.add(code);
        }
        return set.size();
	}
}