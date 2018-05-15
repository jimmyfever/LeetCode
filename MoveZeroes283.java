import java.util.Arrays;


public class MoveZeroes283 {
	
	

	public static void main(String[] args){
		int[] nums = {1,0,2,3,0,4,0,5,0};
		moveZeroes(nums);
	}
	public static void moveZeroes(int[] nums){
		int left = 0;
		for(int right = 0; right<nums.length; right++){
			if(nums[right] != 0){	// when right != 0, both left and right move forward, so no number moves
				int tmp = nums[right];
				nums[right] = nums[left];
				nums[left] = tmp;
				left++;				//when right == 0, only right move forward.
			}
		}
		System.out.println(Arrays.toString(nums));
	}	
}