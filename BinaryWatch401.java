import java.util.List;
import java.util.ArrayList;
import java.lang.Integer;

public class BinaryWatch401 {
	
	

	public static void main(String[] args){
		int n = 8;
		System.out.println(binaryWatch(n));
	}	
	public static List<String> binaryWatch(int n){
		List<String> list = new ArrayList<>();
		for(int h=0;h<12; h++){
			for(int m=0; m<60; m++){
				if((Integer.bitCount(h)+Integer.bitCount(m)) == n){
					list.add(String.format("%d:%02d", h, m));
				}
			}
		}
		return list;
	}
}