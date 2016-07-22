import java.util.Scanner;



public class Sample {

	public static void main(String[] args) {
		int a;
		int count=0;
		int b;
		Scanner in= new Scanner(System.in);
		System.out.println("enter the numbers");
		a=in.nextInt();
		b=in.nextInt();
		int k=0;
		
for(int i=a;i<=b;i++)
	{	count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0){count++;}
			
			}
		if(count==2)
		{System.out.println(i);
			k++;}
		else{continue;}
		
	}System.out.println(k);
	
}


}