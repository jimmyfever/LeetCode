
public class GuessNum374 {
	
	

	public static void main(String[] args){
		
	}

	public int guessNum(int n){
		int lo = 1, hi = n;
		while(lo<hi){
			int mid = lo+(hi-lo)/2;
			if(guess(mid)==0) return mid;
			else if(guess(mid)==1) return lo = mid+1;
			else hi = mid;
		}
		return lo;
	}	
}