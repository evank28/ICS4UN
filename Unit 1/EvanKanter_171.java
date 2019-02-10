// File EvanKanter_171.java
//prints out the GCF of two number
import java.util.* ;

public class EvanKanter_171
{
	public static void main ( String[] args)
	{
		Scanner input = new Scanner ( System.in ) ;
		int n = input.nextInt() ;
		System.out.println (isPrime (n)) ;
	}

	public static boolean isPrime (int n)
	{
		if (n == 1 || n == 0) return false;
		for (int f = 2; f<=(int)Math.sqrt(n); f++)	// One most only check up to half the number, and has not need to start at 1
		{
			if (n%f == 0)
				return false ;
		}
		return true ; 					// prime if no factors are found

	}

}


