package pattern;

/**
*          *
**        **
***      ***
****    ****
*****  *****
************
************
*****  *****
****    ****
***      ***
**        **
*          * */
public class pattern10
{
    public static void main()
    {
        int size=6,a=0,b=10;
        for(int i=1;i<=size;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            for(int k=0;k<b;k++)
            {
                System.out.print(" ");
            }
            for(int l=0;l<i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
            b=b-2;
        }
        b=0;
        for(int i=size;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            for(int k=0;k<b;k++)
            {
                System.out.print(" ");
            }
            for(int l=0;l<i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
            b=b+2;
        }
    }
}
