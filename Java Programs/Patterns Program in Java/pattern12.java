package pattern;


/**
     *
    * *
   *   *
  *     *
 *       *
***********
 */
public class pattern12
{
    public static void main()
    {
        int size=6;
        for(int i=1;i<=size;i++)
        {
            for(int j=1;j<=size-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<i*2;j++)
            {
                if(j==1||j==(i*2)-1&&i<size)
                System.out.print("*");
                else if(i<size)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
