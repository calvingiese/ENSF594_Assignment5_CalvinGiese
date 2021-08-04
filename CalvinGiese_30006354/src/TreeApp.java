import java.io.FileNotFoundException;

public class TreeApp {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		TextReader readText = new TextReader();
		String[] textArray = readText.getTextArray();
		
		for(int i = 0; i < textArray.length; i++) {
			Student newStudent = new Student(textArray[i]);
			newStudent.setNumber(textArray[i]);
			newStudent.setLastName(textArray[i]);
			newStudent.setHomeDepartment(textArray[i]);
			newStudent.setProgram(textArray[i]);
			newStudent.setYear(textArray[i]);
		}
		
		
	}
}
