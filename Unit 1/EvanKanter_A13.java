// File EvanKanter_A13.java
// Prints the number of D-digit positive integers N such that N*(N-1) ends with Z zeros exactly
//A note on possible ones digits for the product to be zero --> 0,1,5,6
import java.util.* ;

public class EvanKanter_A13
{
	public static void main( String[] args)
	{

		Scanner stdin = new Scanner ( System.in ) ; 		//Takes input
		int D = stdin.nextInt() ;							// The number of digits of N
		int Z = stdin.nextInt() ;							// The number of trailing zeroes to look for on the product

		int count = 0 ;										// The eventual output as explained in line 2 of this program

		int min = (int)Math.pow(10, D-1) ; 					// Establishes the minimum value of the series of numbers with D digits
		int max = (int)Math.pow(10, D)-1 ;					// Establishes the maximum value of the series of numbers with D digits
		int N = min ;										// Defines a counter

		while (N <= max )
			{
				int digitCount = 0 ;						//The number of digits on the right side of N that are in fact equal to 0

				int nLocal = N*(N-1) ;						// Creates a local version of N, multiplied by (N-1)

				for (int nDigits=1; nDigits <=Z; nDigits++) //Loops through the last Z+1 digits of  N*(N-1)
					{
						int one = nLocal%10 ;
						if (one == 0)
							digitCount++ ;
						nLocal = nLocal/10	;				// This removes the last digit of N in this local version for the purpose of evaluating a new ones digit, reading from right to left

					}

				if (digitCount == Z && nLocal%10!=0)		//if in fact the last z digits of N*(N-1) are zero, add 1 to the count
					{
						count++ ;

					}

				int nOne = N%10 ;							//The ones digit of N

				if (nOne == 0 || nOne==5)					//This condition ensures the program only ever evaluates numbers in the series with ones digits of 0,1,5,6. This is to have the program run faster by evaluating conditions where N*(N-1) result in a trailing 0.
					N++ ;
				else
					N = N + 4;
			}

	    System.out.println (count) ;


	}

}


