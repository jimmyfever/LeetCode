import java.util.Arrays;

public class ArrayPartitionI561 {
	
	

	public static void main(String[] args){
		
	}

	public int partition(int[] nums){
		Arrays.sort(nums);
		int result = 0;
		for(int i=0; i<nums.length; i += 2){
			result += nums[i];
		}
		return result;
	}	
}