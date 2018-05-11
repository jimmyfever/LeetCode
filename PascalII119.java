import java.util.ArrayList;


public class PascalII119 {
	
	

	public static void main(String[] args){
		int rowIndex = 3;
		System.out.println(pascalII(rowIndex));
	}
	public static ArrayList<Integer> pascalII(int rowIndex){
		ArrayList<Integer> row = new ArrayList<>();
		for(int i=0; i<=rowIndex; i++){
			row.add(0,1);
			for(int j=1; j<row.size()-1; j++){
				row.set(j, row.get(j)+row.get(j+1));
			}
		}
		return row;
	}	
}