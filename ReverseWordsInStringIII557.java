
public class ReverseWordsInStringIII557 {
	
	

	public static void main(String[] args){
		
	}	

	public String reverse(String s){
		String[] str = s.split(" ");

		for(int i=0; i<str.length; i++){
			str[i] = new StringBuilder(str[i]).reverse().toString();
		}
		StringBuilder result = new StringBuilder();
		for(String st: str){
			result.append(st + " ");
		}
		return result.toString().trim();
	}
}