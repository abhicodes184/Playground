import java.util.Scanner;
public class Main
{
    
    	public static void main(String args[])
  {
       Scanner sc = new Scanner(System.in);
       
       int arr_size = sc.nextInt(),t=0,s=0;
       int arr[] = new int[arr_size];
       for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
       }
       for(int index = 0; index < arr_size; index++)
       {if(arr[index]==1)
       {s++;
       }
        else
        {if(t<s)
          t=s;
         s=0;
        }
       }
      System.out.println(t);
  }
    
}