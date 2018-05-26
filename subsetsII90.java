import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class subsetsII90 {
	
	

	public static void main(String[] args){
		
	}
	public List<List<Integer>> subsetsWithDup(int[] nums){
		List<List<Integer>> res = new ArrayList<List<Integer>>();

		if(nums == null){
			return null;
		}

		if(nums.length == 0){
			res.add(new ArrayList<Integer>());
			return res;
		}

		Arrays.sort(nums);

		List<Integer> subset = new ArrayList<Integer>();
		helper(nums, 0, subset, res);
		return res;
	}
	private void helper(int[] nums, int pos, List<Integer> subset, List<List<Integer>> res){
		res.add(new ArrayList<Integer>(subset));
		for(int i = pos; i < nums.length; i++){
			if( i != pos && nums[i] == nums[i-1]){
				continue;
			}
			subset.add(nums[i]);
			helper(nums, i + 1, subset, res);
			subset.remove(subset.size() - 1);
		}
	}	
}