
public class Reverse7 {
	
	// Constructor
	public Reverse7(){
		
	}

	public static void main(String[] args){
		
	}

	public int reverse(int x){
		int rev = 0;
		int y = x > 0 ? x : -x;
		while(y>0){
			if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
				return 0;
			rev = rev*10 + y%10;
			y /= 10;
		}
		return x>0 ? rev : -rev;
	}
}