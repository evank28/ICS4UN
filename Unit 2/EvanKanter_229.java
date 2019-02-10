// File EvanKanter_229.java
//Bubble Sort
import java.util.* ;

public class EvanKanter_229
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
		insertionSort(data) ;
		//print the sorted array
		System.out.println (Arrays.toString(data)) ;
	}

	public static void insertionSort (int[] data)
	{
		if (data == null || data.length <= 1) return;

		for (int i = 1; i <data.length; i++)
		{
			for (int c = i;(c>0)  && data[c-1] > data[c] ; c-- )
			{
				swap (data, c, c-1) ;
			}
		}


	}

	static public void swap ( int [ ] data , int n, int m )
	{
	if ( n >= 0 && n< data.length && m>= 0 && m< data.length )
	{ int tmp = data[ n ] ;
	data [ n ] = data[ m ] ;
	data[ m ] = tmp ;
	}
	}
}

