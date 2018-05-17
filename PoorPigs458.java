
public class PoorPigs458 {
	
	

	public static void main(String[] args){
		int buckets = 1000, minsToDie = 15, minsToTest = 60;
		System.out.println(poorPigs(buckets,minsToDie,minsToTest));
	}	
	/*Now use one pig to find the row (make it drink from buckets 1, 2, 3, 4, 5, wait 15 minutes, make it drink from buckets 6, 7, 8, 9, 10, wait 15 minutes, etc). Use the second pig to find the column (make it drink 1, 6, 11, 16, 21, then 2, 7, 12, 17, 22, etc).

Having 60 minutes and tests taking 15 minutes means we can run four tests. If the row pig dies in the third test, the poison is in the third row. If the column pig doesn't die at all, the poison is in the fifth column (this is why we can cover five rows/columns even though we can only run four tests).

With 3 pigs, we can similarly use a 5×5×5 cube instead of a 5×5 square and again use one pig to determine the coordinate of one dimension (one pig drinks layers from top to bottom, one drinks layers from left to right, one drinks layers from front to back). So 3 pigs can solve up to 125 buckets.

In general, we can solve up to (⌊minutesToTest / minutesToDie⌋ + 1)pigs buckets this way, so just find the smallest sufficient number of pigs for example like this: */

	public static int poorPigs(int buckets, int minsToDie, int minsToTest){
		int pigs = 0;
		while(Math.pow((minsToTest / minsToDie + 1), pigs) < buckets){
			pigs += 1;
		}
		return pigs;
	}
}