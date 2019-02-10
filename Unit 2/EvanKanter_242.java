//file EvanKanter_240.java
//Introduction to 2-D arrays 
import java.util.*;
public class EvanKanter_242 
{

	public static void main(String[] args)
	{
		String[][] seatingPlan = {{"Student A", "Student B", "Student C"},
								{ "Student D", "Student E", "Student F"},
								{"Student G", "Student H"}
								};
		print2DStr(seatingPlan);
		shuffle (seatingPlan);
		print2DStr(seatingPlan);
		
	}
	 
	 
	 /* 
	  * Ex 242
	  * SHUFFLE FUNCTION
	  */
	 public static void shuffle (String[][] plan)
	 {
		 for (int row = 0; row < plan.length; row++ )
		 {
			 for (int col = 0; col < plan[row].length; col++)
			 {
				int rRow = (int)(Math.random()*(plan.length-1));
				int rCol = (int)(Math.random()*(plan[row].length-1));
				Swap2DStr(plan, row, col, rRow, rCol);
						 
			 }
		 }
	 }
	 
	 /* 2D swap function */
	 public static void Swap2DStr(String[][] matrix, int rowA, int colA, int rowB, int colB)
	 {
		 String temp = matrix[rowA][colA];
		 matrix[rowA][colA] = matrix[rowB][colB];
		 matrix[rowB][colB] = temp;
		 
	 }
	 
	 /* PRINT METHOD FOR 2-D ARRAY of Strings
		 * Prints values of 2D array 
		 */
		public static void print2DStr(String [][] data)
		{

			for (int row = 0; row < data.length; row++)
			{
				for (int col = 0; col < data[row].length; col++)
				{
					System.out.printf(" %6s", data [row] [col]);
				}
				System.out.println() ;
			}
			System.out.print("\n\n") ; // separate from next output
		}
}





