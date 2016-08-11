
public class Pro15 {

	public static void main(String[] args) {
		int[] a={31,15,14,7,2,8};
		String[] b=new String[a.length];
		int c=0;
		String d="";
		int e=0;
		int n=0;
		String[] str;
		int count=0;
		int[] arr=new int[a.length];
		int o=0;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{	d="";
			while(a[i]!=0)
			{
				c=a[i]%2;
				e=a[i]/2;
				d=String.valueOf(c)+d;
				a[i]=e;
			}
			b[n]=d;
			n++;
			//System.out.println(d);
		}
		for(int j=0;j<b.length;j++)
		{
			str=b[j].split("");
			for(int k=0;k<str.length;k++)
				
			{	
				//System.out.println("str" +str[k]);
				if(str[k].equals("1"))
				{
					count++;
				}
				
			}
			
			arr[o]=count;
			o++;
			count=0;
			//System.out.println("count"+count);
			
		}
		for(int m=0;m<arr.length;m++)
		{
			//System.out.println("arr" +arr[m]);
			for(int g=m+1;g<arr.length;g++)
			{
				if(arr[m]<arr[g])
				{
					temp=arr[g];
					arr[g]=arr[m];
					arr[m]=temp;
				}
				
			}
			System.out.println(arr[m]);
		}
			
		}
		
		
	}


