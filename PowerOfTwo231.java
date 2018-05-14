
public class PowerOfTwo231 {
	
	

	public static void main(String[] args){
		int n = 218;
		System.out.println(isPowerOfTwo(n));
	}	
	public static boolean isPowerOfTwo(int n){
		if(n<=0){
			return false;
		}
		return Integer.bitCount(n) == 1;
	}
}