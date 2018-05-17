
public class MaxConsecutiveOnes485 {
	
	

	public static void main(String[] args){
		
	}	
	public int maxConsecutiveOnes(int[] nums){
		int count = 0, max = 0;
		for(int i=0; i<nums.length; i++){
			if(nums[i]==1){
			count++;
			max = Math.max(max, count);
		}else{
			count = 0;
		}
		}
		return max;
	}
}