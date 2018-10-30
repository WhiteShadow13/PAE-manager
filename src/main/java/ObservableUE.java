import java.util.ArrayList;
import java.util.List;

public class ObservableUE extends UE {
    private List<ObserverUE> observers;
    private List<ObservableClass> classes;

    public ObservableUE(String name, String code){
        super(name, code);
        this.observers = new ArrayList<ObserverUE>();
        this.classes = new ArrayList<ObservableClass>();
    }

    // override of setInfoSheet may be necessary if the protected
    // method is too restricting, for now it should do

    /*
     * Setter for credits, int will probably be calculated
     * using the sum of ObservableClass's credits
     *
     * inputs: int
     * outputs: void
     * */
    public void setCredits(){}

    /*
     * Setter for hours, int will probably be calculated
     * using the sum of ObservableClass's hours
     *
     * inputs: int
     * outputs: void
     * */
    public void setHours(){}

    /*
     * Calculates total credits from UE classes and
     * modifies credits
     *
     * inputs: void
     * outputs: void
     * */
    public void calcCredits(){};

    /*
     * Calculates total hours from UE classes and
     * modifies nhours
     *
     * inputs: void
     * outputs: void
     * */
    public void calcHours(){};

    /*
     * Goes through all the observers and updates them
     *
     * inputs: void
     * outputs: void
     * */
    public void notifyObserver(){}
}
