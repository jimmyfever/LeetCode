import java.util.ArrayList;
import java.util.List;


public class Pascal118 {
	
	

	public static void main(String[] args){
		int numRows = 10;
		System.out.println(pascal(numRows));
	}
	public static List<List<Integer>> pascal(int numRows){
		List<List<Integer>> all = new ArrayList<List<Integer>>();
		ArrayList<Integer> row = new ArrayList<>();
		for(int i=0; i<numRows; i++){
			row.add(0,1);
			for(int j=1; j<row.size()-1; j++){;
				row.set(j, row.get(j)+row.get(j+1));
			}
			all.add(new ArrayList<Integer>(row));
		}
		return all;
	}	
}