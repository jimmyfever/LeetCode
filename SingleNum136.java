
public class SingleNum136 {
	
	

	public static void main(String[] args){
		int[] nums = {1,2,1,2,4};
		System.out.println(singleNum(nums));

	}
	public static int singleNum(int[] nums){
		int result = 0;
		for(int i=0; i<nums.length; i++){
			result ^= nums[i];
		}
		return result;
	}	
}