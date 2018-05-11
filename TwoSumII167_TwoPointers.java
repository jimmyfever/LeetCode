import java.util.Arrays;

public class TwoSumII167_TwoPointers {
	
	

	public static void main(String[] args){
		int[] nums = {2,5,8,9,17};
		int target = 15;
		System.out.println(Arrays.toString(twoSum(nums,target)));
	}	
	public static int[] twoSum(int[] nums, int target){
		int[] idx = new int[2];
		if(nums==null || nums.length<2){
			return idx;
		}
		int lo=0, hi=nums.length-1;
		while(lo<hi){
			int tmp = nums[lo]+nums[hi];
			if(tmp==target){
				idx[0] = lo+1;
				idx[1] = hi+1;
				break;
			}else if(tmp>target){
				hi--;
			}else{
				lo++;
			}
		}
		return idx;
	}
}