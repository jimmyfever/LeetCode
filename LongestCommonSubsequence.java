
public class LongestCommonSubsequence {
	
	

	public static void main(String[] args){
		
	}	
	public int longestCommonSequence(String A, String B){
		int n = A.length();
		int m = B.length();
		int f[][] = new int[n + 2][m + 2];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				f[i + 1][j + 1] = Math.max(f[i][j + 1], f[i + 1][j]);
				if(A.charAt(i) == B.charAt(j)){
					f[i + 1][j + 1] = f[i][j] + 1;
				}
			}
		}
		return f[n][m];
	}
}