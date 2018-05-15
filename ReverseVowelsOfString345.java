
public class ReverseVowelsOfString345 {
	
	

	public static void main(String[] args){
		String s = "laetcode";
		System.out.println(reverse(s));
	}	
	public static String reverse(String s){
		if(s == null || s.length() == 0) return s;
		String vowels = "aeiouAEIOU";
		char[] chars = s.toCharArray();
		int lo = 0, hi = s.length() - 1;
		while(lo<hi){
			while(lo<hi && !vowels.contains(chars[lo]+"")){ // +"" convert char to string
				lo++;
			}
			while(lo<hi && !vowels.contains(chars[hi]+"")){
				hi--;
			}
			char tmp = chars[lo];
			chars[lo] = chars[hi];
			chars[hi] = tmp;

			lo++;
			hi--;
		}
		return new String(chars);
	}
}