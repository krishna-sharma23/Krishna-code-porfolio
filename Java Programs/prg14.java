//Reversing string from stack
import java.util.*;
public class prg14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to reversed");
        String str = sc.nextLine();
        String[] arr = new String[str.length()];
        String rev = "";
        int top = -1;
        for(int i = 0; i < str.length(); i++){
            top++;
            arr[top] = ""+str.charAt(i);
        }
        while(top >= 0){
            rev += arr[top];
            top --;
        }
        System.out.println(rev);
        sc.close();
    }
}