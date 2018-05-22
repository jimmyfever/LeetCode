
public class ValidPalindromeII680 {
	
	

	public static void main(String[] args){
		
	}	

	public boolean isPalindrome(String s){
		int left = 0, right = s.length() - 1;
		while(left <right){
			if(s.charAt(left) != s.charAt(right)){
				break;
			}
			left++;
			right--;
		}
		if(left>=right) return true;

		return isSubPal(s, left+1, right) || isSubPal(s, left, right-1);
	}
	private boolean isSubPal(String s, int left, int right){
		while(left<right){
			if(s.charAt(left) != s.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}