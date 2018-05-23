import java.util.Map;
import java.util.HashMap;

public class DegreeOfArray697 {
	
	

	public static void main(String[] args){
		
	}	
	public int findDegree(int[] nums){
		if(nums.length == 0 || nums == null) return 0;
		Map<Integer, int[]> map = new HashMap<>();
		for(int i=0; i<nums.length; i++){
			if(!map.containsKey(nums[i])){
				map.put(nums[i], new int[]{1, i, i});
			}else{
				int[] tmp = map.get(nums[i]);
				tmp[0]++;
				tmp[2] = i;
			}
		}
		int degree = Integer.MIN_VALUE, res = Integer.MAX_VALUE;
		for(int[] value: map.values()){
			if(value[0] > degree){
				degree = value[0];
				res = value[2] - value[1] + 1;
			}else if(value[0] == degree){
				res = Math.min(value[2] - value[1] + 1, res);
			}
		}
		return res;
	}
}