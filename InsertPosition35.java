
public class InsertPosition35 {
	
	// Constructor
	public InsertPosition35(){
		
	}

	public static void main(String[] args){
		int[] nums = {1,3,5,6};
		int target = 5;
		InsertPosition35 in = new InsertPosition35();
		System.out.println(in.insert(nums,target));
	}
	public int insert(int[] nums, int target){
		// find last position < target, return +1.
		if(nums.length == 0 || nums == null) return 0;

		int lo = 0;
		int hi = nums.length - 1;
		int m;

		if(target<nums[0])	return 0;

		while(lo+1<hi){
			m = lo + (hi - lo) / 2;		
			if(nums[m]==target){
				return m;	
			}
			else if(nums[m]<target){
				lo = m;
			}
			else{
				hi = m;
			}
		}
		if(nums[hi]==target){
			return hi;
		}
		if(nums[hi]<target){
			return hi+1;
		}
		if(nums[lo]==target){
			return lo+1;
		}
		return lo+1;
	}
}
	