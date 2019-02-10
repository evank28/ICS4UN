
public class EvanKanter_317 {

	public static void main(String[] args)
	{
		printBottomCorner((int) (Math.random()*10));
	}


	public static void printBottomCorner( int n )
	{
			if (n>0)
				{
				printBottomCorner(n-1);
				String output = new String(new char[n]).replace("\0", "*");
				System.out.println(output);
				}
				
	}
}