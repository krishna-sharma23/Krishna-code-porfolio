//Next Greater Element
public class prg15{
    public static void main(String[] args){
        display obj = new display();
        int[] arr = {4, 5, 2, 25};
        int[] next = new int[arr.length];
        int top = -1;
        int x = 0;
        for(int i = 0; i < arr.length; i++){
            top++;
            int j = i; 
            for(;j < arr.length; j++){
                if(j != arr.length){
                    if(arr[j] > arr[i]){
                         x = arr[j];
                         break;
                    }
                    else{
                        x = -1;
                    }
                }
                else{
                    x = -1;
                }
            }
            next[top] = x;
        }
        obj.displayint(next);
    }
}