package pattern;


/**
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
0 1 0 1 0 1 
 */
public class pattern6
{
    public static void main()
    {
        int size=6,x=1,a=0;
        for(int i=0;i<size;i++)
        {
            if(x==0)
            a=1;
            else
            a=0;
            for(int j=0;j<=i;j++)
            {
                System.out.print(x+" ");
                if(x==1)
                x=0;
                else if(x==0)
                x=1;
            }
            if(a==1)
            x=1;
            System.out.println();
        }
    }
}
