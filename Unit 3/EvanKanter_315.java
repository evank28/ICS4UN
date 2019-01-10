//file EvanKanter_315.java
//Sums the digits of a number
import java.util.*;
public class EvanKanter_315 {

	public static void main(String[] args)
	{
		Scanner kbd = new Scanner(System.in);
		reverseSequence (kbd);
	}


	public static void reverseSequence(Scanner kbd )
	{

			int a = kbd.nextInt();
			if (a != 0)
				{
				reverseSequence(kbd);
				System.out.print(a+" ");
				}

	}
}
