import java.util.Scanner;


public class Hunter55 {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("enter the number to be rotated");
	int a=in.nextInt();
	System.out.println("enter the number of digits to be rotated:");
	int b=in.nextInt();
	String e=String.valueOf(a);
	int c=1;
	int d=0;
	for(int i=0;i<e.length()-b;i++)
	{
		c=c*10;
	}
	d=a/c;
	StringBuffer sbuf=new StringBuffer(e);
	sbuf.delete(0, b);
	String g=String.valueOf(d);
	
	sbuf.append(g);
	String h=new String(sbuf);
	System.out.println(h);

	}

}