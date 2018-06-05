import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum39 {
	
	

	public static void main(String[] args){
		
	}
	public List<List<Integer>> combinationSum(int[] nums, int target){
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		dfs(list, new ArrayList<>(), nums, target, 0);
		return list;
	}
	private void dfs(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start){
		if(remain < 0){
			return;
		}else if(remain == 0){
			list.add(new ArrayList<>(tempList));
		}else{
			for(int i = start; i < nums.length; i++){
				tempList.add(nums[i]);
				dfs(list, tempList, nums, remain - nums[i], i);	// can reuse elements
				tempList.remove(tempList.size() - 1);
			}
		}
	}	
}