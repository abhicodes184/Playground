import java.util.Scanner;
import java.lang.Math;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t,c=0,o;
        double p,k;
        
        o=n;
        while(n>0)
        {n=n/10;
         c++;
        }
        
        c=c-2;
        k=Math.pow(10, c);
        p=o/k;
        c=(int) p;
        c=c%10;
        System.out.println(c);
      
	}
}