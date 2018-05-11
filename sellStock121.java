
public class sellStock121 {
	
	

	public static void main(String[] args){
		int[] prices = {5,100,1,300,6,4};
		System.out.println(sellStock(prices));
	}	
	public static int sellStock(int[] prices){
		if(prices.length==0){
			return 0;
		}
		int max = 0;
		int currMin = prices[0];
		for (int i=0; i<prices.length; i++){
			if(prices[i]>currMin){
				max = Math.max(max, prices[i]-currMin);
			}else{
				currMin = prices[i];
			}
		}
		return max;
	}
}