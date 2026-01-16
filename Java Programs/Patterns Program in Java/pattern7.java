package pattern;


/**
          1 
        2 1 2 
      3 2 1 2 3 
    4 3 2 1 2 3 4 
  5 4 3 2 1 2 3 4 5 
6 5 4 3 2 1 2 3 4 5 6 
 */
public class pattern7
{
    public static void main()
    {
        int size=6,x=1,a=0;
        for(int i=0;i<=size;i++)
        {
            for(int j=0;j<=size-i-1;j++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<i*2-1;j++)
            {
                System.out.print(" "+x);
                if(x>1 && a==0)
                    x--;
                else if(x>=1)
                {
                    x++;
                }
                if(x==1)
                a=1;
            }
            a=0;
            System.out.println();
        }
    }
}
