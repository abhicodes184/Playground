import java.util.Scanner;
import java.lang.Math;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t,c=0,o;
        double p,k;
        t=n%10;
        o=n;
        while(n>0)
        {n=n/10;
         c++;
        }
        
        c--;
        k=Math.pow(10, c);
        p=o/k;
        c=(int) p;
        System.out.println(c+t);
      
	}
}