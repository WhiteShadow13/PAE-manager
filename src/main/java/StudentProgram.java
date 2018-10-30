import java.util.ArrayList;
import java.util.List;

public class StudentProgram {
    private final String year;
    private final String academic_year;
    private int ncredits;
    private List<UE> content;

    public StudentProgram(String year, String acyear, int cred) {
        this.year = year;
        this.academic_year = acyear;
        this.ncredits = cred;
        this.content = new ArrayList<UE>();
    }

    /*
     * Getter for content List
     *
     * inputs: void
     * outputs: List<UE>
     * */
    public void getContents(){}

    /*
     * Add content to content list thanks to
     * year and code. f.e.: 4MIN, SA4L
     *
     * inputs: string, string (year, code)
     * outputs: void
     * */
    public void addContent(){}

    /*
     * Deletes content from the list after
     * being given a code
     *
     * inputs: string (code)
     * outputs: void
     * */
    public void delContent(){}

    /*
     * Calculates the total amount of credits
     * for a year by going through all the
     * program content and summing credits
     *
     * inputs: void
     * outputs: int
     * */
    public void calcCredits(){}

    /*
     * Calculates the total amount of valid
     * credits for a year
     *
     * inputs: void
     * outputs: int
     * */
    public void calcValidCredits(){}
}
