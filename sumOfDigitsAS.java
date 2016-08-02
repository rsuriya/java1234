import java.util.Scanner;

//1234=1+(1+2)=(1+2+3)+(1+2+3+4)
public class SumOfDigitsAs {

	public static void main(String[] args) {
		int a;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		a=in.nextInt();
		int b=0;
		int c=a;
		int sum=0;
		while(c!=0)
		{	a=c;
			while(a!=0)
			
			{
				b=a%10;
				sum=sum+b;
				a=a/10;
			}
			c=c/10;
		}
		System.out.println("output :"+sum);
	}

}
