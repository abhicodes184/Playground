import java.util.Scanner;
class Main
{
    public static void main(String args[])
    { 
       Scanner sc=new Scanner(System.in);
       int r=sc.nextInt();
       int c=sc.nextInt();
       int p=r,k=1;
       for(int i=0;i<r;i++)
       {System.out.print(p);
       }
      System.out.print("\n");
       for(int i=1;i<r;i++)
       {for(k=1;k<=i;k++)
       {System.out.print(p);
        p--;
       }
        p=r;
        for(int j=k;j<=c;j++)
        {System.out.print(r-i);
        }
        System.out.print("\n");
       }
}}