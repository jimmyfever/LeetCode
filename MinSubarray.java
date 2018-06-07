import java.util.ArrayList;

public class MinSubarray {
	
	

	public static void main(String[] args){
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(-1);
		nums.add(-1);
		nums.add(-2);
		nums.add(1);
		System.out.println(minSubarray(nums));
	}	
	public static int minSubarray(ArrayList<Integer> nums){
		if(nums == null || nums.isEmpty()){
			return -1;
		}
		int sum = 0, maxSum = 0, minSub = Integer.MAX_VALUE;
		for(int num : nums){
			maxSum = Math.max(maxSum, sum);
			sum += num;
			minSub = Math.min(minSub, sum - maxSum);
		}
		return minSub;
	}
}