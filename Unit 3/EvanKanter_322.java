//file EvanKanter_322.java
//
import java.util.*;
public class EvanKanter_322 {

	public static void main(String[] args)
	{	
		String word = "Alphabets";
		//int count = 0;
		System.out.println(word);
		word = reverseStringHalf(word);
		System.out.println(word);
	}


	public static String reverseString(String word)
	{
		int len = word.length();
		//System.out.println("DEPTH+");
		if ( len < 3 ) // a word that has less than 2 letters does have to be reversed
			return  ""+ word.charAt(1) + word.charAt(0) ;
		 return (word.charAt(len-1) + reverseString( word.substring(1,len-1) ) + word.charAt(0));
		
				
	}

	public static String reverseStringLog(String word)
	{
		int l = word.length();
		if (l<2)
			return word;
		int l4 = (int) l/4;
		String a = word.substring(0,l4);
		String b = word.substring(l4,l-l4);
		String c = word.substring(l-l4);

		return reverseStringLog(a) + reverseStringLog(b) + reverseStringLog(c);
	}

	public static String reverseStringHalf(String word)
	{
		int l = word.length();
		if (l<2)
			return word;
		int l2 = (int) l/2;
		String a = word.substring(0,l2);
		String b = word.substring(l2);

		return reverseStringHalf(b) + reverseStringHalf(a);
	}
}