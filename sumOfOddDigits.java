import java.util.Scanner;


public class OddDigits {
	public int Odd()
	{
		int a;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number : ");
		a=in.nextInt();
		int b=0;
		int c=0;
		int d=0;
		int sum=0;
		while(a!=0)
		{
			b=a%10;
			if(b%2!=0)
			{
				sum=sum+b;
			}
			a=a/10;
		}
		if(sum%2!=0)
		{
			return sum;
		}
		else
		{
			return -1;
		}
	}

	public static void main(String[] args) {
		OddDigits obj=new OddDigits();
		System.out.println("output :"+obj.Odd());
	}

}
