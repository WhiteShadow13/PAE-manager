package UE_classes;

import UE_classes.UE;

import java.util.ArrayList;
import java.util.List;

public class ObserverUE extends UE {
    private Boolean validated;
    private Boolean accept_status;
    private List<ObserverClass> classes;

    public ObserverUE(String name, String code){
        super(name, code);
        this.validated = false;
        this.accept_status = false;
        this.classes = new ArrayList<ObserverClass>();
    }

    /*
    * When called, validates the UE_classes.UE. If called again,
    * unvalidated the UE_classes.UE
    *
    * inputs: void
    * outputs: void
    * */
    public void validate(){}

    /*
     * Gettter for accepted_status to know whether
     * a teacher accepted a student into an UE_classes.UE or not
     *
     * inputs: void
     * outputs: Boolean
     * */
    public Boolean getStatus(){return true;}

    /*
     * Calculates total validated credits from UE_classes.UE classes and
     * sends them back as an int
     *
     * inputs: void
     * outputs: int
     * */
    public void calcValidCredits(){}

    /*
     * Function called whenever a change happens in corresponding
     * UE_classes.ObservableUE, should recalculate hours and credits and update
     * the info sheet -> calculated in Observable
     *
     * inputs: int, int (credits, hours)
     * outputs: void
     * */
    public void update(){}

    /*
     * validate getter necessary for testing
     *
     * inputs: void
     * outputs: Boolean
     * */
    public Boolean testValidate(){return this.validated;}

    /*
     * Modifies params for testing
     *
     * inputs: void
     * outputs: void
     * */
    public void testSetParam(){
        this.accept_status = true;
        this.classes.add(new ObserverClass("SA4L", "1E0101"));
    }
}
