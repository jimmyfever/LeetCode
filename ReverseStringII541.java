
public class ReverseStringII541 {
	
	

	public static void main(String[] args){
		
	}	
	public String reverse(String s, int k){
		char[] chars = s.toCharArray();

		for(int left = 0; left<chars.length; left += 2*k){
			for(int i = left, j = Math.min(left+k-1, chars.length-1);i<j; i++, j--){
				char tmp = chars[i];
				chars[i] = chars[j];
				chars[j] = tmp;
			}
		}
		return new String(chars);
	}
}