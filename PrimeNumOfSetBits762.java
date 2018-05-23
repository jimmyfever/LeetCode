import java.util.Set;
import java.util.HashSet;

public class PrimeNumOfSetBits762 {
	
	

	public static void main(String[] args){
		
	}
	public int countPrime(int L, int R){
		Set<Integer> set = new HashSet<>();
		int count = 0;
		for(int i=L; i<=R; i++){
			count += set.contains(Integer.bitCount(i)) ? 1 : 0;
		}
		return count;
	}	
}