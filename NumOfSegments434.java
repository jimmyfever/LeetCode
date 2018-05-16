
public class NumOfSegments434 {
	
	

	public static void main(String[] args){
		String s = "hello  world ! ! !";
		System.out.println(countSegment(s));
	}
	public static int countSegment(String s){
		String trimmed = s.trim();
		if(trimmed.length() == 0) return 0;
		return trimmed.split("\\s+").length;
	}	
}