
public class BinaryNumWithAlternatingBits693 {
	
	

	public static void main(String[] args){
		int n = 5;
		System.out.println(hasAlternatingBits(n));
	}	
	public static boolean hasAlternatingBits(int n){
		int last = n & 1;
		while(n != 0 && (n & 1) == last){
			last ^= 1;
			n >>= 1;
		}
		return n == 0;
	}
}