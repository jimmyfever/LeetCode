
public class CanPlaceFlowers605 {
	
	

	public static void main(String[] args){
		
	}

	public boolean canPlace(int[] flowerbed, int n){
		int count = 0;
		for(int i=0; i<flowerbed.length; i++){
			if(flowerbed[i] == 0){
				int next = (i == flowerbed.length -1) ? 0 : flowerbed[i+1];
				int pre = (i==0) ? 0 : flowerbed[i-1];
				if(next == 0 && pre == 0){
					flowerbed[i] = 1;
					count++;
				}  
				if(count >= n) return true;
			}
		}
		return false;
	}	
}