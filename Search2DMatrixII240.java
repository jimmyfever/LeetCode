
public class Search2DMatrixII240 {
	
	

	public static void main(String[] args){
		
	}
	public boolean searchMatrix(int[][] matrix, int target){
		if(matrix == null || matrix.length < 1 || matrix[0].length < 1){
			return false;
		}

		// from right upper to left lower
		int col = matrix[0].length - 1;
		int row = 0;
		while(col >= 0 && row <= matrix.length - 1){
			if(matrix[row][col] == target){
				return true;
			}else if(matrix[row][col] < target){
				row++;
			}else if(matrix[row][col] > target){
				col--;
			}
		}
		return false;

	}	
}