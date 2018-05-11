
public class sellStockII122 {
	
	

	public static void main(String[] args){
		int[] prices = {7,1,2,5,6,4};
		System.out.println(sellStockII(prices));
	}
	public static int sellStockII(int[] prices){
		if(prices.length==0){
			return 0;
		}
		int sum = 0;
		for(int i=0; i<prices.length-1; i++){
			if(prices[i+1]>prices[i]){
				sum += prices[i+1]-prices[i];
			}
		}
		return sum;
	}	
}