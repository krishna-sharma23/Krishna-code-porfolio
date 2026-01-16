//reverse a string
import java.util.*;
public class prg1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to be reversed");
        String str = sc.nextLine();
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        System.out.println("The reversed String is: "+ reverse);
    }
}