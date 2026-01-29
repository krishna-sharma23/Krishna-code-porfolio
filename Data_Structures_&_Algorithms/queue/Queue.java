package queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Queue {
    private int[] arr;
    private int start;
    private int end;
    
    public Queue() {
        arr = new int[5];
        start = 0;
        end = 0;
    }
    
    public void enqueue(int val) {  // Standard name
        if(end == arr.length) {
            extend();
        }
        arr[end++] = val;
    }
    
    public int dequeue() {  // Standard name
        if(isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int value = arr[start];
        start++;
        
        // Reset when queue becomes empty to reuse space
        if(isEmpty()) {
            start = 0;
            end = 0;
        }
        
        return value;
    }
    
    public int peek() {
        if(isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return arr[start];
    }
    
    public boolean isEmpty() {
        return start == end;
    }
    
    public int size() {
        return end - start;
    }
    
    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue (front to back):");
        for(int i = start; i < end; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("*****************");
    }
    
    private void extend() {
        // Shift elements to beginning and double capacity
        int currentSize = end - start;
        int[] newArr = new int[arr.length * 2];
        System.arraycopy(arr, start, newArr, 0, currentSize);
        arr = newArr;
        start = 0;
        end = currentSize;
    }
}