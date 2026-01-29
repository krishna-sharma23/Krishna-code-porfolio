package stack;
import java.util.*;

public class StackusingQueue {
	private Queue<Integer> queue;
	
	StackusingQueue(){
		queue = new LinkedList<>();
	}
	
	void push(int val) {
		int size = queue.size();
		queue.offer(val);
		
		for(int i = 0; i < size; i++) {
			queue.offer(queue.poll());
			System.out.println(queue);
		}
	}
	
	int pop() {
		if(queue.isEmpty()) throw new EmptyStackException();
		
		return queue.poll();
	}
	
	int top() {
		if(queue.isEmpty()) throw new EmptyStackException();
		
		return queue.peek();
	}
	
	boolean isEmpty() {
		return queue.isEmpty();
	}
	
	void display() {
		System.out.println(queue);
	}
}
