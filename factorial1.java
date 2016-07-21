
public class Ass06 {
	public int fact(int x)
	{int result=1,i=1;
	if(x<=1)
	{return 1;}
		else
		{
		do
			{result=result*i;
			i++;
			}
			while(i<=x);
		return result;
			}}
	public static void main(String[] args) {
	int a;
	a=Integer.parseInt(args[0]);
	Ass06 factorial=new Ass06();
	int out=factorial.fact(a);
	System.out.println("the factorial is="+out);

	}

}
