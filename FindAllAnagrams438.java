import java.util.List;
import java.util.ArrayList;

public class FindAllAnagrams438 {
	
	

	public static void main(String[] args){
		String s = "apbb";
		String p = "bb";
		System.out.println(findAnagrams(s,p));
	}	
	public static List<Integer> findAnagrams(String s, String p){
		List<Integer> list = new ArrayList<>();
		if(s == null || s.length() == 0 || p == null || p.length()  == 0){
			return list;
		}
		int[] hashp = new int[256];
		for(char c:p.toCharArray()){
			hashp[c]++;
		}

		int start = 0, end = 0, count = p.length();
		while(end<s.length()){
			if(end-start == p.length() && hashp[s.charAt(start++)]++ >=0){
				count++;
			}
			if(hashp[s.charAt(end++)]-- >= 1) count--;
			if(count == 0) list.add(start);

		}
		return list;
	}
}