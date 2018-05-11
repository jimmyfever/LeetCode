
public class ClimbingStairs70 {
	
	// Constructor
	public ClimbingStairs70(){
		
	}

	public static void main(String[] args){
		int n = 8;
		System.out.println(climbStairs(n));
	}
	
	public static int climbStairs(int n){
		// fibonacci
		if(n==0)
			return 0;
		int a = 1, b = 1;
		while (n-->0){
			a = (b += a) -a; // equal b=a+b; a=b-a;
		}
		return a;
	}
}