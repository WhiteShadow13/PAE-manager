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
    public String getCode(){return "";}

    /*
     * Getter for class hours
     *
     * inputs: void
     * outputs: int
     * */
    public int getHours(){return 0;}

    /*
     * Getter for class credits
     *
     * inputs: void
     * outputs: int
     * */
    public int getCredits(){return 0;}

    /*
    * Setter for infosheet, protected because Observer's
    * access to this should be limited
    *
    * inputs: string (path to infosheet)
    * outputs: void
    * */
    protected void setInfoSheet(String path){}

    /*
     * Getter for class infosheet
     *
     * inputs: void
     * outputs: String (path to infosheet)
     * */
    public String getInfoSheet(){return "";}

    /*
     * Used in unit tests to modify private params
     *
     * inputs: void
     * outputs: void
     * */
    public void testSetParam(){
        this.nhours = 0;
    }
}
