
public class OneBitAndTwoBitChar717 {
	
	

	public static void main(String[] args){
		
	}
	public boolean isOneBit(int[] bits){
		int i = 0;
		while(i < bits.length){
			if(bits[i] == 1){
				i += 2;
			}else{
				i++;
			}
		}
		return i == bits.length-1;
	}	
}