
public class MaxAvgSubarray643 {
	
	

	public static void main(String[] args){
		
	}	
	public double maxAvg(int[] nums, int k){
		long sum = 0;
		for(int i=0; i<k; i++){
			sum += nums[i];
		}
		long max = sum;

		for(int i=k; i<nums.length; i++){
			sum += nums[i] - nums[i-k];
			max = Math.max(max, sum);
		}
		return max / 1.0 / k;
	}
}