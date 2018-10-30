import java.util.ArrayList;
import java.util.List;

public class Student extends Human {
    private final int matricule;
    private List<StudentProgram> program;

    public Student(String name, String lastname, int matricule) {
        super(name, lastname);
        this.matricule = matricule;
        this.program = new ArrayList<StudentProgram>();
    }

    /*
    * Getter for matricule
    *
    * inputs: void
    * outputs: int
    * */
    public void getID(){}

    /*
     * Gives back the status of a class after
     * receiving the class code as an input
     *
     * inputs: string (class code)
     * outputs: Boolean (class status)
     * */
    public void getStatus(){}

    /*
     * Gets the total amount of credits for the
     * student's current program
     *
     * inputs: void
     * outputs: int
     * */
    public void getCredits(){}

    /*
     * Gets the total amount of validated credits
     * for the student's current program
     *
     * inputs:
     * outputs:
     * */
    public void getValidCredits(){}

    /*
     * Add a new StudentProgram object to the
     * program list, representing a new year for
     * the student
     *
     * inputs: StudentProgram
     * outputs: void
     * */
    public void newProgram(){}
}
