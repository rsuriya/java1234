
public class Pro52 {
	public boolean square(int s1,int s11,int s2,int s22,int s3,int s33,int s4,int s44)
	{ int d1;
	int d2;
	int d3;
	int d4;
		d1=Math.abs(s11-s22);
		d2=Math.abs(s2-s3);
		d3=Math.abs(s33-s44);
		d4=Math.abs(s4-s1);
		if(d1==d2&&d1==d3&&d1==d4)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		
		Pro52 obj=new Pro52();
		if(obj.square(10, 10, 10, 20, 20, 20, 20,10))
		{
			System.out.println("it is square");
		}
		else
		{
			System.out.println("not a square");
		}
	}

}
