import java.util.Arrays;

public class PlusOne66 {
	
	// Constructor
	public PlusOne66(){
		
	}

	public static void main(String[] args){
		int[] digits = {9,9,9,9};
		PlusOne66 po = new PlusOne66();
		//System.out.println(Arrays.toString(po.plusOne(digits)));
		System.out.println(Arrays.toString(plusOne(digits)));
	
	}
	public static int[] plusOne(int[] digits){
		for(int i = digits.length-1; i>=0; i--){
			if(digits[i]<9){
				digits[i] ++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] newDigits = new int[digits.length+1];
		newDigits[0] = 1;
		return newDigits;
	}
	
}