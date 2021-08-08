/**
 * Class Name: Tree 
 * 
 * Creates a BST of students 
 * 
 * This class is primarily used to build a BST of students by inserting them one at a time. Additionally, it can be used to search
 * the tree, traverse it and print the results to a text file.
 * 
 * @author Calvin Giese
 * @version version 1.0
 * @since August 7, 2021
 *
 */

public class Tree {
	
	/**
	 * The root student of the tree
	 */
	private Student root;
	
	/**
	 * Constructs the tree, beginning with a null root
	 * 
	 */
	public Tree() {
		setRoot(null);
	}
	
	/**
	 * This method allows a student to be added/inserted into the tree in the correct spot, deciding between a root, left and right
	 * child position until the proper spot is found.
	 * 
	 * @param student
	 */
	public void insert(Student student) {
		
		if(student == null) {
			return;
		}
		
		student.setLeft(null);
		student.setRight(null);
		
		/**
		 * Sets the student to the root if the tree is empty
		 */
		if(isEmpty()) {
			root = student;
		}
		else {
			// Starts with the root and checks for the proper location to insert the new student
			Student cursor = root;
			while(true) {
				Student parent = cursor;
				// Left or right child decision
				if(student.getId() <= cursor.getId()) {
					cursor = cursor.getLeft();
					if(cursor == null) {
						parent.setLeft(student);
						return;
					}
				}
				else if(student.getId() > cursor.getId()) {
					cursor = cursor.getRight();
					if(cursor == null) {
						parent.setRight(student);
						return;
					}
				}
			}
		}
	}
	
	/**
	 * Method used to set the root of the tree with the student provided
	 * 
	 * @param root is the student to be set as the root of the tree
	 */
	private void setRoot(Student root) {
		this.root = root;
	}
	
	/**
	 * Method used to retrieve the root student of the tree
	 * 
	 * @return the root student
	 */
	Student getRoot() {
		return root;
	}
	
	/**
	 * This method is used to check if the tree is empty or not
	 * 
	 * @return a true or false of whether the tree is empty
	 */
	public boolean isEmpty() {
		if(getRoot() == null) {
			return true;
		}
		return false;
	}
	
	/**
	 * This method traverses the tree from left to right and prints the students in order from lowest to highest (in this case, by
	 * their id number which directly corresponds to the alphabetical order of their last name)
	 * 
	 * @param cursor is the student used to traverse the tree
	 */
	public void inOrderTraverse(Student cursor) {
		if(cursor!= null) {
			inOrderTraverse(cursor.getLeft());
			System.out.println(cursor);
			inOrderTraverse(cursor.getRight());
		}
	}
}
