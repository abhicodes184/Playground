import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),j,c=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {a[i]=sc.nextInt();
        }
      j=n-1;
      for(int i=0;i<n;i++)
      {
       if(a[i]!=a[j])
       {  c=1;}
       j--;
      }
       if(c==1)
       System.out.print("No");
       else
        System.out.print("Yes"); 
       
    }
}