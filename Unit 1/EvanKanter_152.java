// File EvanKanter_152.java
// Prints the average of 11 integer terms in a sequence
import java.util.* ;

public class EvanKanter_152
{
	public static void main( String[] args)
	{

		Scanner input = new Scanner ( System.in ) ;		//Captures user input

		int element = input.nextInt() ;					//The current element in the sequence that the program is processing
		int sum = 0;									//Will be the sum of all values in the sequence

		while (element !=0)
			{
				sum = sum + element ; 					//Finds the sum of all values in the sequence
				element = input.nextInt() ;
			}

		System.out.println (sum/11); 					//Prints the average
	}

}


