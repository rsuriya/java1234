import java.util.Scanner;


public class Pro53 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the text: ");
		String input=in.nextLine();
		 input=input.toLowerCase();
		 int count=0;
		//char[] a=input.toCharArray();
		for(char i='a';i<='z';i++)
		{
			if(input.contains(String.valueOf(i)))
			{
				count++;
			}
		}
		if(count==26)
		{
			System.out.println("the given sentence is a pangram ");
		}
		else
		{
			System.out.println("the given sentence is not a pangram");
		}
	}

}
