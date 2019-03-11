import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=1;
        k=n;
        for(int i=1;i<=n;i++)
        {
         for(int j=i;j<=n;j++)
          {System.out.print(k);
            k--;
          }
          System.out.print("\n");
          k=n-i;
        }
	}
}