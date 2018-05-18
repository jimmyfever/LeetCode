
public class PerfectNum507 {
	
	

	public static void main(String[] args){
		int num = 496;
		System.out.println(isPerfect(num));
	}
	public static boolean isPerfect(int num){
		if(num==1) return false;

		int sum = 0;
		for(int i=2; i<Math.sqrt(num); i++){
			if(num%i == 0){
				sum += i + num / i;
			}
		}
		sum++;	// + 1

		return sum == num;
	}	
}