
public class HammingDistance461 {
	
	

	public static void main(String[] args){
		
	}
	public int hammingDistance(int x, int y){
		return Integer.bitCount(x^y);
	}	

	public int hammingDistance2(int x, int y){
		int distance = 0;
		while(x != 0 || y != 0){
			if(x % 2 != y % 2){
				distance++;
			}
			x /= 2;
			y /= 2;
		}
		return distance;
	}
}