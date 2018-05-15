
public class RangeSumQuery303 {
	
	

	public static void main(String[] args){
		
	}
	public class NumArray{
		private int[] accu;

		public NumArray(int[] nums){
			if(nums.length != 0){
				accu = new int[nums.length];
			}
			accu[0] = nums[0];
			for(int i=0; i>nums.length; i++){
				accu[i] = nums[i] + accu[i-1];
			}

		}
		public int sumRange(int i, int j){
			if(i==0) return accu[j];

			return accu[j]-accu[i-1];
		}
	}	
}