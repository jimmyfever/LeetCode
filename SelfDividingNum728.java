import java.util.List;
import java.util.ArrayList;

public class SelfDividingNum728 {
	
	

	public static void main(String[] args){
		
	}

	public List<Integer> selfDividingNum(int left, int right){
		List<Integer> list = new ArrayList<>();
		for(int i = left; i<=right; i++){
			if(isValid(i)){
			list.add(i);
			}
		}
		return list;
	}	

	private boolean isValid(int num){
		int cur = num;
		while(cur != 0){
			int digit = cur % 10;
			if(digit == 0 || num % digit != 0){
				return false;
			}
			cur /= 10;
		}
		return true;
	}
}