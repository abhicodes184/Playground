import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    String str2 =scan.nextLine();
      String str3 =scan.nextLine();
     System.out.println(str1.replace(str2,str3));
    
    }
}