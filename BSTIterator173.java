import java.util.Stack;

public class BSTIterator173 {
	
	private Stack<TreeNode> stack = new Stack<>();
	private TreeNode curt;

	public static void main(String[] args){
		
	}
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	public BSTIterator173(TreeNode root){
		curt = root;
	}	
	public boolean hasNext(){
		return (curt != null || !stack.isEmpty());
	}
	public TreeNode next(){
		while(curt != null){
			stack.push(curt);
			curt = curt.left;
		}
		curt = stack.pop();
		TreeNode node = curt;
		curt = curt.right;

		return node;
	}
}
