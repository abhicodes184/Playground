import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int t=gcd(n1,n2);
        int k=gcd(t,n3);
         System.out.println(k);
      }
   public static int gcd(int n1,int n2)
   {int gcd_min,k;
    if(n1>n2)
    {gcd_min=n2;}
    else
    {gcd_min=n1;}
    while(gcd_min>=1)
    {if(n1%gcd_min==0 && n2%gcd_min==0)
      {break;
      }
    else
    {gcd_min--;}
   }
    return gcd_min;
	}
}