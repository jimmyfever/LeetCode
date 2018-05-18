import java.util.Map;
import java.util.HashMap;

public class KdiffInArray532 {
	
	

	public static void main(String[] args){
		int[] nums = {3,1,4,1,5};
		int k = 1;
		System.out.println(findPairs(nums, k));
	}
	public static int findPairs(int[] nums, int k){
		if(nums==null || nums.length==0 || k<0) return 0;

		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for(int i:nums){
			map.put(i, map.getOrDefault(i,0)+1);
		}
		System.out.println(map);
		System.out.println(map.entrySet());

		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			if(k==0){
				if(entry.getValue()>=2){
					count++;
				}
			}else{
				if(map.containsKey(entry.getKey()+k)){
					count++;
				}
			}
		}
		return count;
	}	
}