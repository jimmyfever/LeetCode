
public class ReverseBits190 {
	
	

	public static void main(String[] args){
		int n = 43261596;
		System.out.println(reverseBits(n));
	}

	public static int reverseBits(int n){
		int rev = 0;
		for (int i=0; i< 32; i++, n >>= 1){
			rev = rev << 1 | (n & 1);
		}
		return rev;
	}	
}