//removing duplicates
public class prg5{
    public static void main(String[] args){
        int[] arr = {1, 12, 3, 4, 5, 5, 6, 1, 2, 3};
        String st = "";
        for(int i = 0; i < arr.length; i++){
            String temp = ","+arr[i]+",";
            if(st.indexOf(temp) == -1){
                st += temp;
                System.out.print(arr[i]+" ");
            }
        }
    }
}