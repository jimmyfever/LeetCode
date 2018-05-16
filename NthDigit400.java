
public class NthDigit400 {
	
	

	public static void main(String[] args){
		int n = 12345;
		System.out.println(findNthDigit(n));
	}	
	public static int findNthDigit(int n){
		int len = 1;
		long count = 9;
		int first = 1;
		while(n>len*count){
			n -= len*count;
			len += 1;
			count *= 10;
			first *= 10;
		}
		first += (n-1) / len;
		String s = Integer.toString(first);
		return s.charAt((n-1)%len) - '0';
	}
}