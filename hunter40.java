import java.util.Scanner;


public class Hunter40{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		int a=in.nextInt();
		int sum=0;
		int b=0;
		while(a!=0)
		{
			b=a%10;
			sum=sum+b;
			a=a/10;
		}
		System.out.println("sum : "+sum);
		String d=String.valueOf(sum);
		StringBuffer sbuf=new StringBuffer(d);
		sbuf.reverse();
		String str1=new String(sbuf);
		if(d.equals(str1))
		{
			System.out.println("pallindrome");
		}
		else
		{
			System.out.println("not a pallindrome");
		}
		
	}

}
