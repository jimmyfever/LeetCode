
public class Palindrome125 {
	
	

	public static void main(String[] args){
		String s = "A man, a plan, a canal: Panama";
		System.out.println(palindrome(s));
	}
	public static boolean palindrome(String s){
		String pure = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		String rev = new StringBuilder(pure).reverse().toString();
		return pure.equals(rev);
	}	
}