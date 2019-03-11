import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
        int s=0;
         for(int n=1;n<=t;n=n+1)
           s=s+n;
           System.out.println(s);
	}
}