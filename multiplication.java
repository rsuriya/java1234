import java.util.Scanner;



public class Sample {

	public static void main(String[] args) {
		int a;
		
		int c;
		
		int d;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the number");
	a=in.nextInt();

	for(c=1;c<=10;c++)
	{
		d=c*a;
		System.out.println(a+"*"+c+"="+d);
	}
	
	
}


}
