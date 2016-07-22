
public class Alphabet {

	public static void main(String[] args) {
	char name;
	name='g';
	
	char keyChar='a';
	
	
	{
	for(int i=1;i<=26;i++)
	{
		if(name==keyChar)
		{
			System.out.println("it is alphabet");
			break;
		}
		keyChar++;
	}
	if(name!=keyChar)
	{
		System.out.println("it is not alphabet");
	}
	}
			
	}
}
	


