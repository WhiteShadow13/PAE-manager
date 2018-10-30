import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Teacher extends Human {
    final private int ID;
    private List<Date> schedule;
    private String background;

    public Teacher(String name, String lastname, int ID){
        super(name, lastname);
        this.ID = ID;
        this.schedule = new ArrayList<Date>();
        this.background = "Maths";
    }

    /*
     * Getter for ID
     *
     * inputs: void
     * outputs: int
     * */
    public void getID(){}

    /*
     * Getter for schedule
     *
     * inputs: void
     * outputs: List<Date>
     * */
    public void getSchedule(){}

    /*
     * Setter for a UE's info sheet
     *
     * inputs: ObservableUE, string (path to info sheet)
     * outputs: void
     * */
    public void setInfoSheet(){}

    /*
     * Setter for a UE's credits
     *
     * inputs: ObservableUE, int
     * outputs: void
     * */
    public void setCredits(){}

    /*
     * Setter for UE's hours
     *
     * inputs: ObservableUE, int
     * outputs: void
     * */
    public void setNHours(){}

    /*
     * Gets a student's history of student programs
     *
     * inputs: int (student matricule)
     * outputs: List<StudentProgram>
     * */
    public void getStudentPAE(){}

    /*
     * Accept a student into an UE, therefore turning the
     * acepted_status of that students ObserverUE to true
     *
     * inputs: int (matricule)
     * outputs: void
     * */
    public void acceptStudent(){}
}
