import java.util.Scanner;
class Main{
	public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=1;
        for(int i=1;i<=n;i++)
        {s=s*i;
        }
        System.out.println(s);
	}
}