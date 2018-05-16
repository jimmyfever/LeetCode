
public class SumOfLeftLeaves404 {
	
	

	public static void main(String[] args){
		
	}
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}	
	public int sumOfLeftLeves(TreeNode root){
		if(root == null) return 0;
		int ans = 0;
		if(root.left != null){
			if(root.left.left == null && root.left.right == null){
				ans += root.left.val;
			}else{
				ans += sumOfLeftLeves(root.left);
			}
		}
		ans += sumOfLeftLeves(root.right);

		return ans;
	}

}