import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    System.out.print(fac(num));
  }
    public static int fac(int n)
    {if(n==1)
    {return 1;
    }
     return(n*fac(n-1));
    }
}