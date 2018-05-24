import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class SubdomainVisitCount811 {
	
	

	public static void main(String[] args){
		
	}
	public List<String> subdomainCounts(String[] cpdomains){
		Map<String, Integer> map = new HashMap<>();

		for(String str : cpdomains){
			String[] line = str.split(" ");
			int count = Integer.valueOf(line[0]);
			String[] domains = line[1].split("\\.");
			String tmp = "";
			for(int i = domains.length - 1; i>=0; i--){
				tmp = domains[i] + (tmp.equals("") ? tmp : "."+tmp);
				if(!map.containsKey(tmp)){
					map.put(tmp, count);
				}else{
					map.put(tmp, map.get(tmp) + count);
				}
			}
		}
		List<String> ans = new ArrayList<>();
		for(String str : map.keySet()){
			ans.add(map.get(str) + " " + str);
		}
		return ans;
	}	
}