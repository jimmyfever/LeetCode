
public class SumSquareNum633 {
	
	

	public static void main(String[] args){
		
	}

	public boolean judgeSumSuqare(int c){
		if(c<0) return false;

		int l = 0, r = (int)Math.sqrt(c);
		while(l<=r){
			int sum = l * l + r * r;
			if(sum<c){
				l++;
			}else if(sum>c){
				r--;
			}else{
				return true;
			}
		}
		return false;
	}	
}