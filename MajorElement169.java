
public class MajorElement169 {
	
	

	public static void main(String[] args){
		
	}	
	public static int major(int[] nums){
		int major = nums[0], count = 1;
		for(int i = 1; i<nums.length; i++){
			if(major==nums[i]){
				count++;
			}else {
				if(count==0){
				major=nums[i];
			}else{
				count--;
			}
		}
		}
		return major;
	}
}