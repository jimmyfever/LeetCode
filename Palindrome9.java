
public class  Palindrome9{
	
	// Constructor
	public Palindrome9(){
		
	}

	public static void main(String[] args){
		
	}
	public boolean isP(int x){
		if((x>=0 && x%10==0) || x<0) return false;
		int rev = 0;

		while(x>rev){
			rev = rev*10 + x%10;
			x /= 10;
		}
		return (x == rev || x == rev/10);
	}

}