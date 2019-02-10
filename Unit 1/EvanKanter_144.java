// File EvanKanter_144.java

import java.util.* ;

public class EvanKanter_144
{
	public static void main( String[] args)
	{

		Scanner stdin = new Scanner ( System.in ) ;			

		double a = stdin.nextDouble() ;
		double b = stdin.nextDouble() ;
		double c = stdin.nextDouble() ;
		double x = stdin.nextDouble() ;
		double y = stdin.nextDouble() ;
		stdin.close();
		double yAtX = a * x * x +  b * x + c ;
		//double vertex = ((-1) * b *b )/2*a;
		int within = 0 ; 
		if (a>0)
			{
			if (y >= yAtX) 
				within = 1 ;
			}
		else
			{
			if (y <= yAtX)
				within = 1 ;
			}
		System.out.println(within);

	}

}


