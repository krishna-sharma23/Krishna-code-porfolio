//largest number in an array
public class prg3{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9, 18, 7, 6, 5, 4};
        int largest = 0;
        for(int i = 0; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        System.out.println("The Largest number from the array is: "+largest);
    }
}