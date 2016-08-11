import java.util.Scanner;


public class Hunter50 {

	public static void main(String[] args) {
		Scanner  in=new Scanner(System.in);
		System.out.println("enter the dividend");
		int a=in.nextInt();
		System.out.println("enter the divisor");
		int b=in.nextInt();
		int count=0;
		int sum=0;
		while(sum<a)
		{
			if(b==a)
			{	sum=a;
				count=1;
				break;
			}
			else
			{
				sum=sum+b;
				count++;
			}
		}
		int remainder = a-sum;
		System.out.println("quotient : "+count+ " remainder : "+remainder);
		
		

	}

}
