package pattern;


/**
     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *
 */
public class pattern9
{
    public static void main()
    {
        int size=6;
        for(int i=1;i<=size;i++)
        {
            for(int j=0;j<size-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=size-1;i>0;i--)
        {
            for(int j=size-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int j=i*2-1;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
