import java.util.Scanner;
//1234=1^2+2^3+3^4+4^1;
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int remainder;
		int[] array=new int[30];
		int n=0;
		int output=0;
		Scanner in=new  Scanner(System.in);
		System.out.println("enter the number");
		number=in.nextInt();
		while(number!=0)
		{
			remainder=number%10;
			array[n]=remainder;
			n++;
			number=number/10;
		}
		for(int i=n-1;i>=0;i--)
		{
			if(i==0)
			{
				output=(int)(output+Math.pow(array[i],array[n-1]));
			}
			else
			{
			output=(int)(output+Math.pow(array[i], array[i-1]));
			}
		}
		System.out.println(output);

	}

}
