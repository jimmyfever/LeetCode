
public class StudentAttendanceRecordI551 {
	
	

	public static void main(String[] args){
		
	}

	public boolean check(String s){
		return !s.matches(".*LLL.* | .*A.*A.*");
	}	

	public boolean check2(String s){
		return s.indexOf("A") == s.lastIndexOf("A") && !s.contains("LLL");
	}
}