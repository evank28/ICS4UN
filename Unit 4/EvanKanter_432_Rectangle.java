    //Modified from 422
import java.util.*;
public class EvanKanter_432_Rectangle
{
    public static void main (String[] args)
    {
       Rectangle box = new Rectangle (10,5);
       System.out.println("Length: <<"+box.getLength()+">> Width: <<"+box.getWidth()+">> Area: <<" +box.getArea()+">> Perim: <<"+box.getPerimeter()+">>");
       box.setLength(20);
       box.setWidth(10);
       System.out.println("Length: <<"+box.getLength()+">> Width: <<"+box.getWidth()+">> Area: <<" +box.getArea()+">> Perim: <<"+box.getPerimeter()+">>");
       Rectangle.displayAreaFormula();
    }

}

class Rectangle
 {
    private double length, width ;
                                                           
    public Rectangle ()
    {
        this.length = this.width = 1;
    } 
    public Rectangle (double length, double width)   
    {
        this.length = length;
        this.width = width;
    } 

    public void setLength(double length)
    {
        this.length = length;
    }

    public void setWidth(double width)
    {
        this.width = width;
    } 
        
    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    } 

    public double getPerimeter()
    {
        return 2*(width+length);
    } 

    public double getArea()
    {
        return width * length;
    } 

    public static void displayAreaFormula (){
        System.out.println("A = length * width");
    }

 }   
