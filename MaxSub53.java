import java.lang.Math;

public class MaxSub53 {
	
	// Constructor
	public MaxSub53(){
		
	}

	public static void main(String[] args){
		MaxSub53 maxSub = new MaxSub53();
		int[] nums = {2,-1,-3,-4,-1,-2,-1,-5,-4};
		System.out.println(maxSub.maxSub(nums));
	}
	public int maxSub(int[] nums){
		int sum = 0, max = Integer.MIN_VALUE;
		for(int i = 0; i<nums.length; i++){
			if(sum<0){
				sum = 0;
			}
			sum += nums[i];
			max = Math.max(max, sum);
		}
		return max;
	}
}