import java.util.HashMap;

public class RomanToInt13 {
	
	// Constructor
	public RomanToInt13(){
		
	}

	public static void main(String[] args){
		
	}
	
	public int romanToInt(String s){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		{{
			map.put('I', 1);
			map.put('V', 5);
			map.put('X', 10);
			map.put('L', 50);
			map.put('C', 100);
			map.put('D', 500);
			map.put('M', 1000);
		}};

		int result = 0;

		if(s.length() == 0) return 0;

		if(s.indexOf("IV")!=-1) result -=2*1;
		if(s.indexOf("IX")!=-1) result -=2*1;
		if(s.indexOf("XL")!=-1) result -=2*10;
		if(s.indexOf("XC")!=-1) result -=2*10;
		if(s.indexOf("CD")!=-1) result -=2*100;
		if(s.indexOf("CM")!=-1) result -=2*100;

		char arr[] = s.toCharArray();

		for(int i=0;i<s.length();i++){
			result += map.get(arr[i]);
		}
		return result;
	}
}
