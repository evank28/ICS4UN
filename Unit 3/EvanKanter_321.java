//file EvanKanter_319.java
//
import java.util.*;
public class EvanKanter_321 {

	public static void main(String[] args)
	{
		double number = 4.0;
		long exponent =  4;
		System.out.println("number: "+number+"; exponent: "+exponent+"; result: "+ power(number, exponent));
	}


	public static double power(double x, long n)
	{
			if (n==1)
				return x;
			return (x * power(x, n-1));
				
	}
}