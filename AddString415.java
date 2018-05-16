
public class AddString415 {
	
	

	public static void main(String[] args){
		
	}

	public String addString(String num1, String num2){
		String result = "";
		int m = num1.length(), n = num2.length(), i = m - 1, j = n - 1, flag = 0;

		while(i>=0 || j>=0){
			int a, b;
			if(i>=0){
				a = num1.charAt(i--) - '0';
			}else{
				a = 0;
			}
			if(j>=0){
				b = num2.charAt(j--) - '0';
			}else{
				b = 0;
			}
			int sum = a+b+flag;
			result = (char)(sum%10 + '0') + result;
			flag = sum/10;
		}
		return flag == 1 ? "1" + result: result;
	}	
}