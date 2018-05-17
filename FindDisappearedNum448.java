import java.util.List;
import java.util.ArrayList;

public class FindDisappearedNum448 {
	
	

	public static void main(String[] args){
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNum(nums));
	}

	public static List<Integer> findDisappearedNum(int[] nums){
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<nums.length; i++){
			/*int val = Math.abs(nums[i]) - 1;	//index
			if(nums[val]>0) nums[val] = -nums[val];
			*/
			if(nums[i]>0) nums[i] = -nums[i];
		}
		for(int i=0; i<nums.length; i++){
			if(nums[i]>0){
				list.add(i+1);
			}
		}
		return list;
	}	
}