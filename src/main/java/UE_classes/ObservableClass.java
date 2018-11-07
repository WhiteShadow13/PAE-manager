package UE_classes;

import People_side.Teacher;

import java.util.ArrayList;
import java.util.List;

public class ObservableClass extends Class {
    private List<ObserverClass> observers;

    public ObservableClass(String name, String code){
        super(name, code);
        this.observers = new ArrayList<ObserverClass>();
        this.nhours = 10;
    }

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
     * Used when a student duplicates the parent UE
     * and puts it in his program. Will update this class
     *
     * ->Simply notifyObservers for now
     *
     * inputs: int (mapped ID)
     * outputs: void
     * */
    public void duplicate(){}

    /*
     * Notifies all observers they should update
     *
     * inputs: void
     * outputs: void
     * */
    public void notifyObservers(){}

    /*
     * Getter necessary for testing
     *
     * inputs: void
     * outputs: List<ObserverClass>
     * */
    public List<ObserverClass> getObservers(){ return this.observers; }
}
