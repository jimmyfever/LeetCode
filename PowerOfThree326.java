
public class PowerOfThree326 {
	
	

	public static void main(String[] args){
		System.out.println(isPower1(81));
	}
	public static boolean isPower(int n){
		int maxPowerOfThree = (int)Math.pow(3, (int)(Math.log(Integer.MAX_VALUE) / Math.log(3)));
		System.out.println(maxPowerOfThree);
		return n>0 && maxPowerOfThree%n ==0;
	}	
	public static boolean isPower1(int n){
		return (Math.log10(n)/Math.log10(3)) % 1 ==0;
	}
}