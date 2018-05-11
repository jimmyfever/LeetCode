
public class ConvertToTitle168 {
	
	

	public static void main(String[] args){
		int n = 703;
		System.out.println(convertToTitle(n));
	}
	public static String convertToTitle(int n){
		if(n==0){
			return "";
		}
		return (convertToTitle((n-1)/26) + (char)((n-1)%26 + 'A'));
	}	
}