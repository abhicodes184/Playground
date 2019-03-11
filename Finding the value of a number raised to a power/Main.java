import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int b=sc.nextInt();
       int e=sc.nextInt();
       System.out.println(power(b,e));
    }
     public static int power(int b,int e)
     {int c=1;
      while(e>0)
      {c=c*b;
       e--;
      }
      return c;
     }
}