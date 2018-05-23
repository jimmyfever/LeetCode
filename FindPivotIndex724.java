
public class FindPivotIndex724 {
	
	

	public static void main(String[] args){
		
	}
	public int pivotIndex(int[] nums){
		int total = 0, sum = 0;
		for(int num:nums) total += num;
		for(int i = 0; i<nums.length; sum += nums[i++]){
			if(total - nums[i] == sum * 2){
				return i;
			}
		}
		return -1; 
	}	
}