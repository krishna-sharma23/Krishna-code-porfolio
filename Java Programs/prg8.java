//Search for an element in an unsorted array
import java.util.*;
public class prg8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 3, 2, 4, 6, 5, 7, 5, 8, 9, 5, 0};
        System.out.println("Enter the number to be searched");
        int src = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < arr.length; i++){
            if(src == arr[i]){
                System.out.println("Found at: " + i);
                found = true;
            }
        }
        if(!found) System.out.println("Number not found");
        sc.close();
    }
}