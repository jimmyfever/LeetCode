
public class FindMinInRotatedSortedArray153 {
	
	

	public static void main(String[] args){
		
	}
	public int findMin(int[] nums){
		int start = 0, end = nums.length - 1;
		while(start + 1 < end){
			int mid = start + (end - start) / 2;
			if(nums[mid] >= nums[end]){
				start = mid;
			}else{
				end = mid;
			}
		}
		if(nums[start] < nums[end]){
			return nums[start];
		}else {
			return nums[end];
		}
	}	
}