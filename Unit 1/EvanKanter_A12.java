// File EvanKanter_A12.java
// Prints the number of ways that  the integers returned by two dice with N and M faces respectively can equal a set number, S
import java.util.* ;

public class EvanKanter_A12
{
	public static void main( String[] args)
	{

		Scanner stdin = new Scanner ( System.in ) ; 	//Takes input
		int n = stdin.nextInt() ;						// The number of faces on the first die
		int m = stdin.nextInt() ;						// The number of faces on the second die
		int s = stdin.nextInt() ;						// The ideal sum of the itegers (this program will find the number of ways the integers returned by the two dice can equal this nunber)
		int count = 0 ;									// The eventual output (the number of ways that the two dice can add to a sum of S)

		for (int roll1 = 1; roll1 <= n; roll1++)		// For loop to model all possibilites of the first dice, with n faces
			{
				for (int roll2 = 1; roll2 <= m; roll2++) // For loop to model all possibilites of the second dice, with m faces
					{
						if (roll1 + roll2 == s) 		//Evaluates whether the two integers sum to s and adds to the count if true
							count++ ;
					}
			}

	    System.out.println (count) ;


	}

}


