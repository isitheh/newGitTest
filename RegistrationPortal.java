//Java Threads: Students Registration - HackerRank Solution
class RegistrationPortal {
    private RegistrationPortal mInstance;
    List<Student> mListRegisteredStudents = new ArrayList<>();
    void RegistrationPortal() {
        //Constructor no args
        mInstance = new RegistrationPortal();
    }
    
    public RegistrationPortal getRegistrationPortal() {
        //Returns the instance of the registration portal
        return mInstance;
    }
    
    void register(Student student) {
        mListRegisteredStudents.add(student);
    }
    
    List<Student> getRegisteredStudents() {
        //Returns a list of registered students
        return mListRegisteredStudents;
    }
}

public class Student {
	//Constructor
	public Student(int studentId, int studentAge, String studentName, String studentDiscipline) {
		super();
		this.studentId = studentId;
		this.studentAge = studentAge;
		this.studentName = studentName;
		this.studentDiscipline = studentDiscipline;
	}
	
	int studentId;
    int studentAge;
	String studentName;
	String studentDiscipline;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentDiscipline() {
		return studentDiscipline;
	}
	public void setStudentDiscipline(String studentDiscipline) {
		this.studentDiscipline = studentDiscipline;
	}
}