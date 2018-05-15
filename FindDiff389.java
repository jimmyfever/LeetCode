
public class FindDiff389 {
	
	

	public static void main(String[] args){
		String s = "abcd";
		String t = "qabcd";
		System.out.println(findDiff(s,t));
	}	
	public static char findDiff(String s, String t){
		int len = t.length();	// initalize from last letter of t
		char c = t.charAt(len-1);
		for(int i=0; i<len-1; i++){
			c ^= s.charAt(i) ^ t.charAt(i);
		}
		return c;

	}
}