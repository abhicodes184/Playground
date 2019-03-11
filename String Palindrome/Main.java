import java.util.Scanner;
class Main{
    public static void main(String args[]) {
    
        
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";
        
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
      if(str.equals(reverse)==true)
       System.out.println("Yes");
      else
       System.out.println("No"); 
        
    } 
}