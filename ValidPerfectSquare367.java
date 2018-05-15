
public class ValidPerfectSquare367 {
	
	

	public static void main(String[] args){
		int num = 15;
		System.out.println(isPerfect1(num));
		System.out.println(isPerfect2(num));
		System.out.println(isPerfect3(num));

	}
	public static boolean isPerfect1(int num){
		int i = 1;
		while(num>0){
			num -= i;
			i += 2;
		}
		return num == 0;
	}	

	public static boolean isPerfect2(int num){
		if(num<1) return false;
		long lo = 1, hi = num;
		while(lo+1<hi){
			long mid = lo + (hi-lo)/2;
			if(mid *mid == num) return true;
			else if(mid*mid<num) lo = (int)mid;
			else hi = (int)mid;
		}
		return false;
	}

	public static boolean isPerfect3(int num){
		if(num<1) return false;
		long t = num / 2;
		while(t*t>num){
			t = (t+ num/t) /2;
		}
		return t*t == num;
	}
}