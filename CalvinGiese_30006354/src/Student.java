/**
 * Class Name: Student
 * 
 * Creates a student from the provided student details and their id.
 * 
 * This class is used to create a new student and extract all of their information from the provided text. It is also meant
 * to work in combination with the Tree class to create a BST of students.
 * 
 * @author Calvin Giese
 * @version version 1.0
 * @since August 7, 2021
 *
 */

public class Student {

	private String number;
	private String lastName;
	private String homeDepartment;
	private String program;
	private String year;
	private int id;
	private Student left, right;
	
	/**
	 * Constructs the student with appropriate null & 0 values to begin
	 * 
	 * @param studentInfo is the string that includes all of the student's info
	 * @param id is the id number, based on the order of the last name
	 */
	public Student(String studentInfo, int id) {
		this.number = null;
		this.lastName = null;
		this.homeDepartment = null;
		this.program = null;
		this.year = null;
		this.id = 0;
		setLeft(null);
		setRight(null);
	}
	
	/**
	 * This method extracts the student number from the general student descriptive string
	 * 
	 * @param student is the string that includes all details
	 */
	public void setNumber(String student) {
		StringBuffer b1 = new StringBuffer();
		for(int i = 1; i < 8; i++) {
			if(student.charAt(i) == ' ') {
				break;
			}
			b1.append(student.charAt(i));
		}
		this.number = b1.toString();
	}
	
	/**
	 * This method extracts the student's last name from the general student descriptive string
	 * 
	 * @param student is the string that includes all details
	 */
	public void setLastName(String student) {
		StringBuffer b1 = new StringBuffer();
		for(int i = 8; i < 33; i++) {
			if(student.charAt(i) == ' ') {
				break;
			}
			else{
				b1.append(student.charAt(i));
			}
		}
		this.lastName = b1.toString();
	}
	
	/**
	 * This method extracts the student's home department from the general student descriptive string
	 * 
	 * @param student is the string that includes all details
	 */
	public void setHomeDepartment(String student) {
		StringBuffer b1 = new StringBuffer();
		for(int i = 33; i < 37; i++) {
			b1.append(student.charAt(i));
			}

		this.homeDepartment = b1.toString();
	}
	
	/**
	 * This method extracts the student's program from the general student descriptive string
	 * 
	 * @param student is the string that includes all details
	 */
	public void setProgram(String student) {
		StringBuffer b1 = new StringBuffer();
		for(int i = 37; i < 41; i++) {
			if(student.charAt(i) == ' ') {
				break;
			}
			b1.append(student.charAt(i));
		}
		this.program = b1.toString();
	}
	
	/**
	 * This method extracts the student year from the general student descriptive string
	 * 
	 * @param student is the string that includes all details
	 */
	public void setYear(String student) {
		StringBuffer b1 = new StringBuffer();
		for(int i = 41; i < 42; i++) {
			if(student.charAt(i) == ' ') {
				break;
			}
			b1.append(student.charAt(i));
		}
		this.year = b1.toString();
	}
	
	/**
	 * This method sets the student id from the provided value
	 * 
	 * @param student is the string that includes all details
	 */
	public void setId(int Id) {
		this.id = Id;
	}
	
	/**
	 * Sets the left pointer
	 * 
	 * @param left is the pointer to the left child
	 */
	public void setLeft(Student left) {
		this.left = left;
	}
	
	/**
	 * Sets the right pointer
	 * 
	 * @param right is the pointer to the right child
	 */
	public void setRight(Student right) {
		this.left = right;
	}
	
	/**
	 * This method is used to retrieve the student's number
	 * 
	 * @return the student number
	 */
	public String getNumber() {
		return this.number;
	}
	
	/**
	 * This method is used to retrieve the student's last name
	 * 
	 * @return the student last name
	 */
	public String getLastName() {
		return this.lastName;
	}
	
	/**
	 * This method is used to retrieve the student's home department
	 * 
	 * @return the student home department
	 */
	public String getHomeDepartment() {
		return this.homeDepartment;
	}
	
	/**
	 * This method is used to retrieve the student's program
	 * 
	 * @return the student program
	 */
	public String getProgram() {
		return this.program;
	}
	
	/**
	 * This method is used to retrieve the student's year
	 * 
	 * @return the student year
	 */
	public String getYear() {
		return this.year;
	}
	
	/**
	 * This method is used to retrieve the student's id
	 * 
	 * @return the student id
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * This method is used to retrieve the left child
	 * 
	 * @return the left child
	 */
	public Student getLeft() {
		return left;
	}
	
	/**
	 * This method is used to retrieve the right child
	 * 
	 * @return the right child
	 */
	public Student getRight() {
		return right;
	}
	
	/**
	 * This method can be used to show the student's last name and their id
	 * 
	 */
	public String toString() {
		return this.lastName + ", " + this.getId();
	}	
}
