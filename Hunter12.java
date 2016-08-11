import java.util.Scanner;


public class Hunter12 {

	public static void main(String[] args) {
		int[] a=new int[50];
		Scanner in=new Scanner(System.in);
		int temp=0;
		System.out.println("enter the heights one by one");
		for(int i=0;i<50;i++)
		{
			a[i]=in.nextInt();
			
		}
		System.out.println("enter the element to find");
		int q=in.nextInt();
		for(int j=0;j<a.length;j++)
		{//System.out.println(a[j]);
			for(int k=j+1;k<a.length;k++)
			{
				if(a[j]<a[k])
				{
					temp=a[k];
					a[k]=a[j];
					a[j]=temp;
				}
			}
			//System.out.println(a[j]);
		}
		System.out.println(" kth tallest : "+a[q-1]);
	}

}
