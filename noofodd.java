import java.util.Scanner;



public class Sample {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		int d=0;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the number");
	a=in.nextInt();
	b=in.nextInt();
	for(c=a;c<=b;c++)
	{
		if(c%2!=0)
		{
			d++;
		}
		else{continue;}
	}
	
	System.out.println(d);
}


}