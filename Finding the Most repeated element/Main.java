import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
       
       int arr_size = sc.nextInt(),t=0,c=1,k=0;
       int arr[] = new int[arr_size];
       for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
       }
      for(int index = 0; index < arr_size; index++)
      {for(int i =index+1; i < arr_size;i++)
      {if(arr[index]==arr[i])
        c++;
      }
       if(t<c)
       { t=c;
         k=index;}
       c=0;
      }
     System.out.println(arr[k]);
  }
}