//Find second largest number
public class prg9{
    public static void main(String[] args){
        int[] arr = {1, 3, 2, 4, 6, 5, 7, 5, 9, 5, 8};
        int largest = 0, slargest = 0;
        for(int i = 0; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(slargest < arr[i] && slargest < largest && arr[i] != largest){
                slargest = arr[i];
            }
        }
        System.out.println("The second largest number is: " + slargest);
    }
}