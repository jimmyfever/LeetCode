
public class SingleNumII137 {
	
	

	public static void main(String[] args){
		
	}
	/*
	利用位运算

	ones twos 分别表示出现一次和出现两次的即时结果

	遍历A
	对 ones操作， ones = ones ^ A[i] & (~tows)意思是把A[i] 计入到出现一次的情况里，
	但是有可能这个数已经出现过两次，所以要排除两次情况

	对 twos操作， twos = twos ^ A[i] & (~ones) 把A[i] 计入到两次情况，
	如果第三次出现了，自然消掉了，
	如果第二次出现，那么就计入，
	如果是第一次出现，不计入，这个过程通过和ones的非相交来控制
	*/	
	public int singleNumII(int[] A){
		int ones = 0, twos = 0;

		for(int i = 0; i < A.length; i++){
			ones = (ones ^ A[i]) & (~twos);
			twos = (twos ^ A[i]) & (~ones);
		}
		return ones;
	}
}