//Extends previously built Circle class (431) to use it to create 3D Disk class, and then extend Disk to create Puck
// Started as part of excercise 521 and extended upon in excercise 561
import java.util.Scanner;
import Circle;
import java.text.DecimalFormat;

public class EvanKanter_561_Puck {
	public static void main(String[] args) {
		Scanner stdin = new Scanner (System.in);
		System.out.println("Thanks for using the NHL's Puck Evaluator Tool. Please provide the following info.");
		System.out.println("Enter the radius (cm): ");
		double radius = stdin.nextDouble();
		double radius2 = stdin.nextDouble();
		System.out.println("Enter the thickness (cm): ");
		double thickness = stdin.nextDouble();
		double thickness2 = stdin.nextDouble();
		System.out.println("Enter the weight (oz): ");
		double weight = stdin.nextDouble();
		double weight2 = stdin.nextDouble();
		Puck p = new Puck (radius, thickness, weight);
		Puck q = new Puck (radius2, thickness2, weight2);
		System.out.println("p: "+ p + "\nq: " + q);
		System.out.println ("P > Q ? ---> " + p.compareTo(q));

	}
}

class Disk extends Circle implements Comparable		//Citation: Demo from Mr. DeClerico
{
	private double thickness;
	DecimalFormat df = new DecimalFormat("#.##");
	public Disk(double givenRadius, double thickness){
		super(givenRadius);						//sends givenRadius to constructor of superclass
		this.thickness = thickness;
	}

	public Disk()
	{							//default constructor
		super(1);
		this.thickness = 1;
	}
	public void setThickness(double thickness)
	{
		this.thickness = thickness;
	}
	public double getThickness()
	{
		return thickness;
	}
	public double Volume()
	{
		return Double.valueOf(df.format(super.area()*thickness));
	}
	public String toString()
	{
		String discString;
		discString = "The radius is " + super.getRadius() + ". The thickness is " + thickness + ".";
		return discString;
	}
	public int compareTo (Disk toCompare){
		//compare by volume
	if (this.getRadius() == toCompare.getRadius() && this.thickness == toCompare.getThickness()){
		return 1;
	}
	else{
		return 0;
	}
	}
}

public interface Comparable {
	int compareTo(Object obj);
}

class Puck extends Disk {
	private double weight;

	public Puck (double givenRadius, double thickness, double weight){	//constructor
		super(givenRadius, thickness);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public String getDivision() {
		if (5<= weight && weight <=5.5){
			return "Standard";
		}
		else {
			return "Youth";
		}
	}

	public String toString(){
		return super.toString() + "\nThe division is " + this.getDivision() +". The Weight is " + this.weight + " oz.";
	}



}
