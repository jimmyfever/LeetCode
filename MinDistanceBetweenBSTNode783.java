
public class MinDistanceBetweenBSTNode783 {
	
	Integer res;
	Integer pre;

	public static void main(String[] args){
		
	}	
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	public int minDistance(TreeNode root){
		res = Integer.MAX_VALUE;
		pre = null;
		inorder(root);
		return res;
	}
	private void inorder(TreeNode root){
		if(root==null) return;
		inorder(root.left);
		if(pre != null){
			res = Math.min(res, root.val - pre);
		}
		pre = root.val;
		inorder(root.right);
	}
}