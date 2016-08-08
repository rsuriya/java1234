import java.util.Scanner;


public class Hunter6 {

	public static void main(String[] args) {
		int[] a={1,2,3,4,5,4,6,6};
		int result=0;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					result=a[i];
					count=1;
					break;
				}
			}
			if(count==1)
			{
				break;
			}
		}
		System.out.println("the first repeated element is:"+result);
	}

}
