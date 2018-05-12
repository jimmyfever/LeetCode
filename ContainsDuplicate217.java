import java.util.HashSet;

public class ContainsDuplicate217 {
	
	

	public static void main(String[] args){
		int[] nums = {1,2,3,4};
		System.out.println(containsDuplicate(nums)); 
	}	
	public static boolean containsDuplicate(int[] nums){
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i<nums.length; i++){
			if(set.contains(nums[i])){
				return true;
			}
			set.add(nums[i]);
		}
		return false;
	}
}