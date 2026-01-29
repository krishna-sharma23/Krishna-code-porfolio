package stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack{
	int[] arr = new int[5];
	int size = 5, top = -1;
	void add(int val) {
		if(top == size - 1) {
			extend();
		}
		arr[++top] = val;
	}
	
	int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
			return arr[top--];
	}
	
	int peek() {
		if(isEmpty()) throw new EmptyStackException();
		return arr[top];
	}
	
	boolean isEmpty() {
		return top < 0;
	}
	
	int size() {
		return top + 1;
	}
	public void display() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack (bottom to top):");
        for(int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("*****************");
    }
	void extend() {
		arr = Arrays.copyOf(arr, arr.length * 2);
	}
}