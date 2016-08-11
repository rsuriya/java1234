import java.util.Scanner;


public class Hunter98 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the starting range");
		int a=in.nextInt();
		System.out.println("enter the ending range");
		int b=in.nextInt();
		System.out.println("enter the number to find");
		int c=in.nextInt();
		int count=0;
		int flag=0;
		for(int i=a;i<=b;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				int d=i;
				while(d!=0)
				{
					int e=d%10;
					if(e==c)
					{
						flag++;
					}
					d=d/10;
				}
			}
		}
		System.out.println("the output is : "+flag);
	}

}
