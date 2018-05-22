
public class ImageSmoother661 {
	
	

	public static void main(String[] args){
		
	}	
	public int[][] imageSmoother(int[][] M){
		int nx = M.length, ny = M[0].length;
		int[][] res = new int[nx][ny];
		for(int i = 0; i<nx; i++){
			for(int j = 0; j<ny; j++){
				res[i][j] = smooth(M,i,j);
			}
		}
		return res;
	}
	private int smooth(int[][] M, int x, int y){
		int nx = M.length, ny = M[0].length, sum = 0, count = 0;

		for(int i=-1; i<=1; i++){
			for(int j=-1; j<=1; j++){
				if(x+i<0 || x+i>=nx || y+j<0 || y+i>=ny){
					continue;
				}
				count++;
				sum += M[x+i][y+j];
			}
		}
		return sum / count;
	}
}