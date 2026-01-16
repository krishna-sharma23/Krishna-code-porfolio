//Count Frequency of character in a Sentenc
import java.util.*;
public class prg11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> counter = new HashMap<Character, Integer>();
        System.out.println("Enter the sentence");
        String sen = sc.nextLine();
        int temp= 0;
        for(int i = 0; i < sen.length(); i++){
            char ch = sen.charAt(i);
            if(counter.containsKey(ch)){
                temp = counter.get(ch);
                temp++;
                counter.put(ch, temp);
            }
            else{
                temp = 1;
                counter.put(ch, temp);
            }
        }
        for(char c : counter.keySet()){
            System.out.println(c + " : " + counter.get(c));
        }
    }
}