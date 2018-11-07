package UE_classes;

import UE_classes.Class;

public class ObserverClass extends Class {
    private Boolean validated;

    public ObserverClass(String name, String code){
        super(name, code);
        this.validated = false;
    }

    /*
     * Validates the class when used, if class is already
     * validated then it will invalidate it
     *
     * inputs: void
     * outputs: void
     * */
    public void validate(){
        if (this.validated){
            this.validated = false;
        } else {
            this.validated = true;
        }
    }

    /*
     * Used in UE_classes.ObservableClass to update all observer
     * classes, puts the hours up to date
     *
     * inputs: int (hours)
     * outputs: void
     * */
    public void update(int hours){
        this.setNHours(hours);
    }

    /*
     * Necessary for unit tests
     *
     * inputs: void
     * outputs: Boolean
     * */
    public Boolean getValidate(){ return this.validated; }
}
