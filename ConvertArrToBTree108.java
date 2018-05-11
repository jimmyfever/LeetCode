
public class ConvertArrToBTree108 {
	

	public static void main(String[] args){
		int[] nums = {-10,-3,0,5,9};
		System.out.println(sortedArrayToBST(nums));
	}

	public static class TreeNode {
 		int val;
 		TreeNode left;
 		TreeNode right;
 		TreeNode(int x) { val = x; }
 	}
	public static TreeNode sortedArrayToBST(int[] nums){
		if(nums.length ==0){
			return null;
		}
		TreeNode root = helper(nums, 0, nums.length-1);
		return root;
	}	

	public static TreeNode helper(int[] nums, int lo, int hi){
		if(lo>hi){
			return null;
		}
		int m = lo + (hi-lo)/2;
		TreeNode node = new TreeNode(nums[m]);
		node.left = helper(nums,lo,m-1);
		node.right = helper(nums,m+1,hi);
		return node;
	}
}