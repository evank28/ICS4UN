// File EvanKanter_162.java

import java.util.* ;

public class EvanKanter_162
{
	public static void main( String[] args)
	{

		Scanner stdin = new Scanner ( System.in ) ;			
		long n = stdin.nextInt() ;
		long factorial = 1;
		for (long cur=1; cur<=n; cur++)
			{
			  factorial = factorial * cur ;
			  System.out.println(factorial) ;
			}
		

	}

}


