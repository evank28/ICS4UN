    //Modified from 422
    //Modified from 432
import java.util.*;
public class EvanKanter_462_Rectangle
{
    public static void main (String[] args)
    {
       Rectangle box = new Rectangle (10,5);
       System.out.println("Length: <<"+box.getLength()+">> Width: <<"+box.getWidth()+">> Area: <<" +box.getArea()+">> Perim: <<"+box.getPerimeter()+">>");
       box.setLength(20);
       box.setWidth(10);
       System.out.println("Length: <<"+box.getLength()+">> Width: <<"+box.getWidth()+">> Area: <<" +box.getArea()+">> Perim: <<"+box.getPerimeter()+">>");
       Rectangle.displayAreaFormula();
       Rectangle box2 = new Rectangle (20,6);
       System.out.println("box > box2 ? ---> "+box.compareTo(box2));

    }

}
public interface Comparable{
    int compareTo(Object obj);
}
class Rectangle implements Comparable
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

    public int compareTo(Rectangle toCompare){

	if (this.getLength() == toCompare.getLength() && this.getWidth() == toCompare.getWidth()){
		return 1;
	}
	else{
		return 0;
	}
    }

 }   
