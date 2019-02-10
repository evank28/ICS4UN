// File EvanKanter_227.java
//Bubble Sort
import java.util.* ;

public class EvanKanter_227
{
	public static void main( String[] args)
	{


		//Create an array
		int [] data = new int[30] ;

		// fill the array with random numbers
		for ( int i = 0; i < data.length; i++ )
		{
			data [i] = (int) ( Math.random()* 1000 ) ;
		}

		// print the array
		System.out.println (Arrays.toString(data)) ;

		//sort the array
		digitSort(data) ;
		//print the sorted array
		System.out.println (Arrays.toString(data)) ;


	}

	public static void digitSort (int[] data)
	{
		int [] counts = new int[10] ; //Initialize array for 0 counts

		for (int i = 0; i < data.length; i++)
		{
			counts [data[i]]++ ;
		}

		int position = 0;
		for (int digit = 0; counts.length; digit++)
		{
			for (instances = 0; instances < count [digit]; instances++)
			{
				data [position] = digit;
				position ++;
			}
		}

}


