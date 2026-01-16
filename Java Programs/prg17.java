import java.util.Stack;

//Evaluate Postfix Expression (Reverse Polish Notation)
/** How we are going to solve this problem
 * we will be having a string
 * we will moving from left to right
 * whenever we will find a operator we will store it and then pop two numbers 
 * after solving we will be pushing it back to the stack
   */
public class prg17{
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();
        String input = "231*+9-";
        int result = 0;
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isDigit(ch)){
                stack.push(Integer.parseInt(ch+""));
            }
            else if(ch == '+'|| ch == '-'|| ch == '*' || ch == '/'){
                if(stack.size() >=2){
                    int a = stack.pop();
                    int b = stack.pop();
                    switch(ch){
                        case '+':
                            result = b + a;
                            break;
                        case '-':
                            result = b - a;
                            break;
                        case '*':
                            result = b * a;
                            break;
                        case '/':
                            result = b / a;
                            break;
                    }
                    stack.push(result);                    
                }
                else{
                    System.out.println("The equation is not valid");
                    stack.clear();
                }
            }
            else{
                System.out.println("Invalid Character found");
                break;
            }
        }
        if(!stack.empty())System.out.println(stack.peek());
    }
}