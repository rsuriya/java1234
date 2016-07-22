import java.util.Scanner;



public class Sample {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d=0;
		int e;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the number");
	a=in.nextInt();
	e=a;
	while(a!=0)
	{
	b=a%10;
	c=b*b*b;
	d=d+c;
	a=a/10;