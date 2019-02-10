// File EvanKanter_213.java

import java.util.* ;

public class EvanKanter_213
{
	public static void main( String[] args)
	{

		Scanner stdin = new Scanner ( System.in ) ; 	//Takes input
		int N = stdin.nextInt();	// Size of Array
		double [] array = new double [N]	;
		for (int index = 0; index<N; index++)
		{
			array [index] = (double)(stdin.nextDouble()) ; 		// Reads all values into the array
		}
		int half = (int) N/2 ;

		String palindromeStatus = "A Palindrome" ;
		for (int index = 0; index<half; index++)
		{
			if (array[index] != array [array.length-index-1])
				palindromeStatus = "Not a Palindrome" ;
		}
		System.out.println (palindromeStatus) ;

	}

}


