import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt(),k=0;
       int a[]=new int[n];
       int b[]=new int[n];
       for(int i=0;i<n;i++)
       {a[i]=sc.nextInt();
       }
        for(int i=0;i<n;i++)
        {if(a[i]!=0)
        {b[k]=a[i];
        k++;
        }
        }
        for(int i=k;i<n;i++)
        {b[i]=0;
        }
        for(int i=0;i<n;i++)
        {System.out.print(b[i]+" ");
        }
    }
}