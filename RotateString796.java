
public class RotateString796 {
	
	

	public static void main(String[] args){
		
	}
	public boolean rotateString(String A, String B){
		return A.length() == B.length() && (A+A).contains(B);
	}	
}