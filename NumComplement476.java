
public class NumComplement476 {
	
	

	public static void main(String[] args){
		int n = 5;
		System.out.println(complement(n));
	}

	public static int complement(int n){
		int mask = 1;
		while(mask<n) mask = (mask<<1) | 1; // change all bits to 1s.
		return mask ^ n;
	}	
}