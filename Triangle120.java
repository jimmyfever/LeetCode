import java.util.List;

public class Triangle120 {
	
	

	public static void main(String[] args){
		
	}
	// DP， bottom to top
	public int minTotal(List<List<Integer>> triangle){
		int[] res = new int[triangle.size() + 1];
		for(int i = triangle.size() - 1; i >= 0; i--){
			for(int j = 0; j < triangle.get(i).size(); j++){
				res[j] = Math.min(res[j], res[j+1]+triangle.get(i).get(j));
			}
		}
		return res[0];
	}
}