
public class LowestCommoAncestorOfBTree235 {
	
	

	public static void main(String[] args){
		
	}
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
		//iterative
		while((root.val - p.val)*(root.val - q.val)>0){
			if(p.val<root.val){
				root = root.left;
			}else{
				root = root.right;
			}
		}
		return root;
	}	

	public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q){
		if(root.val>p.val && root.val>q.val){
			return lowestCommonAncestor2(root.left, p, q);
		}else{
			return lowestCommonAncestor2(root.right, p, q);
		}
		return root;
	}
}