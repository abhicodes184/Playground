import java.util.Scanner;
class Main
{
  public static void main(String args[])
  { Scanner sc=new Scanner(System.in);
    String str=sc.nextLine(); 
      int k=0;
       String arr[] = str.split(" ");
       System.out.print(arr[0]+" ");
       for(int index = 1; index < arr.length; index++)
       { for(int j = 0;j < index; j++)
       { if(arr[index].equals(arr[j])== true)
         {k=1;}
       }
        if(k==0)
        {String res = arr[index];
           System.out.print(res+" ");}
        k=0;
       }
  }
}