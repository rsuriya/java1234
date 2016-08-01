import java.util.Scanner;


public class SumOfLast {

	public static void main(String[] args) {
		int a;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		a=in.nextInt();
		int sum=0;
		int b=0;
		int k=0;
		int n=0;
		int d=a;
		while(a!=0)
		{
			b=a%10;
			k++;
			a=a/10;
		}
		int[] arr=new int[k];
		
		while(d!=0)
		{
			b=d%10;
			arr[n]=b;
			n++;
			d=d/10;
		}
		sum=arr[0]+arr[k-1];
		System.out.println("sum = "+sum);
		
	}

}
