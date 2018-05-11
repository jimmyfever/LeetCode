import java.util.Arrays;

public class RotateArray189 {
	
	

	public static void main(String[] args){
		int[] nums = {1,2,3,4,5,6,7};
		int k = 9;
		System.out.println(Arrays.toString(rotate(nums, k)));
	}

	public static void reverse(int[] nums, int start, int end){
		while(start<end){
			int tmp = nums[start];
			nums[start] = nums[end];
			nums[end] = tmp;
			start++;
			end--;
		}
	}	
	public static int[] rotate(int[] nums, int k){
		if(nums.length == 0){
			return nums;
		}
		k = k % nums.length;
		reverse(nums, 0, nums.length - k - 1);
		reverse(nums, nums.length - k, nums.length - 1);
		reverse(nums, 0, nums.length - 1);
		return nums;
	}
}