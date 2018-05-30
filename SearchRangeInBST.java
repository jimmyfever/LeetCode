import java.util.ArrayList;

public class SearchRangeInBST {
	
	private ArrayList<Integer> result;

	public static void main(String[] args){
		
	}
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}	
	public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2){
		result = new ArrayList<Integer>();

		helper(root, k1, k2);
		return result;
	}
	public void helper(TreeNode root, int k1, int k2){
		if(root == null){
			return;
		}
		if(root.val > k1){
			helper(root.left, k1, k2);
		}
		if(root.val >= k1 && root.val <= k2){
			result.add(root.val);
		}
		if(root.val < k2){
			helper(root.right, k1, k2);
		}
	}
}