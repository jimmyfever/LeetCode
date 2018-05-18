import java.util.Arrays;
import java.util.ArrayList;

public class RelativeRanks506 {
	
	

	public static void main(String[] args){
		int[] a = {5,1,3,2,4};
		System.out.println(Arrays.toString(findRelativeRanks(a)));

	}
    public static String[] findRelativeRanks(int[] nums) {
	    int len=nums.length;
	    String[] ret=new String[len];
	    int[] numsCopy=nums.clone();
	    Arrays.sort(numsCopy);
	    ArrayList<Integer> al=new ArrayList<>();
	    for(int i=len-1;i>=0;i--){
	        al.add(numsCopy[i]);
	    }
	    for(int i=0;i<len;i++){
	        if(nums[i]==numsCopy[len-1]){ ret[i]="Gold Medal";}
	        else if(nums[i]==numsCopy[len-2]){ ret[i]="Silver Medal";}
	        else if(nums[i]==numsCopy[len-3]){ ret[i]="Bronze Medal";}
	        else{ret[i]=al.indexOf(nums[i])+1+"";}
	    }
	    return ret;    
    }
}