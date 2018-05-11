
public class TitleToNum171 {
	
	

	public static void main(String[] args){
		String s = "ABC";
		System.out.println(titleToNum(s));
	}

	public static int titleToNum(String s){
		int rst = 0;
		for(int i = 0; i<s.length(); i++){
			rst = rst*26 + (s.charAt(i) - 'A' +1);
		}
		return rst;
	}	
}