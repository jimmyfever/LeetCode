
public class DetectCapital520 {
	
	

	public static void main(String[] args){
		
	}	
	public boolean detectCapital(String word){
		return word.matches("[A-Z][a-z]* | [A-Z]* | [a-z]*");
	}

	public boolean detectCapital2(String word){
		int count = 0;
		for(char c:word.toCharArray()){
			if('Z' - c >=0) count++;
		}
		return ((count==0 || count==word.length()) || (count==1 && 'Z' - word.charAt(0)>=0));
	}
}