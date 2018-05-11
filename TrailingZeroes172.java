
public class TrailingZeroes172 {
	
	

	public static void main(String[] args){
		int n =10;
		System.out.println(trailingZeroes(n));
	}
	public static int trailingZeroes(int n){
		if(n==0){
			return 0;
		}else{
			return n/5 + trailingZeroes(n/5);
		}
	}	
}