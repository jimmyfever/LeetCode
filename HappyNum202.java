import java.util.HashSet;

public class HappyNum202 {
	
	

	public static void main(String[] args){
		int count = 0;
		for(int n = 1; n<101; n++){
			if(isHappy(n)){
				System.out.println(n);
				count++;
			}
		}
		System.out.println("count:" + count);

	}
	public static int nextNum(int n){
		int sum = 0;
		while(n !=0){
			sum += ((n%10) * (n%10));
			n /= 10;
		}
		return sum;
	}
	public static boolean isHappy(int n){
		HashSet<Integer> set = new HashSet<Integer>();
		while(n!=1){
			if(set.contains(n)){
				return false;
			}
			set.add(n);
			n = nextNum(n);
		}
		return true;
	}
}