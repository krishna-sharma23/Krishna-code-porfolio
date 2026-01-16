//Count Frequency of staracter in a Sentenc
import java.util.*;
public class prg12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> counter = new HashMap<String, Integer>();
        System.out.println("Enter the sentence");
        String sen = sc.nextLine();
        int temp = 0;
        for(String st : sen.split(" ")){
            if(counter.containsKey(st)){
                temp = counter.get(st);
                temp++;
                counter.put(st, temp);
            }
            else{
                temp = 1;
                counter.put(st, temp);
            }
        }
        System.out.println(counter);
        sc.close();
    }
}