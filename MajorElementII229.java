import java.util.List;
import java.util.ArrayList;

public class MajorElementII229 {
	
	

	public static void main(String[] args){
		int[] nums = {1,1,1,3,3,2,2,2};
		System.out.println(majorElementII(nums));
	}
	public static List<Integer> majorElementII(int[] nums){
		List<Integer> res = new ArrayList<>();
		if(nums.length == 0){
			return res;
		}

		int num1 = nums[0], num2 = nums[1], count1 = 0, count2 = 0;
		for(int num : nums){
			if(num1 == num){
				count1++;
			}else if(num2 == num){
				count2++;
			}else if(count1 == 0){
				count1++;
				num1 = num;
			}else if(count2 == 0){
				count2++;
				num2 = num;
			}else{
				count1--;
				count2--;
			}
		}
		count1 = 0;
		count2 = 0;
		for(int num : nums){
			if(num1 == num){
				count1++;
			}else if(num2 == num){
				count2++;
			}
		}

		if(count1 > nums.length / 3){
			res.add(num1);
		}
		if(count2 > nums.length / 3){
			res.add(num2);
		}
		return res;
	}	
}