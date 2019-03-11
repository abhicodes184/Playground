import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    String str2 =scan.nextLine();
     
    str1=str1.concat(str1);
    if(str1.contains(str2)==true)
      System.out.print("Yes");
    else
       System.out.print("No");
    }
}