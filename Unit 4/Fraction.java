public class Fraction
{
    
    private int num, den = 1;

    //constructor(s)
    public Fraction (int num, int den)
    {
        this.num = num;
        this.den = den;
    }

  
    public String toString()
    {
        return ("<" + num + "/" + den + ">" );
    }

    public double toDecimal ()
    {
        return (double) num/den;
    }

    public double add (Fraction f)
    {
        this.num = this.num * f.den + f.num*this.den;
        this.den = this.den * f.den;
        return num/den;
    }
}