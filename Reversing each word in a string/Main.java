import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    StringBuilder str=new StringBuilder(s);
    int n=str.length(),sindex=0,eindex=0;
    StringBuilder C=new StringBuilder("");
    for(int i=0;i<n;i++)
    {if(str.charAt(i)==' ')
     {eindex=i-1;
      for(int j=eindex;j>=sindex;j--)
      {C.append(str.charAt(j));
      }
      C.append(" ");
      sindex=i+1;
     }
     else
      if(i==(n-1))
     {eindex=i;
      for(int j=eindex;j>=sindex;j--)
      {C.append(str.charAt(j));
      }
     }
    }
    System.out.print(C);
  }
}
