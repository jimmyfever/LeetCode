
public class SingleNumIII260 {
	
	

	public static void main(String[] args){
		
	}
	public int[] singleNumIII(int[] nums){
		// get XOR of the two numbers 
		int diff = 0;
		for(int num : nums){
			diff ^= num;
		}
		// get last set bit 
		diff &= - diff;

		int[] res = {0, 0};
		for(int num : nums){
			if((num & diff) == 0){
				res[0] ^= num; 
			}else{
				res[1] ^= num;
			}
		}
		return res;
	}	
}