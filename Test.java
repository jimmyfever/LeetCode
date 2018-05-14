


public class  Test{
	
	// Constructor
	public Test(){
		
	}

	public static void main(String[] args){
		int[] a = new int[26];
		String s = "anagram";
		for(int i=0; i<s.length();i++){
		System.out.println(a[s.charAt(i)-'a']++);
	}
	}
	
}