
public class ArrangingCoin441 {
	
	

	public static void main(String[] args){
		int n = 8;
		System.out.println(arrangCoin(n));
	}	
	public static int arrangCoin(int n){
		//quadratic equation with one unknown
		return (int) ((-1+Math.sqrt(1+8L*n))/2);
	}
}