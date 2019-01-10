//file EvanKanter_313.java
//Sums the digits of a number

public class EvanKanter_313 {

	public static void main(String[] args)
	{
		System.out.println(digitSum (5321));
	}

	public static int digitSum (int n)
	{

			if (n/10<1)
				return n;
			return 	n%10 + digitSum((int)(n/10));
	}




}
