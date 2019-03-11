import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=1,t,p=0,k;
        k=n;
        while(n>0)
        {t=n%10;
         n=n/10;
        for(int i=1;i<=t;i++)
        {s=s*i;
        }
         p=p+s;
         s=1;
        }
        if(k==p)
        System.out.println("Yes");
        else
        System.out.println("No");
          
	}
}