import java.io.FileNotFoundException;

/**
 * Class Name: TreeApp
 * 
 * Program used to build a BST from students found in an input file list, traverse it in two different ways and output the results.
 * 
 * This class is used to create new students, allocate an id number to them by alphabetizing their names and then building a BST with
 * all of the students. The tree is then traversed first In-Order and then Level-by-Level and the results are printed to an ouput text
 * file.
 * 
 * @author Calvin Giese
 * @version version 1.0
 * @since August 7, 2021
 *
 */

public class TreeApp {

	public static void main(String[] args) throws FileNotFoundException{
		
		// Reads input file and creates an array of strings, one string per student
		TextReader readText = new TextReader();
		String[] textArray = readText.getTextArray();
		
		// Determines student list length and creates all necessary variables to build the BST
		int length = textArray.length;
		String[] listNames = new String[length];
		String[] orderedNames = new String[length];
		int[] id = new int[length];
		int[] orderedId = new int[length];
		String temp;
		
		// Creates list of student last names to be sorted alphabetically
		for(int i = 0; i < length; i++) {			
			Student newStudent = new Student(textArray[i], i);
			newStudent.setLastName(textArray[i]);
			String lastName = newStudent.getLastName();
			listNames[i] = lastName;
			orderedNames[i] = lastName;
		}
		
		// Sorts last names alphabetically
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				if(orderedNames[j].compareTo(orderedNames[i]) > 0) {
					temp = orderedNames[i];
					orderedNames[i] = orderedNames[j];
					orderedNames[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < length; i++) {
			orderedId[i] = i + 1;
		}
		
		// Array of student id's that matches the id to their alphabetical last name placement 
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				if(listNames[i] == orderedNames[j]) {
					id[i] = orderedId[j];
				}
			}
		}
		
		// Builds BST from the students listed in the input file
		Tree newTree = new Tree();
		
		for(int i = 0; i < length; i++) {
			Student myStudent = new Student(textArray[i], id[i]);
			myStudent.setLastName(textArray[i]);
			myStudent.setId(id[i]);
			newTree.insert(myStudent);
		}
		
		// Uses Depth-First, In-order traversal of the tree and prints the results to an output file
		System.out.println('\n' + "In-Order Traversal" + '\n');
		newTree.inOrderTraverse(newTree.getRoot());
		
		// Uses Level-by-Level traversal of the tree and prints the results to an output file
		
	}
}
