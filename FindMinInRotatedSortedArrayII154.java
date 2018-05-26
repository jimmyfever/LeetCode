
public class FindMinInRotatedSortedArrayII154 {
	
	

	public static void main(String[] args){
		
	}	
	public int findMin(int[] nums){
		int start = 0, end = nums.length - 1;

		while(start + 1 < end){
			int mid = start + (end - start) / 2;
			if(nums[mid] > nums[end]){
				start = mid;
			}else if(nums[mid] < nums[end]){
				end = mid;
			}else{
				end--;
			}
		}
		return nums[start];
	}
}