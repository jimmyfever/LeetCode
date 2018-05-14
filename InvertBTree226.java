import java.util.Stack;

public class InvertBTree226 {
	
	

	public static void main(String[] args){
		
	}
	public static class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}	
	//recursive DFS
	public TreeNode invert(TreeNode root){
		if(root==null){
			return null;
		}
		TreeNode left = root.left, right = root.right;
		root.left = invert(right);
		root.right = invert(left);
		return root;
	}
	//non-recursive BFS
	public TreeNode invert1(TreeNode root){
		if(root == null){
			return null;
		}

        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode node = st.pop();
            TreeNode left = node.left;		//next left
            node.left = node.right;
            node.right = left;			
            while(node.left != null){
            	st.push(node.left);
            }
            while(node.right != null){
            	st.push(node.right);
            }
		}
        return root;
	}	
}