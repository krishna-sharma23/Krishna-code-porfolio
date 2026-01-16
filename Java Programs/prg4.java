//vowel couonter
import java.util.*;
public class prg4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word/Sentence");
        String str = sc.nextLine().toLowerCase();
        String vowel = "aeiou";
        int counter = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(vowel.indexOf(str.charAt(i)) != -1){
                counter++;
            }
        }
        System.out.println("The number of vowels are: "+ counter);
    }
}