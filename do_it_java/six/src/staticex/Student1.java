package staticex;

public class Student1 {
	public static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student1() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStduentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	
}
