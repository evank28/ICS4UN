//file EvanKanter_240.java
//Introduction to 2-D arrays 
import java.util.*;
public class EvanKanter_240 {

	public static void main(String[] args)
	{
		String[] items = new String[] {"A", "B", "C"};
		System.out.println(menu("TITLE", items ));
	}
	
	/* Ex 241
	 * Prints a title and a menu of items numbered from 1 through items.length;
b) Asks the user to enter a number that corresponds to a desired item from the menu;
c) Reads the user’s input and returns the index of the element of the array items that corresponds to user’s
choice. If the user enters an number beyond the range of the array items, the method should return –1.
	 */
	 public static int menu(String title, String[] items)
	 {
		 System.out.println("TITLE: "+ title);
		 for (int i = 1; i <= items.length; i++)
		 {
			 System.out.println( "" + i + ". "+ items[i-1]);
		 }
		 System.out.println("");
		 System.out.println("USER, Please enter a number corresponding with a menu item");
		 Scanner input = new Scanner( System.in ) ;
		 int choice = input.nextInt();
		 if (choice<= items.length && choice >0)
			 return (choice-1);
		 else
			 return -1;
				 
	 }
}