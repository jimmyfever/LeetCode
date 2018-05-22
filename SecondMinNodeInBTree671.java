
public class SecondMinNodeInBTree671 {
	
	

	public static void main(String[] args){
		
	}
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}	
	public int findSecondMinNode(TreeNode root){
		if(root.left == null) return -1;
		int left = (root.left.val == root.val) ? findSecondMinNode(root.left) : root.left.val;
		int right = (root.right.val == root.val) ? findSecondMinNode(root.right) : root.right.val;

		return (left == -1 || left == -1) ? Math.max(left, right) : Math.min(left, right);
	}
}