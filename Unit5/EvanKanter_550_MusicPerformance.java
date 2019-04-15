import java.util.Scanner;

public class EvanKanter_550_MusicPerformance {

	public static void main(String[] args) {
		String name;
		String instrumentChoice;
		String subChoice;
		Instrument bandMember;
		Scanner input = new Scanner(System.in);
		System.out.println("Select an instrument for the band member. ");
		System.out.print("(V)ocals, (P)ercussion, (W)oodwinds: ");
		instrumentChoice = input.nextLine().toLowerCase();
		System.out.print("Enter the band member's name: ");
		name = input.nextLine();
		switch (instrumentChoice)
		{
			case ("v"):
				bandMember = new Vocal(name);
				break;
			
			case ("p"):
				System.out.println("(C)ymbal or (D)rum?");
				subChoice = input.nextLine().toLowerCase();
				switch (subChoice){
					case("c"):
						bandMember = new Cymbal(name);
						break;
					
					default:
						bandMember = new Drum(name);
						break;			
				}
				break;
			
			case ("w"):
				System.out.println("(P)icollo or (C)larinet?");
				subChoice = input.nextLine().toLowerCase();
				switch (subChoice){
					case("p"):
						bandMember = new Piccolo(name);
						break;
					
					default:
						bandMember = new Clarinet(name);
						break;	
				}
				break;
			
			default:
				bandMember = new Clarinet(name);
				break;
			
		}
			
		System.out.println(bandMember);

	}
}

abstract class Instrument{
	private String musician;
	public Instrument(String name)
	{
		musician = name;
	}

	public String getMusician()
	{
		return musician;
	}
	public abstract String makeSound();
	public abstract String toString();
}

abstract class Woodwind extends Instrument{

	//constuctor: a musician has been created
	public Woodwind (String musicianName){
		super(musicianName);
	}

	//implimenting the abstract method: returns sound of vocalist
	/*public String makeSound() {
		return ("toot");
	}*/
}

abstract class Percussion extends Instrument{
	public Percussion (String musicianName){
		super(musicianName);
	}
}


class Cymbal extends Percussion {

	//constructor: A Cymbal has been created
	public Cymbal(String cymb) {
		super(cymb);
	}

 	//implimenting the abstract method: returns sound made by the Cymbal
 	public String makeSound() {
	 	return("Crash");
	}

	//A string represting the Cymbal
		public String toString() {
			String cymbalPlayer;
			cymbalPlayer = super.getMusician();
			cymbalPlayer += " plays " + makeSound() + ".";
			return(cymbalPlayer);
	}
}



class Drum extends Percussion {

	//constructor: A Drum has been created
	public Drum(String drum) {
		super(drum);
	}

 	//implimenting the abstract method: returns sound made by the Drum
 	public String makeSound() {
	 	return("Boom");
	}

	//A string represting the Drum
		public String toString() {
			String drumPlayer;
			drumPlayer = super.getMusician();
			drumPlayer += " plays " + makeSound() + ".";
			return(drumPlayer);
	}
}


class Vocal extends Instrument {

	//constuctor: a vocalist has been created
	public Vocal (String singerName){
		super(singerName);
	}

	//implimenting the abstract method: returns sound of vocalist
	public String makeSound() {
		return ("LaLaLa");
	}

	//A string represting the vocalist
	public String toString() {
		String singer;
		singer = super.getMusician();
		singer += " sings " + makeSound() + ".";
		return(singer);
	}
}

class Piccolo extends Woodwind {

	//constructor: A piccolo has been created
	public Piccolo(String picc) {
		super(picc);
	}

 	//implimenting the abstract method: returns sound made by the piccolo
 	public String makeSound() {
	 	return("peep");
	}

	//A string represting the piccolo

		public String toString() {
			String piccoloPlayer;
			piccoloPlayer = super.getMusician();
			piccoloPlayer += " plays " + makeSound() + ".";
			return(piccoloPlayer);
	}
}

class Clarinet extends Woodwind {

	//constructor: A Clarinet has been created
	public Clarinet(String clar) {
		super(clar);
	}

 	//implimenting the abstract method: returns sound made by the clarinet
 	public String makeSound() {
	 	return("sqawk");
	}

	//A string represting the clarinet

		public String toString() {
			String clarinetPlayer;
			clarinetPlayer = super.getMusician();
			clarinetPlayer += " plays " + makeSound() + ".";
			return(clarinetPlayer);
	}
}



