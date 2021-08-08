import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class Name: TextReader
 * 
 * Reads an input file which contains a list of students and their corresponding details.
 * 
 * This class is used read in the input file and return an array of strings, one for each student.
 * 
 * @author Calvin Giese
 * @version version 1.0
 * @since August 7, 2021
 *
 */

public class TextReader {
	
	/**
	 * The array of to fill with lines in the input file.
	 */
	private String[] arrString;
	
	/**
	 * Constructs the TextReader with a blank array to begin.
	 */
	public TextReader () {
		this.arrString = null;
	}

	/**
	 * This method is used to find the words included in the input text file.
	 * 
	 * @return the array of words found in the file.
	 * @throws FileNotFoundException in case the file is not found
	 */
	public String[] getTextArray() throws FileNotFoundException{
		
		// Reads the input text
		File file = new File("input.txt");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(file);		
		List<String> lines = new ArrayList<String>();
		
		while(sc.hasNextLine()) {
			lines.add(sc.nextLine());
		}
		
		String[] array = lines.toArray(new String[0]);
		
		// Counts the number of blank lines
		int nonBlanks = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] != "") {
				nonBlanks++;
			}
		}
		
		// Builds an array of words without any blank lines between
		this.arrString = new String[nonBlanks];
		
		for(int j = 0, k = 0; j < array.length; j++) {
			if(array[j] != "") {
				this.arrString[k] = array[j];
				k++;
			}
		}
		
		return this.arrString;
	}
}
