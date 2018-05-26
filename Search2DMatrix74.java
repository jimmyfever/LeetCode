
public class Search2DMatrix74 {
	
	

	public static void main(String[] args){
		
	}
	public boolean searchMatrix(int[][] matrix, int target){
		if(matrix == null || matrix.length == 0){
			return false;
		}

		if(matrix[0] == null || matrix[0].length == 0){
			return false;
		}

		int rowNum = matrix.length;
		int colNum = matrix[0].length;

		int start = 0, end = rowNum * colNum - 1;

		while(start + 1 <= end){		// <=
			int mid = start + (end - start) / 2;
			int row = mid / colNum;
			int col = mid % colNum;
			if(matrix[row][col] == target){
				return true;
			}else if(matrix[row][col] < target){
				start = mid;
			}else{
				end = mid;
			}
		}

		return false;

	}	
}