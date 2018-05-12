
public class HouseRob198 {
	
	

	public static void main(String[] args){
		int[] nums = {2,1,1,1,2};
		System.out.println(rob(nums));
		System.out.println(rob1(nums));
	}
	public static int rob(int[] nums){
		//DP
		if(nums.length==0){
			return 0;
		}
		if(nums.length==1){
			return nums[0];
		}
		int last = 0;
		int now = 0;
		for(int i=0; i<nums.length; i++){
			int lastLast = last;
			last = now;
			now = Math.max(now, nums[i]+lastLast);
		}
		return now;
	}	
	public static int rob1(int[] nums){
		int a = 0;
		int b = 0;
		for(int i=0; i<nums.length; i++){
			if(i%2==0){
				a = Math.max(a + nums[i], b);
			}else{
				b = Math.max(a, b+nums[i]);
			}

		}
		return Math.max(a,b);
	}
}