
public class malayal {


	public static void main(String[] args){
		//int i,j;
	//char ch;
	String str=args[0];
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]==ch[j])
			{
				ch[i]='$';
			
		}
	}
	}
	for(int i=ch.length-1;i>=0;i--)
	{
		if(ch[i]!='$')
		{
			System.out.print(ch[i]);
		}
	}
	}

	

}
