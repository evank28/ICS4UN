//file EvanKanter_A22_Infection.java
//
import java.util.*;
public class EvanKanter_262
{

	public static void main(String[] args)
	{
		int[][] matrix = new int [10][10] ; // Create 2 D array
		
		//Fill the array with random numbers
	
		for (int row = 0; row < matrix.length; row++)
		{
			for (int col = 0; col < matrix[row].length; col++)
			{
				matrix [row] [col] = (int) (Math.random()*2) ;
				//matrix [row] [col] = 0;
			}
		}
		
		// print the array
		print2D(matrix);

		System.out.println(testInfection(matrix));
		//print2D(matrix);
		//System.out.println("done");
	
	}

	public static int testInfection( int[][] map )
	{
		int[][] today = new int[map.length][map[0].length];
		for (int row = 0; row < today.length; row++)
		{
			for (int col = 0; col < today[row].length; col++)
			{
				today [row] [col] = map [row] [col];
			}
		}
		int days = 0;
		boolean flag = true;
		boolean change = false;
		while  (flag)
		{
			flag = false;
			change = false;
			for (int row = 0; row < map.length; row++)
			{
				for (int col = 0; col < map[row].length; col++)
				{
					map [row] [col] = today [row] [col];
				}
			}

			for (int row = 0; row < map.length; row++)
			{
				for (int col = 0; col < map[row].length; col++)
				{
					int sum = 0;
					
					if (map [row] [col] == 0)
						flag=true;
					if (row-1>=0)
						sum+=map [row-1] [col];
					if (row+1<map.length)
						sum+=map [row+1] [col];
					if (col-1>=0)
						sum+=map [row] [col-1];
					if (col+1<map[0].length)
						sum+=map [row] [col+1];
					if (sum>1 & today[row][col]==0)
						{
							today [row] [col] = 1;
							change = true;
						}
				}
			}
			days++;
			if (change==false)
				{
					break;	
				}
	
		}
		
		if (flag==true)
			return -1;
		else
			return days-1;
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
				System.out.printf( "%6d", data [row] [col]);
			}
			System.out.println() ;
		}
		System.out.print("\n\n") ; // separate from next output
	}
	

}





