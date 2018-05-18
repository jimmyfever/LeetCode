import java.util.List;
import java.util.ArrayList;

public class FindModeInBST501 {
	
	private TreeNode pre;
	private int count = 0;
	private int max = -1;

	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}

	public static void main(String[] args){
		
	}
	public int[] findMode(TreeNode root){
		List<Integer> modes = new ArrayList<>();
		pre = root;
		inorder(root,modes);
		int[] result = new int[modes.size()];
		for(int i=0; i<modes.size(); i++){
			result[i] = modes.get(i);
		}
		return result;
	}	
	public void inorder(TreeNode root, List<Integer> modes){
		if(root == null) return;
		inorder(root.left, modes);
		count = pre.val == root.val ? count+1 : 1;

		if(count == max){
			modes.add(root.val);
		} else if(count>max){
			modes.clear();
			modes.add(root.val);
			max = count;
		}
		pre = root;
		inorder(root.right,modes);
	}
}