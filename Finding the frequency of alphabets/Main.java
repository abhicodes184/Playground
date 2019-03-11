import java.util.Scanner;
class Main{
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     StringBuilder str=new StringBuilder(s);
     int n=str.length();
     int stat[]=new int[26],offset=0;
     for(int idx = 0;idx<n;idx++ )
     {
      if(str.charAt(idx) >= 'a' && str.charAt(idx) <= 'z')
      {
        offset = str.charAt(idx) - 'a';
        stat[offset]++;
      }
      else if(str.charAt(idx) >= 'A' && str.charAt(idx) <= 'Z')
      {
        offset = str.charAt(idx) - 'A';
        stat[offset]++;
        char p= (char) ('a' + offset);
        str.setCharAt(idx,p);
      }
      }
     for(int i=0;i<str.length();i++)
     {if(stat[str.charAt(i)-'a']!=0)
     {System.out.print(str.charAt(i)+""+stat[str.charAt(i)-'a']+" ");
      stat[str.charAt(i)-'a']=0;
     }
     }
    } 
}