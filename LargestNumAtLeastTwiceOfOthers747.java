
public class LargestNumAtLeastTwiceOfOthers747 {
	
	

	public static void main(String[] args){
		
	}	
	public int findMax(int[] nums){
		if(nums==null || nums.length == 0) return -1;

		if(nums.length == 1) return 0;

		int max = Integer.MIN_VALUE + 1;
		int second = Integer.MIN_VALUE;
		int idx = 0;

		for(int i=0; i<nums.length; i++){
			if(nums[i]>max){
				second = max;
				max = nums[i];
				idx = i;
			}else if(nums[i] != max && nums[i] > second){
				second = nums[i];
			}
		}
		if(second*2 <= max) return idx;

		return -1;
	}
}