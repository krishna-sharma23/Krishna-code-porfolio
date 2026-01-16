package pattern;

/**
1 2 3 4 5 6 
 2 3 4 5 6 
  3 4 5 6 
   4 5 6 
    5 6 
     6 
    5 6 
   4 5 6 
  3 4 5 6 
 2 3 4 5 6 
1 2 3 4 5 6 
 */
public class pattern11
{
    public static void main()
    {
        int size=6,x=1;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=x;j<=size;j++)
            {
                System.out.print(j+" ");
            }
            x++;
            System.out.println();
        }
        x=x-1;
        for(int i=size-1;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=x;j<=size;j++)
            {
                System.out.print(j+" ");
            }
            x--;
            System.out.println();
        }
    }
}
