
public class LongestUncommonSub521 {
	
	

	public static void main(String[] args){
		
	}
	public int findLongestUncommonSub(String a, String b){
		return a.equals(b) ? -1 : Math.max(a.length(), b.length());
	}	
}