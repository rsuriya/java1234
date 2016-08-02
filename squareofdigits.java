import java.util.Scanner;


public class SquareOfDigits {

	public static void main(String[] args) {
		int a;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number : ");
		a=in.nextInt();
		int b=0;
		int c=0;
		int d=0;
		while(a!=0)
		{
			b=a%10;
			c=b*b;
			d=d+c;
			a=a/10;
		}
		System.out.println("output : "+d);

	}

}
