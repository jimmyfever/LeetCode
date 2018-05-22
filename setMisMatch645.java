
public class setMisMatch645 {
	
	

	public static void main(String[] args){
		
	}	
	public int[] findErrorNums(int[] nums){
		int[] res = new int[2];

		for(int i=0; i<nums.length; i++){
			int idx = Math.abs(nums[i]-1);
			if(nums[idx]>0) nums[idx] = - nums[idx];
			else res[0] = idx+1;
		}

		for(int i=0; i<nums.length; i++){
			if(nums[i]<0) nums[i] = -nums[i];
			else res[1] = i+1;
		}
		return res;
	}
}