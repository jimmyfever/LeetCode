import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class IntersectionOfTwoArraysII350 {
	
	

	public static void main(String[] args){
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		System.out.println(Arrays.toString(intersection(nums1, nums2)));
	}
	public static int[] intersection(int[] nums1, int[] nums2){
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<nums1.length; i++){
			if(map.containsKey(nums1[i])){
				map.put(nums1[i], map.get(nums1[i])+1);
			}else{
				map.put(nums1[i],1);
			}
		}
		List<Integer> results = new ArrayList<Integer>();
		for(int i=0; i<nums2.length; i++){
			if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
				results.add(nums2[i]);
				map.put(nums2[i], map.get(nums2[i]) - 1);
			}
		}
		int res[] = new int[results.size()];
		for(int i=0; i<results.size(); i++){
			res[i] = results.get(i);
		}
		return res;
	}

}