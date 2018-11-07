package UE_classes;

import People_side.Teacher;

import java.util.ArrayList;
import java.util.List;

public class ObservableClass extends Class {
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
    public void setCredits(int creds){}

    /*
     * Setter for hours
     *
     * inputs: int
     * outputs: void
     * */
    public void setNHours(int hours){}

    /*
     * Adds a teacher to the teacher list
     *
     * inputs: People_side.Teacher
     * outputs: void
     * */
    public void addTeacher(Teacher teacher){}

    /*
     * Deletes a teacher from the teacher list
     *
     * inputs: int (mapped ID)
     * outputs: void
     * */
    public void delTeacher(int ID){}

    /*
     * Notifies all observers they should update
     *
     * inputs: void
     * outputs: void
     * */
    public void notifyObservers(){}
}
