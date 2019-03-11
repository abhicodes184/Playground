import java.util.Scanner;
class Main 
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[n/2+1],e=0;
    int c[]=new int[n/2+1],o=0;
    for(int i=0;i<n;i++)
    {a[i]=sc.nextInt();
     if(i%2!=0)
    {b[e]=a[i];
     e++;}
     else
     {c[o]=a[i];
     o++;}
    }
    int r=sc.nextInt();
    
    for(int i=0;i<r;i++)
    {int t1=b[0],j,t2=c[o-1],k;
     for(j=1;j<e;j++)
     {b[j-1]=b[j];
     }
     b[j-1]=t1;
     for(k=o-2;k>=0;k--)
     {c[k+1]=c[k];
     }
     c[0]=t2;
    }
    e=0;
    o=0;
    for(int i=0;i<n;i++)
    {if(i%2!=0)
    {a[i]=b[e];
     e++;}
     else
     {a[i]=c[o];
     o++;}
     System.out.print(a[i]+" ");
    }
}}