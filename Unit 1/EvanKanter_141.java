// File EvanKanter_141.java
//12345 ACDBDEF\n12345\nMESSAGE
import java.util.* ;

public class EvanKanter_141
{
	public static void main( String[] args)
	{

		Scanner stdin = new Scanner ( System.in ) ;			

		double a = stdin.nextDouble() ;
		double b = stdin.nextDouble() ;
		double r = stdin.nextDouble() ;
		stdin.close();
		double distance = a*a +b*b;
		double rSquared = r*r;
		if (distance <=rSquared)
			 {
			System.out.println("Within");
			 }
		else 
			{	
				System.out.println("Beyond ");
			}
		

	}

}


