import java.util.Scanner;


public class CountTwos {

	public static void main(String[] args) {
		int a;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the range");
		a=in.nextInt();
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(i%2==0)
			{
				count++;
			}
		}
		System.out.println("output : "+count);

	}

}
