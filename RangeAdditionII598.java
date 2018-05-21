
public class RangeAdditionII598 {
	
	

	public static void main(String[] args){
		
	}

	public int maxCount(int m, int n, int[][] ops){
		if(ops == null || ops.length == 0) return m*n;
		int minRow = ops[0][0];
		int minCol = ops[0][1];
		for(int i=1; i<ops.length; i++){
			minRow = Math.min(ops[i][0], minRow);
			minCol = Math.min(ops[i][1], minCol);
		}
		return minRow*minCol;
	}	
}