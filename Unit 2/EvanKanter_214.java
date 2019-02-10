// File EvanKanter_214.java

import java.util.* ;

public class EvanKanter_214
{
	public static void main( String[] args)
	{

		Scanner stdin = new Scanner ( System.in ) ; 	//Takes input
		int N = stdin.nextInt();	// Size of Array
		int [] array = new int [N]	;
		for (int index = 0; index<N; index++)

		{
			array [index] = (int)(stdin.nextDouble()) ; 		// Reads all values into the array
		}

		for (int index = 1; index<N; index=index+2)				// Note this assumes "position" as described in the question starts at position = 1 @ index = 0
		{

				if (array[index]%2==array[index+1]%2)
				{
				int placeholder = array[index] ;
				array [index] = array[index+1] ;
				array[index+1] = placeholder ;
				}

		}
		System.out.println (Arrays.toString(array)) ;

	}

}


