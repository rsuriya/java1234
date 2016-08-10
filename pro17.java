import java.util.Scanner;


public class Pro17 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		int num=in.nextInt();
		int a=0;
		int b=0;
		int c=1;
		int d=0;
		int count=0;
		for(int i=1;i<num;i++)
		{	b=i;
			d=i;
			c=c*b;
			
			while(d!=0)
			{
				a=d%10;
				d=d/10;
				c=c*a;
				
			}	
			if(c==num)
			{
				count=1;
			}
			c=1;
			
		}
		if(count==1)
		{
			System.out.println("seed is : "+num);
		}
		else
		{
			System.out.println("no seed");
		}
		
	}

}