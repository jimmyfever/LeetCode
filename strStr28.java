
public class strStr28 {
	
	// Constructor
	public strStr28(){
		
	}

	public static void main(String[] args){
		String s1 = "aaaaa";
		String s2 = "aaaaaa";

		strStr28 str = new strStr28();
		System.out.println(str.strStr(s1,s2));
	}

	public int strStr(String s1, String s2){
		int l1 = s1.length();
		int l2 = s2.length();

		if (l1<l2)	{
			return -1;
		}
		else if (l2 == 0) {
			return 0;
		}

		for(int i = 0; i < l1-l2; i++){
			if (s1.substring(i,i+l2).equals(s2)){
				return i;
			}
		}
		return -1;
	}
	
}