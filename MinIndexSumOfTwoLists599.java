import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class MinIndexSumOfTwoLists599 {
	
	

	public static void main(String[] args){
		
	}	
	public String[] findRes(String[] list1, String[] list2){
		Map<String, Integer> map = new HashMap<>();
		List<String> result = new ArrayList<>();
		int minSum = Integer.MAX_VALUE;
		for(int i=0; i<list1.length; i++){
			map.put(list1[i], i);
		}
		for(int i=0; i<list2.length; i++){
			Integer j = map.get(list2[i]);
			if(j != null && i+j<=minSum){
				if(i+j<minSum){
					result.clear();
					minSum = i+j;
				}
				result.add(list2[i]);
			}
		}
		return result.toArray(new String[result.size()]);
	}
}