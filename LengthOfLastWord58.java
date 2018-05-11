
public class LengthOfLastWord58 {
	
	// Constructor
	public LengthOfLastWord58(){
		
	}

	public static void main(String[] args){
		String s = "12 qrwer qwr";
		LengthOfLastWord58 len = new LengthOfLastWord58();
		System.out.println(len.length(s));
	}
	public int length(String s){
		System.out.println(s.trim().length());
		System.out.println(s.trim().lastIndexOf(" "));
		return s.trim().length() - (s.trim().lastIndexOf(" ")+1);
	}
}