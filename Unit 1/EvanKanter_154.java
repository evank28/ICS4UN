// File EvanKanter_154.java
// finds the index of the first maximum element and the index of the last maximum element in a sequence
import java.util.* ;

public class EvanKanter_154
{
	public static void main( String[] args)
	{

		Scanner input = new Scanner ( System.in ) ;		//Captures user input

		int element = input.nextInt() ;					//The current element in the sequence that the program is processing
		int max = 0 ;									//Will be the max value in the sequence
		int index = 1 ;									//The index of the current element in the sequence
		int first = 1;
		int last = 1;

		while (element !=0)
			{
				if (element > max)
					{
						max = element ;
						first = index ;
						last = index ;
					}
				else if (element == max)
						last = index;

				element = input.nextInt() ;
				index++ ;
			}

		System.out.println ("The index of the first maximum element is " + first +". The index of the last maximum element is "+last+"."); 					//Prints the number of times that the max value appears in the sequence
	}

}


