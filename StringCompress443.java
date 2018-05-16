
public class StringCompress443 {
	
	

	public static void main(String[] args){
		char[] chars = {'a','a','b','c','c','c'};
		System.out.println(compress(chars));
	}	
	public static int compress(char[] chars){
		int ans = 0, idx = 0;
		while(idx<chars.length){
			char curr = chars[idx];
			int count = 0;
			while(idx<chars.length && chars[idx] == curr){
				idx++;
				count++;
			}
			chars[ans++] = curr;
			if(count != 1){
				for(char c:Integer.toString(count).toCharArray()){
					chars[ans++] = c;
				}
			}
		}
		return ans;
	}
}