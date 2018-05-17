
public class MinMoves453 {
	
	

	public static void main(String[] args){
		
	}

	public int minMoves(int[] nums){
		// sum + m*(n-1) = x*n;  x=minNum + m;   → sum - minNum*n = m
		int sum = 0;
		int minNum = Integer.MAX_VALUE;
		for(int n : nums){
			sum += n;
			minNum = Math.min(minNum, n);
		}
		return sum - minNum * nums.length;
	}	
}