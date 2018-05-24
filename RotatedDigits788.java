
public class RotatedDigits788 {
	
	

	public static void main(String[] args){
		
	}
	public int rotateDigits(int n){
		int count = 0;
		for(int i=1; i<=n; i++){
			if(isValid(i)) count++;
		}
		return count;
	}	
	private boolean isValid(int n){
		boolean valid = false;
		while(n>0){
			if(n%10 == 2) valid = true;
			if(n%10 == 5) valid = true;
			if(n%10 == 6) valid = true;
			if(n%10 == 9) valid = true;
			if(n%10 == 3) return false;
			if(n%10 == 4) return false;
			if(n%10 == 7) return false;
			n /= 10;
		}
		return valid;
	}
}