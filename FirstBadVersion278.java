
public class FirstBadVersion278 {
	
	

	public static void main(String[] args){
		
	}	

	public boolean isBadVersion(int version){

	}
	public int firstBadVersion(int n){
		int start = 1, end = n;
		while(start+1<end){
			int mid = start+(end-start)/2;
			if(isBadVersion(mid)){
				end = mid;
			}else{
				start = mid;
			}
		}
		if(isBadVersion(start)){
			return start;
		}
		return end;
	}
}