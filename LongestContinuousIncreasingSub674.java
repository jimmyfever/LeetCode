
public class LongestContinuousIncreasingSub674 {
	
	

	public static void main(String[] args){
		
	}	
	public int findLength(int[] nums){
		int res = 0, count = 0;
		for(int i = 0; i < nums.length; i++){
			if(i==0 || nums[i-1]<nums[i]) res = Math.max(res, count++);
			else count = 1;
		}
		return res;
	}
}