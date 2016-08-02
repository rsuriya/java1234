import java.util.Scanner;


public class FindN {
	boolean Value()
	{
	int[] arr={56,34,9,54,88,12,14,90};
	int a;
	int count=0;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the number to be checked");
	a=in.nextInt();
	for(int i=0;i<4;i++)
	{
		if(arr[i]==a)
		{
			count=1;
		}
		
	}
		if(count==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		
	
	public static void main(String[] args) {
		FindN obj=new FindN();
		System.out.println("output = "+obj.Value());

	}

}