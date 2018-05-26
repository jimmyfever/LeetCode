
public class FindPeakElement162 {
	
	

	public static void main(String[] args){
		
	}	
	public int findPeak(int[] nums){
		// has duplicates, use for loop (o(n))
		int start = 1, end = nums.length - 2;
		while(start + 1 < end){
			int mid = start + (end - start) / 2;
			if(nums[mid] < nums[mid - 1]){
				end = mid;
			}else if(nums[mid] < nums[mid + 1]){
				start = mid;
			}else{
				end = mid;
			}
		}
		if(nums[start] < nums[end]){
			return end;
		}else{
			return start;
		}

	}
}