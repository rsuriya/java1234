import java.util.Scanner;



public class Sample {

	public static void main(String[] args) {
		int a;
		int b;
		int temp;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		a=in.nextInt();
		b=in.nextInt();
	
	temp=a;
	a=b;
	b=temp;
	System.out.println("a="+a);
	System.out.println("b="+b);
	
	
}


}
