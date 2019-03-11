import java.util.Scanner;
class Main{
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int str_len = str.length(),idx=0,dp=0;
        float n = 0.0f;
        while(idx < str_len)
        {
           if((str.charAt(idx) >= 48) && (str.charAt(idx) <= 57))
           {
            n = (n * 10) + (str.charAt(idx) - 48);
            idx++;
           }
          else
          {dp=str_len-idx-1;
           idx++;
          }
        }
        while(dp>0)
        { n=n/10;
          dp--;}
        System.out.print(n);
	}
}