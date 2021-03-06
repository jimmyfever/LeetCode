
public class MaxSubarrayDiff {
	
	

	public static void main(String[] args){
		
	}
	public int maxDiff(int[] nums){
		int size = nums.length;
		int[] left_max = new int[size];
		int[] left_min = new int[size];
		int[] right_max = new int[size];
		int[] right_min = new int[size];
		int[] copy = new int[size];

		for(int i = 0; i < size; i++){
			copy[i] = -1 * nums[i];
		}

		int max = Integer.MIN_VALUE;
		int sum = 0;
		int minSum = 0;

		for(int i = 0; i < size; i++){
			sum += nums[i];
			max = Math.max(max, sum - minSum);
			minSum = Math.min(sum, minSum);
			left_max[i] = max;
		}
		max = Integer.MIN_VALUE;
		sum = 0;
		minSum = 0;
		for(int i = size - 1; i >= 0; i--){
			sum += nums[i];
			max = Math.max(max, sum - minSum);
			minSum = Math.min(sum, minSum);
			right_max[i] = max;
		}
		max = Integer.MIN_VALUE;
		sum = 0;
		minSum = 0;
		for(int i = 0; i < size; i++){
			sum += copy[i];
			max = Math.max(max, sum - minSum);
			minSum = Math.min(sum, minSum);
			left_min[i] = -1 * max;
		}
		max = Integer.MIN_VALUE;
		sum = 0;
		minSum = 0;
		for(int i = size - 1; i >= 0; i--){
			sum += copy[i];
			max = Math.max(max, sum - minSum);
			minSum = Math.min(sum, minSum);
			right_min[i] = -1 * max;
		}
		int diff = 0;
		for(int i = 0; i < size - 1; i++){
			diff = Math.max(diff, Math.abs(left_max[i] - right_min[i + 1]));
			diff = Math.max(diff, Math.abs(left_min[i] - right_max[i + 1]));
		} 
		return diff;
	}	
}