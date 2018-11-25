package ECAM_side;

import People_side.Student;
import People_side.Teacher;

import java.util.Map;
import java.util.HashMap;

public class ECAM {
    private static ECAM instance = new ECAM();
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
     * outputs: ECAM_side.ECAM
     * */
    public static ECAM getInstance(){
        return instance;
    }

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
     * outputs: ECAM_side.Orientation
     * */
    public Orientation getOrientation(String code){
        return orientations.get(code);
    }

    /*
     * Adds a teacher to teacher map
     * People_side.Teacher ID will be used for mapping
     *
     * inputs: People_side.Teacher
     * outputs: void
     * */
    public void addTeacher(){}

    /*
     * Gets a specific student though its id
     *
     * input: String
     * output: Student
     * */
    public Student getStudent(String matricule){
        return students.get(matricule);
    }

    /*
     * Adds a student to student list
     * People_side.Student ID will be used for mapping
     *
     * inputs: People_side.Student
     * outputs: void
     * */
    public void addStudent(Student std){students.put(std.getID(), std);}

    public void addOrientation(String code, Orientation orn){
        orientations.put(code, orn);
    }
}
