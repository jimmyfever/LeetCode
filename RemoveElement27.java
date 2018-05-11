
public class RemoveElement27 {
	
	// Constructor
	public RemoveElement27(){
		
	}

	public static void main(String[] args){
		int[] nums = {0,1,2,2,3,0,4,2};
		int val = 2; 
		RemoveElement27 re = new RemoveElement27();
		System.out.println(re.remove(nums, val));
	}

	public int remove(int[] nums, int val){
		int c = 0;
		for (int i = 0; i<nums.length; i++){
			if(nums[i] != val){
				nums[c] = nums[i];
				c++;
			}
		}
		return c;
	}
}