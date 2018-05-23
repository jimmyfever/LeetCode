
public class MinCostClimbStairs746 {
	
	

	public static void main(String[] args){
		
	}
	public int minCost(int[] cost){
		int n = cost.length;
		int[] mc = new int[n];
		mc[0] = cost[0];
		mc[1] = cost[1];
		for(int i=2; i<n; i++){
			mc[i] = cost[i] + Math.min(mc[i-1], mc[i-2]);
		}
		return Math.min(mc[n-2], mc[n-1]);
	}	
}