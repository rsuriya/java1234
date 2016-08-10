import java.util.Scanner;


public class Hunter24 {

	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6};
		int sum;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number to be checked");
		int b=in.nextInt();
		int c=0;
		int d=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			sum=a[i]+a[j];
				if(sum==b)
				{
					c=a[i];
					d=a[j];
				}
			}
		}
		System.out.println(c+" "+d);

	}

}
