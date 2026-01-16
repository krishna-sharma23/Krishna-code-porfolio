package pattern;


/**
     ******
    ******
   ******
  ******
 ******
******
 */
public class pattern8
{
    public static void main()
    {
        int size=6;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<size;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
