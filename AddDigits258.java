
public class AddDigits258 {
	
	

	public static void main(String[] args){
		int n = 258;
		System.out.println(addDigits(n));
	}

	public static int addDigits(int n){
		//without loop/recursion
		if(n == 0){
			return 0;
		}
		if(n%9 == 0){
			return 9;
		}else{
			return n%9;
		}
	}	
}