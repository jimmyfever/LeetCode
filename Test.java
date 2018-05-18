import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;



public class  Test{
	
	// Constructor
	public Test(){
		
	}

	public static void main(String[] args){

		int[] a = {5,1,3,2,4};
		System.out.println(Arrays.toString(findRelativeRanks(a)));
	}
	public static String[] findRelativeRanks(int[] nums) {
        String[] result = new String[nums.length];
        int[] tmp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(tmp);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = tmp.length-1; i >=0; i--) {
            // score -> ranking
            map.put(tmp[i], tmp.length-i);
        }
        System.out.println(map);


        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == 1) {
                result[i] = "Gold Medal";
            } else if (map.get(nums[i]) == 2) {
                result[i] = "Silver Medal";
            } else if (map.get(nums[i]) == 3) {
                result[i] = "Bronze Medal";
            } else {
                result[i] = String.format("%s", map.get(nums[i]));
            }
        }
        return result;
    }
}