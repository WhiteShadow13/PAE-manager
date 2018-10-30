import java.util.Map;
import java.util.HashMap;

public class ECAM {
    private ECAM instance;
    private Map<String, Orientation> orientations;
    private Map<Integer, Teacher> teachers;
    private Map<Integer, Student> students;

    private ECAM(){
        this.orientations = new HashMap<String, Orientation>();
        this.teachers = new HashMap<Integer, Teacher>();
        this.students = new HashMap<Integer, Student>();
    }

    /*
     * Get singleton instance
     *
     * inputs: void
     * outputs: ECAM
     * */
    public void getInstance(){}

    /*
     * Get specific orientation, orientations will be:
     *
     * -> Automatisation
     * -> Construction
     * -> Electronique
     * -> Geometre
     * -> Informatique
     * -> Electromecanique
     *
     * inputs: string (orientation code)
     * outputs: Orientation
     * */
    public void getOrientation(){}

    /*
     * Adds a teacher to teacher map
     * Teacher ID will be used for mapping
     *
     * inputs: Teacher
     * outputs: void
     * */
    public void addTeacher(){}

    /*
     * Adds a student to student list
     * Student ID will be used for mapping
     *
     * inputs: Student
     * outputs: void
     * */
    public void addStudent(){}
}
