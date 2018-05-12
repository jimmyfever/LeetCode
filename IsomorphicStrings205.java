
public class IsomorphicStrings205 {
	
	

	public static void main(String[] args){
		String s = "egg";
		String t = "add";
		System.out.println(isIsomorphic(s,t));
	}
	public static boolean isIsomorphic(String s, String t){
		int[] m = new int[512];
		for(int i = 0; i<s.length(); i++){
			if(m[s.charAt(i)] != m[t.charAt(i)+256]){
				return false;
			}
			m[s.charAt(i)] = i+1;		//s.charAt[i] is ascii value, like e is 101.
			m[t.charAt(i)+256] = i+1;
		}
		return true;
	}	
}