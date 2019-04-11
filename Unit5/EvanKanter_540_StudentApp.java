import java.util.Scanner;
/** Multiple choice responses:
 * 
 */
public class EvanKanter_540_StudentApp{

	public static void main(String[] args) {
		String choice;
		Student s1 = null;
		Student u = new Undergrad("Tim Lorenze", new int[] {90,90,100}, "none");
		Student g = new GradStudent("Carla Cristella", new int[] {85,70,90}, "none", 1234);

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a student status: ");
		System.out.println("Grad (G), Undergrad (U), Neither (N)");
		choice = input.nextLine();

		if (choice.equals("G")){
			s1=g;
		}
		else if (choice.equals("U")){
			s1=u;
		}
		else {
			s1 = new Student();
		}

		s1.computeGrade();					//choose appropriate computerGrade()
		System.out.println(s1);				//access the student's grade
/*
		System.out.println("Attention Teacher -- the school administration has recieved complaints about "+ s1.getName() + ". Please ensure she DOES NOT PASS. \n" +
								"{Please edit her test scores. Enter X when complet. ");
		String a = nextLine();
		int[] tests = s1.getTests();
		int c = 0;
		while (! a.equals("X")){
			System.out.println("First score:tests[c]
		}

		s1.computeGrade();
		System.out.println(s1);				//access the student's grade*/

	}
}

class Student {
	public static final int numTests = 3;
	private String name;
	private int[] tests;
	private String grade;

	//default constructor
	public Student(){
		name = "";
		tests = new int[numTests];
		grade = "";
	}
	//constructor
	public Student (String sName, int[] sTests, String sGrade){
		name = sName;
		tests = sTests;
		grade = sGrade;
	}
	//accessor for student name
	public String getName(){
		return name;
	}
	//accessor for student grade
	public String getGrade(){
		return grade;
	}

	public int[] getTests() {
		return this.tests;
	}

	//mutator to change student grade
	public void setGrade(String newGrade){
		grade = newGrade;
	}

	public void tests(int[] tests) {
		this.tests = tests;
	}
	


	//calculate grade, if student is null then print "No Grade"
	public void computeGrade(){
		if (name.equals(""))
			grade = "No grade";
		else if (getTestAverage() >= 65)
			grade = "Pass";
		else
			grade = "Fail";
	}
	//calculates a students average on three tests
	public double getTestAverage(){
		double total = 0;
		for (int i = 0; i<numTests; i++){
			total += tests[i];
		}
		return (total/numTests);
	}

	public String toString() {
		return "Student: " + name + "\n" + grade;
	}

}

class Undergrad extends Student{
	//default constructor
	public Undergrad(){
		super();
	}

	//constructor
	public Undergrad (String sName, int[] sTests, String sGrade){
		super(sName, sTests, sGrade);
	}

	//overrides the computeGrade in Student class
	public void computeGrade(){
		if (getTestAverage()>=70)
			setGrade("Pass");
		else
			setGrade("Fail");
	}
}

class GradStudent extends Student{
	private int gradID;

	//default constructor
	public GradStudent(){
		super();
		gradID = 0;
	}

	//constructor
	public GradStudent(String sName, int[] sTests, String sGrade, int gradStudentID){
		super(sName, sTests, sGrade);
		gradID = gradStudentID;
	}

	public int getID(){
		return gradID;
	}
	//partial overriding - call computerGrade() + an additional test
	public void computeGrade(){
		super.computeGrade();
		if (getTestAverage() >= 90)
			setGrade("Pass with distinction");
	}

}





