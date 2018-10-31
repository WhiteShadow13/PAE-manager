package UE_classes;

public class UE {
    private final String name;
    private final String code;
    private int nhours;
    private int credits;
    private String info_sheet;

    public UE(String name, String code) {
        this.name = name;
        this.code = code;
    }

    /*
    * Getter for class code
    *
    * inputs: void
    * outputs: String
    * */
    public void getCode(){}

    /*
     * Getter for class hours
     *
     * inputs: void
     * outputs: String
     * */
    public void getHours(){}

    /*
     * Getter for class credits
     *
     * inputs: void
     * outputs: String
     * */
    public void getCredits(){}

    /*
    * Setter for infosheet, protected because Observer's
    * access to this should be limited
    *
    * inputs: string (path to infosheet)
    * outputs: void
    * */
    protected void setInfoSheet(){}

    /*
     * Getter for class infosheet
     *
     * inputs: void
     * outputs: String (path to infosheet)
     * */
    public void getInfoSheet(){}
}
