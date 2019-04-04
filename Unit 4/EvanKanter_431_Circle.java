// Creates the Circle class as per instructions
//Modified from 411
import java.util.*;
public class EvanKanter_431_Circle
{
    public static void main (String[] args)
    {

        
        Circle spot = new Circle(5) ;
        Circle.displayAreaFormula() ;
        Circle.displayCircumfrenceFormula() ;
        System.out.println("Circle Radius: " +spot.getRadius() );
        System.out.println("Circle Area: "+spot.area() );
        System.out.println("Circle Circumference: " +spot.circumference () );  

        System.out.println("\n############## Let's repeat without changing the radius ############## \nNote that no calculations will be performed \n");
        System.out.println("Circle Radius: " +spot.getRadius() );
        System.out.println("Circle Area: "+spot.area() );
        System.out.println("Circle Circumference: " +spot.circumference () );  
        
        System.out.println("\n############## TIME TO CHANGE THE RADIUS ############## \nNote that calculations will be performed \nEnter the new Radius:");
        Scanner stdin = new Scanner(System.in);
        spot.newRadius(stdin.nextDouble()); 
        System.out.println("Circle Radius: " +spot.getRadius() );
        System.out.println("Circle Area: "+spot.area() );
        System.out.println("Circle Circumference: " +spot.circumference () );  

    }
}


class Circle {
    private double radius;
    private static final double pi = Math.PI;
    private double lastARadius, lastCRadius, area, circumference; //By creating these instance fields, 
                                                                  // Combined with the if statement below,
                                                                  // the only time calculations are performed
                                                                  // is when the radius has changed.
                                                                  
    public Circle (double radius)   
    {
        this.radius = radius;

    }

    public double getRadius()
    {
        return radius;
    }

    public double area ()
    {
        if (lastARadius != radius)
        {   //System.out.println("Performing A calculation");
            area = pi * radius * radius;
            lastARadius = radius;
        }
        return area;
    }

    public void newRadius(double newRadius)
    {
        radius = newRadius;
    }

    public double circumference ()
    {
        if (lastCRadius != radius)
        {   
            //System.out.println("Performing C calculation");
            circumference = 2 * pi * radius ;
                     lastCRadius = radius;
        }
        return circumference;
    }

    public static void displayCircumfrenceFormula() {
        System.out.println("C = 2 * pi * r");
    }

    public static void displayAreaFormula() {
        System.out.println("A = pi * r^2");
    }
        
}