
public class PowerOfFour342 {
	
	

	public static void main(String[] args){
		System.out.println(isPower(18));
	}

	public static boolean isPower(int n){
		// (n & (n-1)) == 0) && n>0 for power of 2.
		return (n & (n-1)) == 0 && n>0 && (n-1)%3 == 0;
	}	
}