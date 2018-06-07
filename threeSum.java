import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class threeSum {
	
	

	public static void main(String[] args){
		
	}
	public List<List<Integer>> threeSum(int[] nums){
		List<List<Integer>> res = new ArrayList<>();

		if(nums == null || nums.length < 3){
			return res;
		}

		Arrays.sort(nums);

		for(int i = 0; i < nums.length - 2; i++){
			if(i > 0 && nums[i] == nums[i - 1]){
				continue;
			}
			int left = i + 1, right = nums.length - 1;
			int target = -nums[i];

			twoSum(nums, left, right, target, res);
		}
		return res;
	}
	private void twoSum(int[] nums, int left, int right, int target, List<List<Integer>> res){
		while(left < right){
			if(nums[left] + nums[right] == target){
				ArrayList<Integer> triple = new ArrayList<>();
				triple.add(-target);
				triple.add(nums[left]);
				triple.add(nums[right]);
				res.add(triple);

				left++;
				right--;

				while(left < right && nums[left] == nums[left - 1]){
					left++;
				}
				while(left < right && nums[right] == nums[right + 1]){
					right--;
				}
			}else if(nums[left] + nums[right] < target){
				left++;
			}else{
				right--;
			}
		}
	}	
}