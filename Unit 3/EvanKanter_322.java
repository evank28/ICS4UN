//file EvanKanter_322.java
//
import java.util.*;
public class EvanKanter_322 {

	public static void main(String[] args)
	{	
		String word = "Alphabet";
		//int count = 0;
		System.out.println(word);
		word = reverseString(word);
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
}