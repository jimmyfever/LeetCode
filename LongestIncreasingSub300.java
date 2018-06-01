import java.util.Arrays;

public class LongestIncreasingSub300 {
	
	

	public static void main(String[] args){
		int[] nums = {10,9,2,5,3,7,101,18};
		System.out.println(lengthOfLIS(nums));
	}	
	public static int lengthOfLIS(int[] nums){
		int[] dp = new int[nums.length];
		int len = 0;

		for(int x : nums){
			int i = Arrays.binarySearch(dp, 0, len, x);
			if(i < 0) i = -(i + 1); // index of the search key, if it is contained in the array; otherwise, (-(insertion point) - 1). 
			dp[i] = x;
			if(i == len){
				len++;
			}
		}
		return len;
	}
}