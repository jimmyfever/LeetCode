
public class ReverseString344 {
	
	

	public static void main(String[] args){
		System.out.println(reverse("helllo"));
	}	
	public static String reverse(String s){
		char[] c = s.toCharArray();
		int lo = 0, hi = c.length - 1;
		while(lo<hi){
			char tmp = c[lo];
			c[lo] = c[hi];
			c[hi] = tmp;
			lo++;
			hi--;
		}
		return new String(c);
	}
}