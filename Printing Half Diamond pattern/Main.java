import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=1;
        for(int i=1;i<=n;i++)
        {for(int j=i;j<=n-1;j++)
         {System.out.print(" ");
         }
         for(int j=1;j<=k;j++)
         { System.out.print("*");
         }
         k=k+2;
         System.out.print("\n");
        }
	}
}