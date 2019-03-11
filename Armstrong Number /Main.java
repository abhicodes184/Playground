import java.util.Scanner;
import java.lang.Math; 
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0,k,p=1;
        int c=0,t;
        k=n;
        while(n>0)
        {n=n/10;
         c++;
        }
        n=k;
        while(k>0)
        {t=k%10;
         for(int i=0;i<c;i++)
         {p=p*t;
         }
        s=s+p;
         k=k/10;
         p=1;
        }
        if(n==s)
         System.out.println("Armstrong Number");
        else
          System.out.println("Not a Armstrong Number");
	}
}