
public class AddBinary67 {
	
	// Constructor
	public AddBinary67(){
		
	}

	public static void main(String[] args){
		//The input strings are both non-empty and contains only characters 1 or 0.
		String a = "11111";
		String b ="1011";
		System.out.println(addBinary(a,b));
	}
	public static String addBinary(String a, String b){
		StringBuilder sb = new StringBuilder();	
		int i = a.length() - 1, j = b.length() -1, carry = 0;
		while(i>=0 || j>=0){
			int sum = carry;
			// order does matter!!!
			if(i>=0) sum += a.charAt(i--) - '0';	//In ASCII, '1' is 49, '0' is 48
			if(j>=0) sum += b.charAt(j--) - '0';
			sb.append(sum % 2);
			carry = sum / 2;
		}
		if(carry != 0) sb.append(carry);
		return sb.reverse().toString();
	}
}