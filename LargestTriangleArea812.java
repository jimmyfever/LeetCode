
public class LargestTriangleArea812 {
	
	

	public static void main(String[] args){
		
	}	
	public double largestTriArea(int[][] p){
		double ans = 0;
		for(int[] a : p){
			for(int[] b : p){
				for(int[] c : p){
					ans = Math.max(ans, 0.5 * Math.abs(a[0]*b[1] + b[0]*c[1] + c[0]*a[1] - b[0]*a[1] - c[0]*b[1] - a[0]*c[1]));
				}
			}
		}
		return ans;
	}
}