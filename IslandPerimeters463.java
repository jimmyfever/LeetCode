
public class IslandPerimeters463 {
	
	

	public static void main(String[] args){
		
	}

	public int perimeters(int[][] grid){
		int row = grid.length;
		int col = grid[0].length;
		int island = 0;
		int overlap = 0;

		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				if(grid[i][j] == 1){
					island++;
					if(i<row-1 && grid[i+1][j] == 1) overlap++;		// right overlap
					if(j<col-1 && grid[i][j+1] == 1) overlap++;		// down overlap
				}
			}
		}	
	return island*4 - overlap*2;
	}
}