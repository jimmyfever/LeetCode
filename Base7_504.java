
public class Base7_504 {
	
	

	public static void main(String[] args){
		int num = -7;
		System.out.println(convertTo7(num));
	}	
	public static String convertTo7(int num){
		if(num < 0) return '-' + convertTo7(-num);

		if(num<7) return num +"";

		return convertTo7(num/7) + num%7;
	}
}