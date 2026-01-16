import java.util.*;
class movinga
{
    char arr[][];
    int size;
    movinga()
    {
        Random rand = new Random();
        Scanner sc=new Scanner(System.in);
        char c;
        size=9;
        arr=new char[size][size];
        int x=0,y=0,n=0,m=0,count=0;
        x=rand.nextInt(8);
        y=rand.nextInt(8);
        m=rand.nextInt(8);
        n=rand.nextInt(8);
        if(m==x && n==y && m!=n){
            m=n;
        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                arr[i][j]=' ';
            }
        }
        arr[x][y]='A';
        arr[m][n]='a';
        display();
            while(true)
            {
                System.out.println("Enter the character");
                c=sc.nextLine().charAt(0);
                if(c=='e'){
                    System.exit(0);
                    System.out.println("Sucessfully exited");
                }
                else if(c=='d')
                {
                    arr[x][y]=' '; 
                    y++;
                    if(y>size-1)
                    {
                        y=0;
                    }
                }
                else if(c=='a')
                {
                    arr[x][y]=' ';
                    y--;
                    if(y<0)
                    {
                        y=size-1;
                    }
                }
                else if(c=='w')
                {
                arr[x][y]=' ';
                x--;
                if(x<0)
                {
                     x=size-1;
                }
                }
                else if(c=='s')
                {
                    arr[x][y]=' ';
                    x++;
                    if(x>size-1)
                    {
                        x=0;
                    }
                }
                if(m==x && n==y){
                    m=rand.nextInt(8);
                    n=rand.nextInt(8);
                    arr[m][n]='a';
                    count++;
                }
                arr[x][y]='A';
                display();
        }
        }
    void display()
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        new movinga();
    }
}