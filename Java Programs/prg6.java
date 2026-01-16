//Add and Remove Elements
import java.util.*;
public class prg6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        String st = "";
        for(int i = 0; i < 5; i++){
            System.out.println("Enter a word");
            st = sc.nextLine();
            list.add(st);
        }
        System.out.println(list);
        System.out.println();
        System.out.println("Enter the index of the word to be removed");
        int index = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the word to be removed");
        String r = sc.nextLine();
        list.remove(index);
        list.remove(r);
        System.out.println("Updated list is: " + list);
    }
}