// File EvanKanter_A11.java
// Reads 3 natural numbers A, B, N and then a sequence of N numbers
// if A<B then this prints a count of all elements in sequence that are multiples of A but not factors of B
// Else this prints the number of terms equal to A+B or A*B
import java.util.* ;

public class EvanKanter_A11
{
	public static void main( String[] args)
	{

		Scanner stdin = new Scanner ( System.in ) ; 	//Takes input
		int a = stdin.nextInt() ;
		int b = stdin.nextInt() ;
		int n = stdin.nextInt() ;
		int count = 0 ;									// The eventual output. Explained in comment lines 3 and 4 of this program.

		if ( a < b )
		{
			for (int index = 1; index <= n; index++)
			{
				int element = stdin.nextInt() ;
				if ( (element % a == 0) && (b % element != 0) )
					count++	;							//Adds to count any elements that are multiples of A but not factors of B
			}
		}
		else
		{
			for (int index = 1; index <= n; index++)
			{
				int element = stdin.nextInt() ;
				if ( (element == a + b) || (element == a * b) )
					count++ ;							//Adds to count any elements equal to A+B or A*B
			}
		}

		System.out.println (count) ;


	}

}


