import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int t=max(n1,n2);
        if(t>n3)
         System.out.println(t);
        else
          System.out.println(n3);
         
        
	}
   public static int max(int n1,int n2)
   {if(n1>n2)
    {return n1;
    }
    else
      return n2;
   }
}