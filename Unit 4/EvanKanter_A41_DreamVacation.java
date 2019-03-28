import java.util.Scanner;

public class EvanKanter_A41_DreamVacation
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in) ;
        System.out.println("Please enter the Name followed by the Cost of your Dream Vacation.") ;
        DreamVacation myVacay = new DreamVacation (input.next(), input.nextDouble()) ;
        myVacay.getName() ;
    }
}

class DreamVacation
{
    private String name ;
    private double cost = 0.0 ;
    public DreamVacation ()
    {
    }

    public DreamVacation (String name, double cost)
    {
        this.name = name ;
        this.cost = cost ;
    }

    public String getName()
    {
        return name ;
    }

    public double getCost()
    {
        return cost ;
    }

    public void setName(String name)
    {
        this.name = name ;
    }

    public void setCost(double cost)
    {
        this.cost = cost ;
    }

}