//file EvanKanter_A21_weather.java
//
import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class EvanKanter_261
{

	public static void main(String[] args)
	{
		double[][] matrix = new double [6][6] ; // Create 2 D array
		
		//Fill the array with random numbers
	
		for (int row = 0; row < matrix.length; row++)
		{
			for (int col = 0; col < matrix[row].length; col++)
			{
				matrix [row] [col] = Math.random()* 40 -20 ;
			}
		}
		// print the array
		print2D(matrix);

		print2D(weatherForecast(matrix));
		
	}
	
	public static double[][] weatherForecast(double[][] temp)
	{
		double [][] preTemp = new double[temp.length][temp[0].length];
		for (int row = 0; row < preTemp.length; row++)
		{
			for (int col = 0; col < preTemp[row].length; col++)
			{
				// IF Internal Cell
				if ((row!=0 && row!=preTemp.length-1) && (col!=0 && col!=preTemp[row].length-1))
				{
					preTemp[row][col] = (temp[row+1][col]+temp[row-1][col]+temp[row][col+1]+temp[row][col-1])/4;
				}
				
				// IF HORIZONTAL EDGE
				else if ((row!=0 && row!=preTemp.length-1) && (col==0 || col==preTemp[row].length-1))
				{
					preTemp[row][col] = (temp[row+1][col]+temp[row-1][col])/2;
				}

				// IF VERTICAL EDGE
				else if ((row==0 || row==preTemp.length-1) && (col!=0 && col!=preTemp[row].length-1))
				{
					preTemp[row][col] = (temp[row][col+1]+temp[row][col-1])/2;
				}
				// IF CORNER
				else 
				{
					if (row==0)
					{
						if (col==0)
						{
							preTemp[row][col] = (temp[row+1][col] + temp[row][col+1])/2;
						}
						else
						{
							preTemp[row][col] = (temp[row+1][col] + temp[row][col-1])/2;
						}
					}
					else
					{
						if (col==0)
						{
							preTemp[row][col] = (temp[row-1][col] + temp[row][col+1])/2;
						}
						else
						{
							preTemp[row][col] = (temp[row-1][col] + temp[row][col-1])/2;
						}
					}
					
				}
			}
		}
	
		return preTemp;
	}
	
	/* PRINT METHOD FOR 2-D ARRAY
	 * Prints values of 2D array 
	 */
	public static void print2D(double[][] data)
	{

		for (int row = 0; row < data.length; row++)
		{
			for (int col = 0; col < data[row].length; col++)
			{
				System.out.printf( "%15f", data [row] [col]);
			}
			System.out.println() ;
		}
		System.out.print("\n\n") ; // separate from next output
	}
	
}





