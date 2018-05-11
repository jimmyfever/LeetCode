
public class Sqrt69 {
	
	// Constructor
	public Sqrt69(){
		
	}

	public static void main(String[] args){
		int x = 101;
		System.out.println(sqrt(x));
	}
	public static int sqrt(int x){
		if(x==0) {
			return 0;
		}
		int lo = 1, hi = x;
		while(lo+1<hi){
			int m = lo + (hi - lo) / 2;
			if(m <= x/m){
				lo = m;
			}else {
				hi = m;
			}
		}
		return lo;
		}
	}
