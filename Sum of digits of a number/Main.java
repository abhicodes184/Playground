import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t,s=0;
        while(n>0)
        {t=n%10;
         s=s+t;
         n=n/10;
        }
        System.out.println(s);
	}
}