import java.util.Stack;

//Q. Next Greater Element
/**How to solve
 * move in the array from right to left
 * store the greatest num in a stack
 * then checking the topmost value  i.e. just greater than the element
 * if stack is empty no greater value -1
   */
public class prg16{
    public static void main(String[] args){
        display obj = new display();
        int[] arr = {4, 5, 2, 25};
        int[] next = new int[arr.length];
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = arr.length - 1; i >= 0; i--){
            while(!stack.empty() && stack.peek() < arr[i]){
                stack.pop();
            }
            if(stack.empty()){
                next[i] = -1;
            }
            else{
                next[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        obj.displayint(next);
    }
}