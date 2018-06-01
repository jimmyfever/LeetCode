import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class WordBreak139 {
	
	

	public static void main(String[] args){
		
	}
	public boolean wordBreak(String s, List<String> wordDict){
		boolean[] dp = new boolean[s.length() + 1];
		Set<String> set = new HashSet<>();
		set.addAll(wordDict);

		dp[0] = true;
		for(int i = 1; 1 <= s.length(); i++){
			for(int j = i - 1; j >= 0; j--){
				dp[i] = dp[j] && set.contains(s.substring(j,1));
				if(dp[i]) break;
			}
		}
		return dp[s.length()];
	}	
}