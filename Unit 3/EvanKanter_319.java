//file EvanKanter_319.java
//
import java.util.*;
public class EvanKanter_319 {

	public static void main(String[] args)
	{
		int number=(int)(Math.random()*1000);
		int base =(int)(Math.random()*10);
		System.out.println("number: "+number+"; base: "+base+"; IsPower: "+isPower(number, base));
	}


	public static boolean isPower( int number , int base)
	{
			int quotient = number/base;
			int remainder = number%base;
			if (remainder!=0)
				return false;
			if (quotient==base)
				return true;
			else
				return isPower(quotient, base);
				
	}
}