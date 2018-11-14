package UE_classes;

import ECAM_side.ECAM;
import People_side.Student;
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
    public void setNHours(int hours){
        this.nhours = hours;
    }

    /*
     * Adds a teacher to the teacher list
     *
     * inputs: People_side.Teacher
     * outputs: void
     * */
    public void addTeacher(Teacher teacher){
        this.teachers.put(teacher.getID(), teacher);
    }

    /*
     * Deletes a teacher from the teacher list
     *
     * inputs: int (mapped id)
     * outputs: void
     * */
    public void delTeacher(int id){
        this.teachers.remove(id);
    }

    /*
     * Fetch an ObserverClass through its id
     *
     * inputs: int (mapped id)
     * outputs: ObserverClass
     * */
    public ObserverClass fetchObserver(String owner, int class_id){
        Student student = ECAM.getInstance().getStudent(owner);

        //NOT YET IMPLEMENTED
        return new ObserverClass("NOT", "YET", "IMPLEMENTED");
    }

    /*
     * Used when a student duplicates the parent UE
     * and puts it in his program. Will update this class and add
     * the ObservableClass to the observer list
     *
     * !Allows the observer to trigger an update instead of having!
     * !to wait for the observable to trigger one                 !
     *
     * ->update specific Observable only
     *
     * inputs: int (mapped ID)
     * outputs: void
     * */
    public void duplicate(String owner, int id){
        for (ObserverClass elem: observers) {
            if (id == elem.getID()) {
                elem.update(this.getNHours());
                return;
            }
        }

        ObserverClass obs = this.fetchObserver(owner, id);
        this.observers.add(obs);
        obs.update(this.getNHours());
    }

    /*
     * Notifies all observers they should update
     *
     * inputs: void
     * outputs: void
     * */
    public void notifyObservers(){
        for (ObserverClass observer: observers) {
            observer.update(nhours);
        }
    }

    /* TESTING
     * Getter necessary for testing
     *
     * inputs: void
     * outputs: List<ObserverClass>
     * */
    public List<ObserverClass> getObservers(){ return this.observers; }
}
