import java.util.Stack;

public class LargestRectangleInHistogram84 {
	
	

	public static void main(String[] args){
		int[] heights = {2,1,5,6,2,3};
		System.out.println(largestRectangleArea(heights));
	}
	public static int largestRectangleArea(int[] heights){
		if(heights == null || heights.length == 0){
			return 0;
		}
		int len = heights.length;
		Stack<Integer> stack = new Stack<>();
		int maxArea = 0;
		for(int i = 0; i <= len; i++){
			int cur = (i == len) ? -1 : heights[i];	
			while(!stack.isEmpty() && cur <= heights[stack.peek()]){
				int h = heights[stack.pop()];
				int w = stack.isEmpty() ? i : i - stack.peek() - 1;
				maxArea = Math.max(maxArea, h * w);
			}
			stack.push(i);
		}
		return maxArea;
	}
}