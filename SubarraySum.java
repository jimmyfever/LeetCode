import java.util.ArrayList;
import java.util.HashMap;

public class SubarraySum {
	
	

	public static void main(String[] args){
		
	}
	public ArrayList<Integer> subarraySum(int[] nums){
		int len = nums.length;

		ArrayList<Integer> res = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();

		map.put(0, -1);

		int sum = 0;
		for(int i = 0; i < len; i++){
			sum += nums[i];

			if(map.containsKey(sum)){
				res.add(map.get(sum) + 1);
				res.add(i);
				return res;
			}
			map.put(sum, i);
		}
		return res;
	}	
}