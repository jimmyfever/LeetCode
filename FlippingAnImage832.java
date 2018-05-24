
public class FlippingAnImage832 {
	
	

	public static void main(String[] args){
		
	}
	public int[][] flip(int[][] A){
		int n = A.length;
		for(int[] row : A){
			for(int i=0; i*2<n; i++){
				if(row[i] == row[n-i-1]){
					row[i] = row[n-i-1] ^= 1;
				}
			}
		}
		return A;
	}	
}