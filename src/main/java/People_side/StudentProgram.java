package People_side;

import UE_classes.ObserverUE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentProgram {
    private final String year;
    private final String academic_year;
    private int ncredits;
    private Map<Integer, ObserverUE> content;

    public StudentProgram(String year, String acyear) {
        this.year = year;
        this.academic_year = acyear;
        this.ncredits = 0;
        this.content = new HashMap<Integer, ObserverUE>();
    }

    /*
     * Getter for content List
     *
     * inputs: void
     * outputs: List<ObserverUE>
     * */
    public List<ObserverUE> getContents(){
        return new ArrayList<ObserverUE>();
    }

    /*
     * Add content to content list thanks to
     * year and code. f.e.: 4MIN, SA4L
     * -> uses year and code to fetch an ObservableUE
     * from ECAM to add a new ObserverUE to content
     *
     * inputs: string, string (year, code)
     * outputs: void
     * */
    public void addContent(String year, String code){}

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

    /*
     * Get a list of all UEs of the program
     *
     * inputs: void
     * outputs: List<UE>
     * */
    public Map<Integer, ObserverUE> getUES() {return content;}
}
