import java.util.Scanner;


public class Hunter51 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the first string");
		String a=in.next();
		System.out.println("enter the second string");
		String b=in.next();
		int c=Integer.parseInt(a);
		int d=Integer.parseInt(b);
		int answer=c*d;
		String result=String.valueOf(answer);
		System.out.println("answer is : "+result);

	}

}
