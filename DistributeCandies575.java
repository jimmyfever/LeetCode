import java.util.Set;
import java.util.HashSet;

public class DistributeCandies575 {
	
	

	public static void main(String[] args){
		
	}
	public int distribute(int[] candies){
		Set<Integer> set = new HashSet<>(candies.length);
		for(int candy : candies) set.add(candy);
		return set.size() >= candies.length / 2? candies.length / 2 : set.size();	// return min(candies.length/2, set.size())
	}	
}