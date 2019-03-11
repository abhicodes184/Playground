import java.util.Scanner;
class Main
{   public static int square(int t)
   {return(t*t);
   }
	public static void main (String[] args)
    {
	 Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int t=square(n);
      System.out.println(t);
    } 
}