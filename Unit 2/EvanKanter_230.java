//file EvanKanter_230.java
//Introduction to Strings

public class EvanKanter_230 {

	public static void main(String[] args)
	{
		// Testing the methods
		
				int[][] matrix = new int [6][10] ; // Create 2 D array
				
				//Fill the array with random numbers
			
				for (int row = 0; row < matrix.length; row++)
				{
					for (int col = 0; col < matrix[row].length; col++)
					{
						matrix [row] [col] = (int) (Math.random()* 100) ;
					}
				}
				
				// print the array
				print2D(matrix);
			
		
	
	}
	
	
	/* PRINT METHOD FOR 2-D ARRAY
	 * Prints values of 2D array 
	 */
	public static void print2D(int[][] data)
	{

		for (int row = 0; row < data.length; row++)
		{
			for (int col = 0; col < data[row].length; col++)
			{
				System.out.printf(" %6d", data [row] [col]);
			}
			System.out.println() ;
		}
		System.out.print("\n\n") ; // separate from next output
	}
	
	
	
	/* PRINT METHOD FOR 1-D ARRAY
	 * Prints values of array based on set number of columns
	 */
	public static void print1D(int [] data, int cols)
	{
		
			if ( cols < 1)
				cols = 1 ;
			System.out.print("\n\n:") ; // separate from previous output
			int rows = data.length / cols ; // the number of full rows
			for ( int i = 0 ; i < rows ; i ++ ) // print each full row
			{
				for( int j= 0 ; j < cols ; j ++ )
					System.out.printf( " %6d", data[ i * cols + j ] ) ; // formatted output
				System.out.println() ; // move the cursor to a new line
			}
			for ( int i = rows * cols ; i < data.length ; i ++ ) // print last row ( might be not full)
				System.out.printf( "%6d", data [ i ] ) ; // formatted output
			System.out.print("\n\n") ; // separate from next output
	}
	
	
	/* SWAP METHOD for 2 elements in a 1-D array
		The method swap( int [ ] data , int n, int m ) exchanges the values of the elements of the array data
		with indices n and m if the indices are within the boundaries of the array.
		Otherwise, the swapping is not performed.
	*/
	static public void swap ( int [ ] data , int n, int m )
	{
		if ( n >= 0 && n< data.length && m>= 0 && m< data.length )
		{ 
			int tmp = data[ n ] ;
			data [ n ] = data[ m ] ;
			data[ m ] = tmp ;
		}
	}
}
