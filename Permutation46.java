import java.util.ArrayList;

public class Permutation46 {
	
	

	public static void main(String[] args){
		
	}
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if(nums == null || nums.size() == 0){
			return res;
		}

		ArrayList<Integer> list = new ArrayList<>();
		helper(res, list, nums);
		return res;
	}
	private void helper(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list, ArrayList<Integer> nums){
		if(list.size() == nums.size()){
			res.add(new ArrayList<Integer>(list));
			return;
		}
		for(Integer n : nums){
			if(!list.contains(n)){
				list.add(n);
				helper(res, list, nums);
				list.remove(list.size() - 1);	// recall
			}
		}
	}	
}