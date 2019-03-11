import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String str2 = in.nextLine();
    StringBuilder sb = new StringBuilder(str); 
    StringBuilder sb2 = new StringBuilder(str2); 
    StringBuilder sb3 = new StringBuilder("");
    int n = sb.length();
    int n2=sb2.length();
    for(int i=0;i<n;i++)
    {int c=0;
     for(int j=0;j<n2;j++)
     {if(sb.charAt(i)==sb2.charAt(j))
      c=1;
     }
     if(c==0 || sb.charAt(i)==' ')
     {sb3.append(sb.charAt(i));
     }
     c=0;
    }
     System.out.print(sb3);
  }
     
     
  
}