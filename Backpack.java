
public class Backpack {
	
	

	public static void main(String[] args){
		
	}
	public int backPack(int m, int[] A){
		boolean f[][] = new boolean[A.length + 1][m + 1];
		for(int i = 0; i <= A.length; i++){
			for(int j = 0; j <= m; j++){
				f[i][j] = false;
			}
		}
		f[0][0] = true;
		for(int i = 0; i < A.length; i++){
			for(int j = 0; j <= m; j++){
				f[i + 1][j] = f[i][j];
				if(j >= A[i] && f[i][j - A[i]]){
					f[i + 1][j] = true;
				}
			}
		}
		for(int i = m; i >= 0; i--){
			if(f[A.length][i]){
				return i;
			}
		}
		return 0;
	}	
}