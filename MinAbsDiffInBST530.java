
public class MinAbsDiffInBST530 {
	int min = Integer.MAX_VALUE;
	TreeNode pre;
	

	public static void main(String[] args){
		
	}	
	public class TreeNode {
 	    int val;
 	    TreeNode left;
 	    TreeNode right;
 	    TreeNode(int x) { val = x; }
 	}
 	public int minDiff(TreeNode root){
 		inorder(root);
 		return min;
 	}
 	public void inorder(TreeNode root){
 		if(root == null) return;
 		inorder(root.left);
 		if(pre != null) min = Math.min(min, root.val - pre.val);
 		pre = root;
 		inorder(root.right);
 	}
}