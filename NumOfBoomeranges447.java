import java.util.Map;
import java.util.HashMap;

public class NumOfBoomeranges447 {
	
	

	public static void main(String[] args){
		int[][] points = {{0,0},{1,0},{2,0},{4,0}};
		System.out.println(numOfBoomeranges(points));
	}
	private static int getDistance(int[] a, int[] b){
		int dx = a[0]-b[0];
		int dy = a[1]-b[1];
		return dx * dx + dy * dy;
	}	
	public static int numOfBoomeranges(int[][] points){
		if(points == null) return 0;

		int ans = 0;
		for(int i=0; i<points.length; i++){
			Map<Integer, Integer> disCount = new HashMap<>();
			for(int j=0; j<points.length; j++){
				if(i == j) continue;
				int distance = getDistance(points[i],points[j]);
				int count = disCount.getOrDefault(distance, 0);
				disCount.put(distance, count+1);
			}
			for(int count:disCount.values()){
				ans += count*(count-1);
			}
		}
		return ans;
	}
}