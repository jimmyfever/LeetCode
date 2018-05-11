
public class RemoveDuplicates26 {
	
	// Constructor
	public RemoveDuplicates26(){
		
	}

	public static void main(String[] args){
		int[] nums = {0,1};
		RemoveDuplicates26 rem = new RemoveDuplicates26();
		System.out.println("result:" + rem.removeDuplicates(nums));
	}
	
	public int removeDuplicates(int[] nums){
		if(nums.length<2) return nums.length;
		int j = 1;
		for(int i = 1; i<nums.length; i++){
			if(nums[i]!=nums[i-1]) {
				nums[j]=nums[i];
				j++;
			}
		}
		return j;
	}
}