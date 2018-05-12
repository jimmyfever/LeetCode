import java.util.HashSet;

public class ContainsDuplicateII219 {
	
	

	public static void main(String[] args){
		int[] nums = {1,2,3,1,4};
		int k = 2;
		System.out.println(containsDuplicate(nums, k));
	}
	public static boolean containsDuplicate(int[] nums, int k){
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i<nums.length; i++){
			if(i>k){
				set.remove(nums[i-k-1]); // remove element whose distance to i is bigger than k
			}
			if(set.contains(nums[i])){
				return true;
			}
			set.add(nums[i]);
		}
		return false;
	}	
}