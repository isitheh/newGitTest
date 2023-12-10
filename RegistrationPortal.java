
import java.util.ArrayList;
import java.util.List;

//Java Threads: Students Registration - HackerRank Solution
class RegistrationPortal {
    private static RegistrationPortal mInstance;
    private final static List<Student> mListRegisteredStudents = new ArrayList<>();
    void RegistrationPortal() {
        //Constructor no args
        mInstance = new RegistrationPortal();
    }
    
    public static RegistrationPortal getRegistrationPortal() {
        //Returns the instance of the registration portal
        return mInstance;
    }
    
    public void register(Student student) {
        synchronized(mListRegisteredStudents) {
            mListRegisteredStudents.add(student);
        }
    }
    
    public List<Student> getRegisteredStudents() {
        //Returns a list of registered students
        return mListRegisteredStudents;
    }
}

class Student {
    //Constructor
    public Student(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    int id;
    String name;

    public int getid() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNme() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}