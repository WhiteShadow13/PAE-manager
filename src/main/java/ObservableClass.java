import java.util.ArrayList;
import java.util.List;

public class ObservableClass extends Class{
    private List<ObserverClass> observers;

    public ObservableClass(String name, String code){
        super(name, code);
        this.observers = new ArrayList<ObserverClass>();
    }

    /*
     * Setter for credits
     *
     * inputs: int
     * outputs: void
     * */
    public void setCredits(){}

    /*
     * Setter for hours
     *
     * inputs: int
     * outputs: void
     * */
    public void setNHours(){}

    /*
     * Adds a teacher to the teacher list
     *
     * inputs: Teacher
     * outputs: void
     * */
    public void addTeacher(){}

    /*
     * Deletes a teacher from the teacher list
     *
     * inputs: Teacher
     * outputs: void
     * */
    public void delTeacher(){}

    /*
     * Notifies all observers they should update
     *
     * inputs: void
     * outputs: void
     * */
    public void notifyObservers(){}
}
