import java.util.Scanner;
class Main
{  public static int power(int a ,int p)
  {int t=1;
   for(int i=1;i<=p;i++)
  {t=t*a;
  }
   return t;
  }
   public static void main(String args[])
   {Scanner sc=new Scanner(System.in);
    int b=sc.nextInt();
    int e=sc.nextInt();
    int t=power(b,e);
    System.out.println(t);
   }
}