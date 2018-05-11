import java.util.HashMap;
import java.util.Arrays;


public class TwoSum1 {
	private int[] nums;
	private int target;

	public static void main(String[] args){
		int[] nums = {2,7,9,16};
		int target = 11;
		System.out.println(Arrays.toString(twoSum1(nums,target)));
	}
	
	public static int[] twoSum1(int[] nums, int target) {
	HashMap<Integer, Integer> map = new HashMap<>();
	for (int i =0; i<nums.length; i++){
		int diff = target - nums[i];
		if(map.containsKey(diff) && map.get(diff) != i){
			return new int[] {i, map.get(diff)};
		}
		map.put(nums[i],i);
	}
	throw new IllegalArgumentException("No two sum solution.");
}
}