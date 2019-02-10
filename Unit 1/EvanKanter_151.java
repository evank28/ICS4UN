// File EvanKanter_151.java
// Finds the sum of all negative integers in a sequence
import java.util.* ;

public class EvanKanter_151
{
	public static void main( String[] args)
	{

		Scanner input = new Scanner ( System.in ) ; 	//Captures user input

		int element = input.nextInt() ; 				//The current element in the sequence that the program is processing
		int sum = 0 ; 									// Will be the sum of all negative integers

		while (element !=0) 							//ends at the final element in a sequence which will be 0
			{
				if (element<0)							//selects only negative integers
					sum = sum + element ;
				element = input.nextInt() ;
			}
		System.out.println (sum);
	}

}


