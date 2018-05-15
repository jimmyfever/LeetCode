import java.util.HashSet;

public class IntersectionOfTwoArrays349 {
	
	

	public static void main(String[] args){
		
	}	
	public int[] intersection(int[] nums1, int[] nums2){
		if(nums1 == null || nums2 == null){
			return null;
		}
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i<nums1.length; i++){
			set.add(nums1[i]);
		}

		HashSet<Integer> res = new HashSet<Integer>();
		for(int i=0; i<nums2.length; i++){
			if(set.contains(nums2[i]) && !res.contains(nums2[i])){
				res.add(nums2[i]);
			}
		}
		int size = res.size();
		int[] result = new int[size];
		int idx = 0;
		for (Integer num : res){
			result[idx++] = num;
		}
		return result;
	}
}