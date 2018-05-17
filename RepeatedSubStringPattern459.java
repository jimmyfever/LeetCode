
public class RepeatedSubStringPattern459 {
	
	

	public static void main(String[] args){
		
	}
	public boolean repeated(String s){
		/* 1.The length of the repeating substring must be a divisor of the length of the input string
		   2.Search for all possible divisor of str.length, starting for length/2
		   3.If i is a divisor of length, repeat the substring from 0 to i the number of times i is contained in s.length
		   4.If the repeated substring is equals to the input str return true
		*/
		int len = s.length();
		for(int subl = len/2; subl>=1; subl--){
			if(len%subl==0){
				int n = len/subl;
				String sub = s.substring(0,subl);
				StringBuilder sb = new StringBuilder();
				for(int i=0; i<n; i++){
					sb.append(sub);
				}
				if(sb.toString().equals(s)) return true;
			}
		}
		return false;
	}	
}