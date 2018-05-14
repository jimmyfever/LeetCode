import java.util.Queue;
import java.util.LinkedList;

public class ImplementStackUsingQueues225 {
	
	

	public static void main(String[] args){
		
	}	
	public class MyStack{
		private Queue<Integer> q = new LinkedList<Integer>();

	public void push(int x){
		q.add(x);
		for(int i=1; i<q.size(); i++){	//rotate the queue
			q.add(q.poll());
		}
	}
	public void pop(){
		q.poll();
	}
	public int top(){
		return q.peek();
	}
	public boolean empty(){
		return q.isEmpty();
	}
	}
}