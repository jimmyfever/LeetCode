
public class MissingNum268 {
	
	

	public static void main(String[] args){
		int[] nums = {1,2,0};
		System.out.println(missingNum(nums));
	}

	public static int missingNum(int[] nums){
		
		// XOR
		int result = 0;	//if nums.length = 10，then n = 10; no missing numbers would be 11 numbers. 
		for(int i=0; i<nums.length; i++){
			result = result ^ (i+1) ^ nums[i]; // a^b^b = a;  if (i+1)=nums[i], (i+1) ^ nums[i] = 0
		}
		return result;
	}	

	public static int missingNum1(int[] nums){
		int sum = (0 + nums.length)*(nums.length+1)/2;
		for(int i = 0; i< nums.length; i++){
			sum -= nums[i];
		}
		return sum;
	}

}