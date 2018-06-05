import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class CombinationSumII40 {
	
	

	public static void main(String[] args){
		
	}
	public List<List<Integer>> combinationSum2(int[] nums, int target){
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		dfs(list, new ArrayList<>(), nums, target, 0);
		return list;
	}	
	private void dfs(List<List<Integer>> list, List<Integer> temp, int[] nums, int remain, int pos){
		if(remain < 0){
			return;
		}else if(remain == 0){
			list.add(new ArrayList<>(temp));
		}else{
			for(int i = pos; i < nums.length; i++){
				if(i > pos && nums[i] == nums[i - 1]){	// skip duplicates
					continue;
				}
				temp.add(nums[i]);
				dfs(list, temp, nums, remain - nums[i], i + 1);
				temp.remove(temp.size() - 1);
			}
		}
	}
}