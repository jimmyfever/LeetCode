import java.util.List;
import java.util.ArrayList;

public class LetterCasePermutation784 {
	
	

	public static void main(String[] args){
		
	}	
	public List<String> letterCase(String s){
		List<String> ans = new ArrayList<>();
		dfs(s, 0, ans);
		return ans;

	}
	private void dfs(String s, int pos, List<String> ans){
		if(pos == s.length()){
			ans.add(s);
			return;
		}
		if(s.charAt(pos)>= '0' && s.charAt(pos)<='9'){
			dfs(s, pos+1, ans);
			return;
		}

		char[] chars = s.toCharArray();
		
		chars[pos] = Character.toLowerCase(chars[pos]);
		dfs(String.valueOf(chars), pos+1, ans);

		chars[pos] = Character.toUpperCase(chars[pos]);
		dfs(String.valueOf(chars), pos+1, ans);
	}
}