package pattern;


/**
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21
 */
public class pattern5
{
    public static void main()
    {
        int size=6,x=1;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(x++ +" ");
            }
            System.out.println();
        }
    }
}
