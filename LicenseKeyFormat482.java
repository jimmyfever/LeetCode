
public class LicenseKeyFormat482 {
	
	

	public static void main(String[] args){
		String s = "2-5g-3-J";
		int k = 2;
		System.out.println(format(s, k));
	}	
	public static String format(String s, int k){
		s = s.replace("-","").toUpperCase();
		StringBuilder sb = new StringBuilder();	
		sb.append(s);

		int len = s.length();
		for(int i=k; i<len; i+=k){
			sb.insert(len-i,'-');
		}
		return sb.toString();

	}
}