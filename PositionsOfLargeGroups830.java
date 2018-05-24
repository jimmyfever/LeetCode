import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class PositionsOfLargeGroups830 {
	
	

	public static void main(String[] args){
		
	}

	public List<List<Integer>> largeGroup(String s){
		int left = 0, right = 0, n = s.length();
		List<List<Integer>> res = new ArrayList<>();

		while(right<n){
			while(right<n && s.charAt(right) == s.charAt(left)){
				right++;
				if(right - left>3){
					res.add(Arrays.asList(left, right-1));
					left = right;
				}
			}
		}
		return res;
	}	
}