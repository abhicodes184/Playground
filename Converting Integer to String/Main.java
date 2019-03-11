import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(),k=0;
    if(n<0)
    {n=-n;
      k=1;}
    int temp = n;
    int count = 0;
    while(n > 0)
    {
        count++;
        n = n/10;
    }
    if(k==1)
      count++;
    char str[] = new char[count];
    count = count - 1;
    while(temp > 0)
    {
      char ch = (char)((temp % 10) + '0');
      str[count] = ch;
      temp /= 10;
      --count;   
    }
    if(k==1)
      str[count]='-';
    System.out.print(str);
  }
}