import java.util.HashMap;
import java.util.Arrays;

public class TwoSumII167_HashMap {
	
	

	public static void main(String[] args){
		int[] nums = {2,5,9,17};
		int target = 11;
		System.out.println(Arrays.toString(twoSumII(nums,target)));
	}	
	public static int[] twoSumII(int[] nums, int target){
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<nums.length; i++){
			int diff = target - nums[i];
			if(map.containsKey(diff) && map.get(diff) != i){
				int idx1 = i+1;
				int idx2 = map.get(diff)+1;
				if(idx1<idx2){
				return new int[] {idx1, idx2};
			}else {
				return new int[] {idx2, idx1};
			}
			}
			map.put(nums[i],i);
		}
		return null;
	}
}