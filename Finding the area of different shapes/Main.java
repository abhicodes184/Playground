
import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
       int s=sc.nextInt();
       int l=1,b=1,r=1;
       if(s>1 && s<4)
       { l=sc.nextInt();
        b=sc.nextInt();}
       else
       {r=sc.nextInt();
       }
       switch(s)
       { case 1:
             System.out.println(r*r);
             break;
         case 2:
             System.out.println(l*b);
             break;
        case 3:
             System.out.println(0.5*(l*b));
             break;
        case 4:
             System.out.println(3.14*r*r);
             break;
       }
    }}