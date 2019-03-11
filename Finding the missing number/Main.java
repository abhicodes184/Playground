import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {a[i]=sc.nextInt();
        }
        for(int i=1;i<=n;i++)
       {for(int j=0;j<n;j++)
       {if(i==a[j])
         c=1;
       }
        if(c==0)
          System.out.print(i);
        c=0;
       }
    }
}