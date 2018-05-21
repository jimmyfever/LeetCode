
public class ShortestUnsortedContinuousSubarray581 {
	


	public static void main(String[] args){
		
	}
	/*
一次遍历，左、右同时进行；
左边前进记录当前经过元素的最大值，若按照升序规则，则当前遍历元素即为当前最大值；如果二者不相等，则用j记录当前前进的索引；
右边后退记录当前经过元素的最小值，按照升序规则，则当前遍历元素即为当前最小值；如果二者不相等，则用i记录当前后退的索引。
当一次遍历完成，前进的索引记录了不符合升序规则的最大索引，后退的索引记录了不符合规则的最小索引。
注意在给i和j赋初值的时候要考虑数组元素全部按升序排序的情况，返回为0。所以，赋值i和j为不大于0且相差1，如：i = 0, j = -1，或i = -1, j = -2	*/
	public int findUnsortedSubarray(int[] nums){
		int i = 0, j = -i, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

		for(int l=0, r=nums.length-1; r>=0; l++, r--){
			max = Math.max(max, nums[l]);
			if(nums[l] != max) j = l;

			min = Math.min(min, nums[r]);
			if(nums[r] != min) i = r;
		}
		return j - i + 1;
	}
}