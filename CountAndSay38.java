public class CountAndSay38 {
	
	// Constructor
	public CountAndSay38(){
		
	}

	public static void main(String[] args){
		CountAndSay38 cns = new CountAndSay38();
		for(int i = 1; i<=10; i++){
		System.out.println(cns.countAndSay(i));
	}
	}
	public String countAndSay(int n){
		String s = "1";
		while(--n>0){	//while(--n>0) → 9~1; while(n-->0) → 9~0
			StringBuilder sb = new StringBuilder();

			for(int j=0; j<s.length();j++){
				int count = 1;
				while((j+1)<s.length() && s.charAt(j)==s.charAt(j+1)){
					count++;
					j++;
				}
				sb.append(String.valueOf(count) + String.valueOf(s.charAt(j)));
			}
		s = sb.toString();	
		}
	return s;
	}
}