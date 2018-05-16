
public class ConvertNumToHex405 {
	
	

	public static void main(String[] args){
		int n = 16;
		System.out.println(toHex(n));
	}

	public static String toHex(int n){
		char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

		if(n == 0) return "0";
		String res = "";
		while(n != 0){
			res = map[(n&15)] + res;
			n = n>>>4;
		}
		return res;
	}	
}