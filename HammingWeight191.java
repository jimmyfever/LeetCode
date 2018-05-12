
public class HammingWeight191 {
	
	

	public static void main(String[] args){
		int n = 11;
		System.out.println(hammingWeight(n));
	}
	public static int hammingWeight(int n){
		int ones = 0;
		while(n != 0){
			ones += (n & 1);
			n = n >>> 1;	//no need to consider the sign bit
		}	
		return ones;
	}
}