// File EvanKanter_A14.java
// Prints all elements of the sequence T(n) on line 1, and the number of terms in the sequence on line 2

import java.util.* ;

public class EvanKanter_A14
{
	public static void main( String[] args)
	{

		Scanner stdin = new Scanner ( System.in ) ; 			//Takes input
		int A = stdin.nextInt() ;								// The value of the first term in the sequence
		int B = stdin.nextInt() ;								// The value of the second term in the sequence
		int lastTerm = B ;										//Represents the last evaluated term (n-1)
		int currentTerm = A - B ;								//Represents the current term (n)
		int nextTerm = 0;										//A placeholder to represent the next term
		String sequence = "" + A + ", " + B ;					// Will be the entire sequence
		int termCount = 3;										// Will be the number of terms in the sequence - initialize at 3 -- counting the last term premptively
		while (currentTerm > 0 && currentTerm < lastTerm)
				{
					sequence = sequence + ", " + currentTerm ; 	//Appends the current term to the string sequence
					termCount ++ ;								//Adds 1 to the count of the length of the sequence
					
					nextTerm = lastTerm - currentTerm ;			//Finds the next term
					lastTerm = currentTerm ;					//Saves the current term to the last term
					currentTerm = nextTerm ;					//Saves the next term as the NEW current term
				}
		sequence = sequence + ", " + currentTerm ;				//After detecting the last term of the sequence (which is for the first time, greater than the term before it), add this last term to the sequence

		System.out.println (sequence) ;							//Output as explained in the comment on line 2 of this program
	    System.out.println(termCount) ;


	}

}


