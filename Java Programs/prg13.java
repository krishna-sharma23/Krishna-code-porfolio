// Find First Non-Repeating Character in a String
import java.util.*;
public class prg13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Character, Integer> counter = new LinkedHashMap<Character, Integer>();
        System.out.print("Enter the Sentence: ");
        String sen = sc.nextLine();
        for(int i = 0; i < sen.length(); i++){
            char ch = sen.charAt(i);
            if(counter.containsKey(ch)){
                counter.put(ch, counter.get(ch) + 1);
            }
            else{
                counter.put(ch, 1);
            }
        }
        for(char c : counter.keySet()){
            if(counter.get(c) == 1){
                System.out.println("The First Non-Repeating Character is: " + c);
                break;
            }
        }
    }
}