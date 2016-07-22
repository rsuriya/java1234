
public class Sample {
	public void fact(int x)
	{if(x!=0)
	{ if(x%2==0){
			System.out.println("the number is even");
		}
		else
		{
			System.out.println("the number is odd");
		}
	}
	else
	{
		System.out.println("invalid");
	}
	
		
			}
	public static void main(String[] args) {
	int a;
	a=Integer.parseInt(args[0]);
	Sample factorial=new Sample();
	factorial.fact(a);
	

	}

}
			

	


