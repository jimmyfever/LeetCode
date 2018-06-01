
public class JumpGameII45 {
	
	

	public static void main(String[] args){
		
	}	
	public int jump(int[] A){
		int[] steps = new int[A.length];

		steps[0] = 0;
		for(int i = 1; i < A.length; i++){
			steps[i] = Integer.MAX_VALUE;
		}

		for(int i = 1; i < A.length; i++){
			for(int j = 0; j < i; j++){
				if(steps[j] != Integer.MAX_VALUE && j + A[j] >= i){
					steps[i] = Math.min(steps[i], steps[j] + 1);
				}
			}
		}
		return steps[A.length - 1];
	}

	// Greedy
	public int jump1(int[] A){
		if(A == null || A.length == 0){
			return -1;
		}
		int start = 0, end = 0, jumps = 0;
		while(end < A.length){
			jumps++;
			int farthest = end;
			for(int i = start; i <= end; i++){
				if(A[i] + i > farthest){
					farthest = A[i] + i;
				}
			}
			start = end + 1;
			end = farthest;
		}
		return jumps;
	}
}