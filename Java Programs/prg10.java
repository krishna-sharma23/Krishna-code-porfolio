import java.util.HashMap;

//Frequency Counter
public class prg10{
    public static void main(String[] args){
        int[] nums = {1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 6, 7, 6, 5, 9};
        HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();
        int temp = 0;
        for(int num : nums){
            System.out.print(num + " ");
            if(counter.containsKey(num)){
                temp = counter.get(num);
                temp++;
                counter.put(num, temp);
            }
            else{
                counter.put(num, 1);
            }
        }
        System.out.println(counter);
    }
}