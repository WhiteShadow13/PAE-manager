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
    public void validate(){};

    /*
     * Used in ObservableClass to update all observer
     * classes, puts the hours up to date
     *
     * inputs: int (hours)
     * outputs: void
     * */
    public void update(){};
}
