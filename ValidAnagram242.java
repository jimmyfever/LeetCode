
public class ValidAnagram242 {
	
	

	public static void main(String[] args){
		
	}
	public boolean isAnagram(String s, String t){
		if(s.length() != t.length()){
			return false;
		}
		char[] c1 = s.toCharArray();
		char[] c2 = t.toCharArray();
		int[] alphabet = new int[26];

		for(int i=0; i<c1.length; i++){
			alphabet[c1[i] - 'a']++;
			alphabet[c2[i] - 'a']--;
		}
		for(int n : alphabet){
			if(n != 0){
				return false;
			}
		}
		return true;
	}	
}