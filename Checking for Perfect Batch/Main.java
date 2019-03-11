import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[n/3];
    int t=0,k=0;
    for(int i=0;i<n;i++)
  {a[i]=sc.nextInt();
  }
    for(int i=0;i<n;i++)
    {b[k]=b[k]+a[i];
     t++;
     if(t==3)
     {t=0;
      k++;
     }
    }
    k=b[0];
    t=0;
    for(int i=0;i<n/3;i++)
    {if(k!=b[i])
      t=1;
     else
       t=0;
     }
     if(t==1)
       System.out.println("Not a Perfect Batch");
    else
      System.out.println("Perfect Batch");
    
}
  
}