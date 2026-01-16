package pattern;


/*    
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1  */ 
public class pattern4
{
    public static void main()
    {
        int size=10;
        for(int i=1;i<=size;i++)
        {
            for(int j=1;j<=size-i+1;j++)
            {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}