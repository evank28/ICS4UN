//file EvanKanter_263.java
// Contains the test of a formatText method to format the report card comment of student Evan Kanter. 
import java.util.*;
public class EvanKanter_263
{

	public static void main(String[] args)
	{

		System.out.println(formatText(" i am very proud of $'s achievements this term .   "
				+ "@ has demonstrated above and beyond understanding of the course materials in Computer Science ,"
				+ "and has put great effort into # work . I am happy to reward $ with a 5+ .", "Evan", "M"));
	}


	/*;
	 * Formats the text for report cards
	 * @param		text 	teacher’s comment about a student.
	 * @param		name	the name of the student
	 * @param		gender	the gender of the student
	 */
	public static String formatText(String text, String name, String gender)
	{
		text=text.trim(); 	//Removes leading and trailing spaces as per requirement A.
		name = name.trim();

		// The following segment determines the gender and stores the correct pronouns
		String pron, pos = "";

		if (gender.equals("M"))
		{
			 pron = "he";
			 pos = "his";
		}
		else if (gender.equals("F"))
			{
				pron = "she";
				pos = "her";
			}
			else
			{
				pron = "they";
				pos = "their";
			}
		//Makes simple symbol replacements
		// Replace:
				// $ --> name
				// @ --> he/she/they
				// # his/her/their
		text = text.replace("$", name);
		text = text.replace("@", pron);
		text = text.replace("#", pos);
		text=replaceAtIndex(text, 0, 0, ("" + text.charAt(0)).toUpperCase()); //This ensures the first letter of the report card comment is capitalized
		//System.out.println("begin> "+text);

		// The following segment loops through the text, character by character, to make the necessary replacements with punctuation and spacing
		for (int iCh=0; iCh<text.length(); iCh++)
		{
			char ch = text.charAt(iCh);
			if (ch=='.'|| ch=='!' || ch=='?' || ch==',')	// Checking for punctuation and formatting spacing before and after as appropriate
			{
				
				while (iCh-1>=0 && iCh<text.length() && text.charAt(iCh-1)==' ')			//Removes preceding spaces to punctuation.
				{
					text = text.replace(" " + ch, "" + ch);
					iCh--;
				}
				
				//System.out.println(" iCh = <" + iCh + "> <" + text +">" );

				
				while (iCh+2<text.length() && text.charAt(iCh+1)==' ' && text.charAt(iCh+2)==' ') //Removes extra spaces following punctuation
				{
					text=text.replace(ch + "  ", ch + " ");
					//System.out.println(" iCh = <" + iCh + "><" + text.charAt(iCh+1) +"><" + text.charAt(iCh+2) +">");
					//iCh++;
				}

				//System.out.println(" iCh = <" + iCh + "> " + text);
				

				if (iCh+1<text.length() && text.charAt(iCh+1)!=' ') //Adding a minimum of 1 space after punctuation
				{
					text=insertAtIndex(text, iCh+1, " ");
					
				}

				//System.out.println(" iCh = <" + iCh + "> " + text);
				
				if (ch!=',' && iCh+2<text.length())	//Capitalizes the first letter of each sentence
				{
					text=replaceAtIndex(text, iCh+2, iCh+2, ("" + text.charAt(iCh+2)).toUpperCase());
				}

				//System.out.println(" iCh = <" + iCh + "> " + text);


			}

		}

		//System.out.println(text);

		return text;
	}


	
	public static String replaceAtIndex (String text, int removeStart, int removeEnd, String newInsert) //Will replace all values between removeStart and removeEnd (inclusive)
	{
		String newText = text.substring(0, removeStart) + newInsert + text.substring(removeEnd+1);
		return newText;
	}
	
	public static String insertAtIndex (String text, int insertStart, String newInsert) //Will insert the given string newInsert beginning at the specified starting index
	{
		String newText = text.substring(0, insertStart) + newInsert + text.substring(insertStart);
		return newText;
	}

}





