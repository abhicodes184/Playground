import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        { ar[i]=sc.nextInt();
        }
        int s1=sc.nextInt();
        int s2=sc.nextInt(),f1=-1,f2=-1;
        for(int i=0;i<n;i++)
        { if(ar[i]==s1)
           f1=i;
          if(ar[i]==s2)
            f2=i;
        }
         
        System.out.println(f1);
        System.out.println(f2);
      
        }
    
}