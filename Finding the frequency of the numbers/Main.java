import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
     int n1 = sc.nextInt();
     int k = sc.nextInt(),count=0;
     int list[] = new int[n1];
     for(int i = 0; i < n1; i++)
     {
      list[i] = sc.nextInt();
     }
      for(int i=1;i<=k;i++)
      {for(int j=0;j<n1;j++)
       {if(i==list[j])
         count++;
       }
       System.out.println(i+" "+count);
       count=0;
     }
    }
}