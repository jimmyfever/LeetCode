import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class  Test{
	
	// Constructor
	public Test(){
		
	}

	public static void main(String[] args){
		String p = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] words = p.replaceAll("\\pP" , "").toLowerCase().split("\\s+");
		System.out.println(Arrays.toString(words));
	
    }
	
}