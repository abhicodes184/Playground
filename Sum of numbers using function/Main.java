import java.util.Scanner;
class Main{
	public static int sum(int t)
   { int s=0;
     for(int i=1;i<=t;i++)
    {s=s+i;
    }
    return s;
   }
	public static void main (String[] args)
    {
	 Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int t=sum(n);
      System.out.println(t);
    } 
}