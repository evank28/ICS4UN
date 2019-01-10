//file EvanKanter_316.java
//Sums the digits of a number
import java.util.*;
public class EvanKanter_316 {

	public static void main(String[] args)
	{
		Scanner kbd = new Scanner(System.in);
		reverseStory (kbd);
	}


	public static void reverseStory(Scanner kbd )
	{

			String a = kbd.next();
			if (!a.equals("END"))
				{
				reverseStory(kbd);
				System.out.print(a+" ");
				}
			

	}
}
