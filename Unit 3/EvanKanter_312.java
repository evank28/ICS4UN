//file EvanKanter_312.java
//Sums the values of a geometric sequence

public class EvanKanter_312 {

	public static void main(String[] args)
	{
		System.out.println(sumGeo (1.0, 2.0, 4));
	}

	public static double sumGeo (double term, double ratio, int n)
	{

			if (n==1)
				return term;
			return 	sumGeo (term*ratio, ratio, n-1);
	}




}
