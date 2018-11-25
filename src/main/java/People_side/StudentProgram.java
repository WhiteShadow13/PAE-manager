package People_side;

import ECAM_side.Bloc;
import ECAM_side.ECAM;
import ECAM_side.Program;
import UE_classes.ObservableUE;
import UE_classes.ObserverUE;

import java.util.*;

public class StudentProgram {
    private final String year;
    private final String academic_year;
    private final String owner;
    private int ncredits;
    private Map<String, ObserverUE> content;

    public StudentProgram(String year, String acyear, String owner) {
        this.year = year;
        this.academic_year = acyear;
        this.owner = owner;
        this.ncredits = 0;
        this.content = new HashMap<String, ObserverUE>();
    }

    /*
     * Getter for content List
     *
     * inputs: void
     * outputs: List<ObserverUE>
     * */
    public Map<String, ObserverUE> getContents(){
        return content;
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
    public void addContent(String year, String code){
        ECAM ecam = ECAM.getInstance();
        int int_year = Integer.parseInt(year.substring(0, 1));
        String orientation =  year.substring(1);

        ObservableUE ue = new ObservableUE("", "");
        if (int_year <= 3) {
            ue = ecam.getOrientation(orientation).getBachelor().getBloc(int_year).getContent(code);
        } else {
            int_year = int_year - 3;
            ue = ecam.getOrientation(orientation).getMaster().getBloc(int_year).getContent(code);
        }
        ObserverUE obs_ue = new ObserverUE(ue.getName(), code, owner);
        ue.duplicate(obs_ue);

        content.put(obs_ue.getName(), obs_ue);
    }

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
    public int calcCredits(){
        int creds = 0;
        Iterator it = content.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            ObserverUE obs_ue = (ObserverUE)pair.getValue();
            creds += obs_ue.getCredits();
        }
        return creds;
    }

    /*
     * Calculates the total amount of hours
     * for a year by going through all the
     * program content and summing hours
     *
     * inputs: void
     * outputs: int
     * */
    public int calcHours(){return 0;}

    /*
     * Calculates the total amount of valid
     * credits for a year
     *
     * inputs: void
     * outputs: int
     * */
    public int calcValidCredits(){return 0;}

    /*
     * Get a list of all UEs of the program
     *
     * inputs: void
     * outputs: List<UE>
     * */
    public Map<String, ObserverUE> getUES() {return content;}
}
