
public class LargestPalindrome479 {
	
	

	public static void main(String[] args){
		int n = 8;
		System.out.println(largestPalindrome(n));
	}
	public static int largestPalindrome(int n){
		if(n==1) return 9;

		int max = (int)Math.pow(10, n) - 1;
		int min = max / 10;
		long maxNum = (long) max * (long) max;

		int firstHalf = (int) (maxNum / Math.pow(10,n));

		while(firstHalf>min){
			long pal = createPal(firstHalf);

			for(long i = max; max>min; i--){
				if(pal / i > max || i*i<pal) {
					break;
				}
				if(pal % i == 0) {
					return (int)pal%1337;
				}
			}
			firstHalf--;
		}
		return -1;
	}	

	public static long createPal(long n){
		String s = n + new StringBuilder().append(n).reverse().toString();
		return Long.parseLong(s);
	}
}