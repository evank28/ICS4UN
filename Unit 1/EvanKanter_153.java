// File EvanKanter_153.java
// Prints the number of times that the max value appears in the sequence
import java.util.* ;

public class EvanKanter_153
{
	public static void main( String[] args)
	{

		Scanner input = new Scanner ( System.in ) ;		//Captures user input

		int element = input.nextInt() ;					//The current element in the sequence that the program is processing
		int max = 0 ;									//Will be the max value in the sequence
		int count = 0 ;									//Will be the number of times that the max value appears in the sequence

		while (element !=0)
			{
				if (element > max)
					{
						max = element ;
						count = 1 ;
					}
				else if (element == max)
					count++ ;

				element = input.nextInt() ;
			}

		System.out.println (count); 					//Prints the number of times that the max value appears in the sequence
	}

}


