import java.util.Scanner;
class Main{
    public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    StringBuilder sb_l = new StringBuilder(str); // creating a copy of the string for left rotation
    
    int str_len = sb_l.length();
    int no_of_rotations = (str_len/2);
    Left_rotate_str(str_len,sb_l,no_of_rotations);
  }
  public static void Left_rotate_str(int str_len,StringBuilder sb_l,int no_of_rotations)
  {
    int index;
    for ( int rotation = 1 ; rotation <= no_of_rotations ; rotation++ )
    {
      char temp = sb_l.charAt(0);       // setting first character to temp
      for( index = 1; index <= str_len-1; index++ )
      {
        sb_l.setCharAt(index - 1,sb_l.charAt(index)); // shifting other character from right to left
      }
      sb_l.setCharAt(index-1, temp);     // setting last character to temp
    }
    int c=str_len-1;
    for(int i=0;i<str_len;i++)
    {
     for(int j=0;j<c;j++)
     {System.out.print(" ");
     }
     c--;
     for(int k=0;k<=i;k++)
     { System.out.print(sb_l.charAt(k));
     }
     System.out.print("\n");
    }
  }
}