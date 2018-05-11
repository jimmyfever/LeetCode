import java.util.Stack;

public class ValidParentheses20 {
	
	// Constructor
	public ValidParentheses20(){
		
	}

	public static void main(String[] args){
		ValidParentheses20 vp = new ValidParentheses20();
		System.out.println(vp.isValid("(([]))({[]})"));
	}
	
	public boolean isValid(String s){
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
			System.out.println(stack);
		}
		return stack.isEmpty();
	}
}