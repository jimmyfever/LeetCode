import java.util.Arrays;



public class  Test{
	
	// Constructor
	public Test(){
		
	}

	public static void main(String[] args){

		String s = "hello world";
		int[] hash = new int[256];
		for(char c:s.toCharArray()){
			hash[c]++;
		}
		System.out.println(Arrays.toString(hash));
	}
	
}