//file EvanKanter_314.java
//Sums the digits of a number

public class EvanKanter_314 {

	public static void main(String[] args)
	{
		System.out.println(digitalRoot (5321));
	}

	public static int digitalRoot (int n)
	{
			if (n/10<1)
				return n;
			return 	digitalRoot(digitSum (n));
	}

	public static int digitSum (int n)
	{

			if (n/10<1)
				return n;
			return 	n%10 + digitSum((int)(n/10));

	}
}
