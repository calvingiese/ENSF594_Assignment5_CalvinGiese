
public class Student {

	private int number;
	
	private String lastName;
	
	private int homeDepartment;
	
	private String program;
	
	private int year;
	
	public Student(String studentInfo) {
		
		this.number = 0;
		this.lastName = null;
		this.homeDepartment = 0;
		this.program = null;
		this.year = 0;
	}
	
	public void setNumber(String student) {
		StringBuffer b1 = new StringBuffer();
		for(int i = 1; i < 8; i++) {
			if(student.charAt(i) == ' ') {
				break;
			}
			b1.append(student.charAt(i));
		}
		String temp = b1.toString();
		this.number = Integer.valueOf(temp);
	}
	
	public void setLastName(String student) {
		StringBuffer b1 = new StringBuffer();
		for(int i = 8; i < student.length(); i++) {
			if(student.charAt(i) == ' ') {
				break;
			}
			b1.append(Character.toLowerCase(student.charAt(i)));
		}
		this.lastName = b1.toString();
	}
	
	public void setHomeDepartment(String student) {
		StringBuffer b1 = new StringBuffer();
		for(int i = 33; i < 37; i++) {
			if(student.charAt(i) == ' ') {
				break;
			}
			b1.append(student.charAt(i));
		}
		String temp = b1.toString();
		this.homeDepartment = Integer.valueOf(temp);
	}
	
	public void setProgram(String student) {
		StringBuffer b1 = new StringBuffer();
		for(int i = 38; i < 42; i++) {
			if(student.charAt(i) == ' ') {
				break;
			}
			b1.append(Character.toLowerCase(student.charAt(i)));
		}
		this.program = b1.toString();
	}
	
	public void setYear(String student) {
		StringBuffer b1 = new StringBuffer();
		for(int i = 38; i < 42; i++) {
			if(student.charAt(i) == ' ') {
				break;
			}
			b1.append(student.charAt(i));
		}
		String temp = b1.toString();
		this.year = Integer.valueOf(temp);
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getHomeDepartment() {
		return this.homeDepartment;
	}
	
	public String getProgram() {
		return this.program;
	}
	
	public int getYear() {
		return this.year;
	}
}
