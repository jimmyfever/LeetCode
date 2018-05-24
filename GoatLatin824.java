import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class GoatLatin824 {
	
	

	public static void main(String[] args){
		
	}
	public String toGoatLatin(String s){
		List<Character> vowel = new ArrayList<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
		String[] words =s.split(" ");
		String Adda = "a", word="";
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<words.length; i++){
			word = words[i];
			if(vowel.contains(word.charAt(0))){
				sb.append(word+"ma");
			}else{
				sb.append(word.substring(1)+word.charAt(0)+"ma");
			}
			sb.append(Adda);
			Adda += "a";
			sb.append(" ");
		}
		return sb.toString().trim();
	}	
}