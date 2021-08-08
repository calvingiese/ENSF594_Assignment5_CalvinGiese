import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Class Name: TextPrinter
 * 
 * Prints a tree in the specified traversal order to an output file.
 * 
 * The main purpose of this class is to print student information from a BST in the specified order.
 * 
 * @author Calvin Giese
 * @version version 1.0
 * @since August 8, 2021
 *
 */

public class TextPrinter {

	/**
	 * The string of the header and students to be printed
	 */
	private String printTree;
	
	/**
	 * Constructs the TextPrinter with the array of linked lists being passed to the class and the print string being set to null to begin.
	 * 
	 * @param array is the array of linked lists that is to be printed.
	 */
	public TextPrinter() {
		this.printTree = null;
	}
	
	/**
	 * Prints the BST of students in order (depth first) along with the appropriate title and headers
	 * 
	 * @param outputString is the string to be printed.
	 */
	public void inOrderPrint(String outputString) {
		
		this.printTree = outputString;
		PrintWriter writer = null;
		
		try {
			writer = new PrintWriter("output1.txt");
			writer.println(this.printTree);
			writer.close();
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}
	
	/**
	 * Prints the BST of students in order (level by level) along with the appropriate title and headers
	 * 
	 * @param outputString is the string to be printed.
	 */
	public void levelPrint(String outputString) {
		
		this.printTree = outputString;
		PrintWriter writer = null;
		
		try {
			writer = new PrintWriter("output2.txt");
			writer.println(this.printTree);
			writer.close();
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}
}