import java.util.Arrays;

public class AssginCookies455 {
	
	

	public static void main(String[] args){
		
	}	
	public int assginCookies(int[] g, int[] s){
		Arrays.sort(g);
		Arrays.sort(s);
		int i, j;
		for(i=j=0; i<g.length && j<s.length; j++){
			if(g[i]<=s[j]){
				i++;
			}
		}
		return i;
	}
}