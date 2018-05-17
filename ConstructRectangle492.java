
public class ConstructRectangle492 {
	
	

	public static void main(String[] args){
		
	}	
	public int[] construct(int area){
		int w = (int)Math.sqrt(area);
		while(area%w != 0){
			w--;
		}
		return new int[] {area/w, w};
	}
}