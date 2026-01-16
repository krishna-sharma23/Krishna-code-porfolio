//Search for an Element
import java.util.*;

public class prg7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        String st = "";
        for(int i = 0; i < 5; i++){
            System.out.println("Enter the Word");
            st = sc.nextLine().toUpperCase();
            list.add(st);
        }
        System.out.println("Enter the Word to be searched");
        String src = sc.nextLine().toUpperCase();
        for(int i = 0; i < 5; i++){
            st = list.get(i);
            if(st.equals(src)){
                System.out.println("Found at: " + i);
                break;
            }
        }
        sc.close();
    }
}