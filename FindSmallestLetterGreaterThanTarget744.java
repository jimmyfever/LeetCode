
public class FindSmallestLetterGreaterThanTarget744 {
	
	

	public static void main(String[] args){
		
	}
	public char findChar(char[] letters, char target){
		int len = letters.length;
		int lo = 0, hi = len - 1;
		if(target >=letters[len-1]) target = (char)(letters[0] - 1);
		while(lo<hi){
			int mid = lo + (hi-lo) / 2;
			if(letters[mid] > target) hi = mid;
			else lo = mid + 1;
		}
		return letters[lo];
	}	
}