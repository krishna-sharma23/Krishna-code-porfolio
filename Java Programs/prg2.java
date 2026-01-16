//pallindrome
import java.util.*;
public class prg2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to be checked");
        String str = sc.nextLine();
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
        if(reverse.equals(str)){
            System.out.println("The word is a pallindrome");
        }
        else{
            System.out.println("The word is not a pallindrome");
        }
    }
}