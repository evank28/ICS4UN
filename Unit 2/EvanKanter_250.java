//file EvanKanter_250.java
//Introduction to 2-D arrays 
import java.util.*;
public class EvanKanter_250
{

	public static void main(String[] args)
	{
	//Test for 251
	//System.out.println(numberOf("ABCCCCDCC",'C'));
	//Test for 254
	//System.out.println(appearInOne("ABCDE","ABFDE"));
	}
	
	
	//Method for 251
	public static int numberOf(String str, char ch)
	{
		int count=0;
		for (int i = 0; i<str.length(); i++)
		{
			if (str.charAt(i)==ch)
				count++;
		}
		return count;
	}
	
	//Method for 254
	public static String appearInOne(String a, String b)
	{
		String output = "";
		for (int i = 0; i<a.length(); i++)
		{
			char ch = a.charAt(i);
			if (b.indexOf(ch)<0 && output.indexOf(ch)<0)
				output=output+ch;				
		}
		for (int i = 0; i<b.length(); i++)
		{
			char ch = b.charAt(i);
			if (a.indexOf(ch)<0 && output.indexOf(ch)<0)
				output=output+ch;				
		}
		return output;
		
	}
}





